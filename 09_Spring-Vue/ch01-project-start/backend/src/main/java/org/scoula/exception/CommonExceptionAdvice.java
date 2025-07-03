package org.scoula.exception;


import lombok.extern.log4j.Log4j2;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
@Order(1)
public class CommonExceptionAdvice {

    /* 404 오류 (요청한 URL에 해당하는 컨트롤러가 없을 때) 이 메서드 실행 */
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404(NoHandlerFoundException ex) {
        log.error(ex);
        /* 강제로  index.html로 포워딩 */
        return "/resources/index.html";
    }

}