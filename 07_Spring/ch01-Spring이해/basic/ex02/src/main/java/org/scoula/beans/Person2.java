package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// 빈으로 자동 등록되도록 지정
@Component
public class Person2 {

    private String name;

    // Parrot2를 오토와이어를 이용해 의존성 주입 지정
    @Autowired
    private Parrot2 parrot2;

    public Parrot2 getParrot2() {
        return parrot2;
    }

    public void setParrot2(Parrot2 parrot2) {
        this.parrot2 = parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // name을 "Ella"로 지정
    @PostConstruct
    public void init() {
        this.name = "Ella";
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", parrot2=" + parrot2 +
                '}';
    }
}
