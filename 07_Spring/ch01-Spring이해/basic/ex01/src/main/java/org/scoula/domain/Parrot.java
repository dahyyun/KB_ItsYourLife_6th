package org.scoula.domain;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name; // 필드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // PostConstruct를 이용하여 빈의 name 속성을 "Kiki"로 설정
    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }
}
