/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            // Tải driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Đọc thông tin từ config.properties
            Properties props = new Properties();
            
            try (InputStream input = ConnectionProvider.class.getClassLoader().getResourceAsStream("config.properties")) {
                if (input == null) {
                    System.out.println("Sorry, unable to find config.properties");
                    return null;
                }
                props.load(input);
            }

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            // Kết nối với MySQL
            con = DriverManager.getConnection(url, user, password);

            // Kiểm tra nếu database chưa tồn tại, thì tạo mới và import dữ liệu
            initializeDatabase(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    private static void initializeDatabase(Connection con) {
        try (Statement stmt = con.createStatement()) {
            // Kiểm tra và tạo database nếu chưa có
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS military_uniforms");
            stmt.executeUpdate("USE military_uniforms");

            // Import dữ liệu từ file .sql nếu database mới được tạo
            executeSqlFile(con, "src/main/resources/database/database_backup.sql");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeSqlFile(Connection con, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             Statement stmt = con.createStatement()) {

            String line;
            StringBuilder sql = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sql.append(line);
                if (line.trim().endsWith(";")) {
                    // Thực thi câu lệnh SQL hoàn chỉnh
                    stmt.execute(sql.toString());
                    sql.setLength(0); // Xóa câu lệnh đã thực thi
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
