package org.scoula.main;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.scoula.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ProjectConfig를 설정으로 컨텍스트 생성
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Person과 Parrot 빈을 추출
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        // 추출된 빈의 속성 출력
        System.out.println("Person's name : " + person.getName());
        System.out.println("Parrot's name : " + parrot.getName());
        System.out.println("Person's parrot : " + person.getParrot());
    }
}
