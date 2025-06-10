package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// 빈으로 자동 등록되도록 지정
@Component
public class Person3 {
    private String name;

    // Parrot2를 생성자 주입을 통해 자동 설정
    private final Parrot2 parrot2; // final 추천 (불변 의존성)

    public Person3(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }

    public Parrot2 getParrot2() {
        return parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Ella";
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", parrot2=" + parrot2 +
                '}';
    }
}
