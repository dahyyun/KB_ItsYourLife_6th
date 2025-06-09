package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// Parrot 클래스를 컴포넌트 스캔을 통해 빈으로 자동 등록되도록 ProjectConfig3 설정 클래스를 정의
@ComponentScan(basePackages = "org.scoula.domain")
public class ProjectConfig3 {
    @Bean
    Parrot parrot1() {
        Parrot parrot1 = new Parrot();
        parrot1.setName("Koko");
        return parrot1;
    }

    @Bean
    Parrot parrot2() {
        Parrot parrot2 = new Parrot();
        parrot2.setName("Miki");
        return parrot2;
    }

    @Bean
    Parrot parrot3() {
        Parrot parrot3 = new Parrot();
        parrot3.setName("Riki");
        return parrot3;
    }
}
