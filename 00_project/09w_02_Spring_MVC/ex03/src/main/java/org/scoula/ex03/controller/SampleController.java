package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.ex03.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
// 공통 url을 "/sample"로 설정
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    // /sample 경로에 대한 모든 요청 메서드에 대해 호출하는 basic() 메서드 작성
    @RequestMapping("")
    public void basic() {
        // 요청이 왔을 경우 "basic......." 출력
        log.info("basic............");
    }

    // /sample/basic 경로의 GET, POST 요청에 호출되는 basicGet() 메서드 작성
    @GetMapping("/basic")
    @PostMapping("/basic")
    public void basicGet() {
        // 요청이 왔을 경우 로그로 "basic get......" 출력
        log.info("basic get............");
    }

//    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
//    public void basicGet() {
//        // 요청이 왔을 경우 로그로 "basic get......" 출력
//        log.info("basic get............");
//    }

    // /sample/basicOnlyGet 경로의 GET 요청에 호출되는 basicGet2() 메서드 작성
    @GetMapping("/basicOnlyGet")
    public void basicGet2() {
        // 요청이 왔을 경우 로그로 "basic get only get......." 출력
        log.info("basic get only get............");
    }

    // 요청 url: http://localhost:8080/sample/ex04 ~ ..
    @GetMapping("/ex04")
    // page는 단순 int 처리
    public String ex04(SampleDTO dto, @RequestParam("page") int page, Model model) {
        // 로그로 SampleDTO와 page 출력
        log.info("dto : " + dto);
        log.info("page : " + page);

        // 뷰에서 사용할 데이터 : dto, page
        model.addAttribute("dto", dto);
        model.addAttribute("page", page);

        // sample/ex04 뷰에서 SampleDTO와 page 출력
        return "sample/ex04";
    }

    @GetMapping("/ex05")
    public void ex05() {
        log.info("/ex05...........");
    }

    @GetMapping("/ex06")
    public String ex06(RedirectAttributes rs) {
        rs.addAttribute("name", "AAA");
        rs.addAttribute("age", 10);

        return "redirect:/sample/ex06-2";
    }

}
