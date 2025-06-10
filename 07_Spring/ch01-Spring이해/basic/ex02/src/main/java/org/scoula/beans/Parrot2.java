package org.scoula.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// 자동 등록되도록 지정
@Component
public class Parrot2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 빈이 초기화된 후 실행되는 메서드
    // name을 "Koko"로 지정
    @PostConstruct
    public void init() {
        this.name = "Koko";
    }

    @Override
    public String toString() {
        return "Parrot2{" +
                "name='" + name + '\'' +
                '}';
    }
}
