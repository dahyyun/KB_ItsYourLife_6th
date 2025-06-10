package org.scoula.main;

import org.scoula.beans.Person2;
import org.scoula.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {

        // ProjectConfig2를 설정으로 컨텍스트 생성
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        // Person2 빈을 추출
        Person2 p = context.getBean(Person2.class);

        // 추출된 빈의 속성
        System.out.println("Person's name : " + p.getName());
        System.out.println("Person's parrot : " + p.getParrot2());
    }
}
