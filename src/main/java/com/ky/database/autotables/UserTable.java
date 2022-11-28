package com.ky.database.autotables;

import com.ky.database.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class UserTable {
    public static void create(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "CREATE TABLE users (id int PRIMARY KEY AUTO_INCREMENT, username varchar(30) not null, email varchar(256) not null, password varchar(256) not null, picture varchar(256), created_at timestamp default CURRENT_TIMESTAMP, UNIQUE(username), UNIQUE (email))";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("User Table Created");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static void remove(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "DROP TABLE users";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("User Table Deleted");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
