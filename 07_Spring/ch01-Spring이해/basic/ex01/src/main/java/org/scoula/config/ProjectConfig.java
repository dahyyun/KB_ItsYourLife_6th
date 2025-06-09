package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링의 Configuration 클래스로 정의
@Configuration
public class ProjectConfig {
    // Parrot을 빈으로 등록
    @Bean
    Parrot Parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
