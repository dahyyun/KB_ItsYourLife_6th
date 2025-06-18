package org.scoula.jdbc_ex.common;

import java.sql.*;
import java.util.Properties;
import java.io.InputStream;

public class JDBCUtil {

    private static String driver;
    private static String url;
    private static String id;
    private static String password;

    static {
        try {
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("application.properties");
            Properties props = new Properties();
            props.load(is);

            driver = props.getProperty("driver");
            url = props.getProperty("url");
            id = props.getProperty("id");
            password = props.getProperty("password");

            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, id, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {}
        try {
            if (stmt != null) stmt.close();
        } catch (Exception e) {}
        try {
            if (conn != null) conn.close();
        } catch (Exception e) {}
    }

    public static void close(Connection conn, Statement stmt) {
        close(conn, stmt, null);
    }
}