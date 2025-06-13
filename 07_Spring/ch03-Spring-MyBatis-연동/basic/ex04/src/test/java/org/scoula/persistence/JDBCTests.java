package org.scoula.persistence;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

@Log4j2
public class JDBCTests {

    // 테스트 전체 실행 전에 딱 한 번 실행되는 초기 설정 함수
    // 여기서는 드라이버를 미리 등록해서 DB 연결이 가능하게 만들어줌
    @BeforeAll
    public static void setup() {
        try {
            // MySQL JDBC 드라이버 로드
            // Class.forName() : 드라이버 클래스를 찾아서 JVM에 로드해주는 메서드
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 실행 시 자동으로 호출
    @Test
    // 테스트 이름을 사람이 보기 쉽게 표현
    @DisplayName("JDBC 드라이버 연결이 되었습니다.")
    public void testConnection() {
        // 데이터베이스 연결 URL
        // 접속할 DB 주소 : jdbc:mysql://localhost:3306/scoula_db
        // 데이터베이스명 : scoula_db
        String url = "jdbc:mysql://localhost:3306/scoula_db";

        // try-with-resources로 자동 자원 해제
        // 사용자명 : scoula
        try(Connection con = DriverManager.getConnection(url, "scoula", "1234")) {
            log.info("JDBC 연결 성공 !");
            log.info("연결 객체 : {}", con);
        } catch (Exception e) {
            fail("데이터베이스 연결 실패 : " + e.getMessage());
        }
    }

}
