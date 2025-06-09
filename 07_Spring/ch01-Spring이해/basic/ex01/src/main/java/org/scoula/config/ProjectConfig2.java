package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;

public class ProjectConfig2 {
    
    // 3개의 Parrot 빈을 등록
    @Bean
    Parrot parrot1() {
        Parrot parrot1 = new Parrot();
        parrot1.setName("Koko");
        return parrot1;
    }

    // Parrot2의 빈 이름을 "miki"로 설정
    @Bean(name = "miki")
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
