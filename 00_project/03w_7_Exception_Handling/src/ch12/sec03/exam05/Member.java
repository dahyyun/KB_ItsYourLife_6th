package ch12.sec03.exam05;


import lombok.*;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 전체 필드를 초기화하는 생성자
@Getter // Getter 메서드
@Setter // Setter 메서드
@EqualsAndHashCode // equals(), hashCode() 메서드
@ToString // toString() 메서드

public class Member {
    private String id;
    private String name;
    private int age;
}
