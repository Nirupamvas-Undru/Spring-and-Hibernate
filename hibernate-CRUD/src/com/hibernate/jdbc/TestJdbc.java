package com.hibernate.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "hbstudent"; // mod

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection mycon = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
