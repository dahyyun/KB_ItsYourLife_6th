package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.scoula.common.util.UploadFiles;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final private BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        log.info("getList..........");

        return mapper.getList().stream()	// BoardVO의 스트림
                .map(BoardDTO::of)			// BoardDTO의 스트림
                .toList();								// List<BoardDTO> 변환
    }

    @Override
    public BoardDTO get(Long no) {
        log.info("get......" + no);

        BoardDTO board = BoardDTO.of(mapper.get(no));
        return Optional
                .ofNullable(board)
                .orElseThrow(NoSuchElementException::new);

    }

    private final static String BASE_DIR = "c:/upload/board";

    /* create() 메서드 수정 */
    // 게시글 등록 서비스
    @Transactional   // 여러 DB 작업을 하나의 트랜잭션으로 처리
    @Override
    public BoardDTO create(BoardDTO board) {
        log.info("create......" + board);

        // 1. 게시글 등록
        BoardVO vo = board.toVo();         // DTO → VO 변환
        mapper.create(vo);            // DB에 저장

        // 2. 첨부파일 처리
        List<MultipartFile> files = board.getFiles();
        if (files != null && !files.isEmpty()) {
            upload(vo.getNo(), files);  // 게시글 번호가 필요하므로 게시글 등록 후 처리
        }

        // 생성된 게시글의 전체 정보를 반환
        return get(vo.getNo());
    }

    private void upload(Long bno, List<MultipartFile> files) {
        for(MultipartFile part: files) {
            if(part.isEmpty()) continue;
            try {
                String uploadPath = UploadFiles.upload(BASE_DIR, part);
                BoardAttachmentVO attach = BoardAttachmentVO.of(part, bno, uploadPath);
                mapper.createAttachment(attach);
            } catch (IOException e) {
                throw new RuntimeException(e);   // @Transactional에서 감지, 자동 rollback
            }
        }
    }


    // 게시글 수정 서비스
    @Override
    public BoardDTO update(BoardDTO board) {
        log.info("update......" + board);

        mapper.update(board.toVo());  // 게시글 수정 수행
        // 수정된 게시글 정보를 반환
        return get(board.getNo());
    }

    // 게시글 삭제 서비스
    @Override
    public BoardDTO delete(Long no) {
        log.info("delete...." + no);

        // 삭제 전에 게시글 정보를 미리 조회
        BoardDTO board = get(no);

        // 실제 삭제 수행
        mapper.delete(no);

        // 삭제된 게시글 정보를 반환
        return board;
    }

    // 첨부파일 한 개 얻기
    @Override
    public BoardAttachmentVO getAttachment(Long no) {
        return mapper.getAttachment(no);
    }

    // 첨부파일 삭제
    @Override
    public boolean deleteAttachment(Long no) {
        return mapper.deleteAttachment(no) == 1;
    }

}
