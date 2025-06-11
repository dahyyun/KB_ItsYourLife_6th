package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("/")
    // Model을 이용해 name 속성의 값으로 홍길동을 설정
    public String person(Model model) {
        model.addAttribute("name", "홍길동");

        // index 뷰에서 name 속성을 출력
        return "index";
    }
}
