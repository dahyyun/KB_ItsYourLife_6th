package org.scoula.jdbc_ex.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class JDBCUtilTest {

    @Test
    @DisplayName("DB 연결 테스트 결과")
    public void testConnection() throws ClassNotFoundException, SQLException {

        Connection con = null;

        // 1. 드라이버설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버설정성공..");

        // 2. 데이터베이스연결
        String url = "jdbc:mysql://localhost:3306/jdbc_ex";
        String user = "scoula";
        String password = "1234";
        con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결성공.");
        Assertions.assertNotNull(con);
    }

    @Test
    @DisplayName("DB 연결 테스트 결과2")
    public void testConnection2() {
        Connection conn = JDBCUtil.getConnection();
        Assertions.assertNotNull(conn);
        System.out.println("3. JDBCUtil로 DB 연결 성공");
    }
}