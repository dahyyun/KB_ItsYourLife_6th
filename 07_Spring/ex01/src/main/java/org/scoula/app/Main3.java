package org.scoula.app;

import org.scoula.config.ProjectConfig3;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        // ProjectConfig3을 설정 클래스로하여 Spring Context를 생성
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        
        // Parrot 빈 추출
        Parrot p = context.getBean(Parrot.class);
        
        // 추출된 Parrot의 name 출력
        System.out.println(p.getName());
    }
}
