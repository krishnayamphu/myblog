package com.ky.database.autotables;

import com.ky.database.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostTable {
    public static void create(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "CREATE TABLE posts (id int PRIMARY KEY AUTO_INCREMENT, title varchar(256) not null, text text, picture varchar(256), category_id int, user_id int, created_at timestamp default CURRENT_TIMESTAMP, updated_at timestamp default CURRENT_TIMESTAMP, UNIQUE(title))";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Posts Table Created");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static void remove(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "DROP TABLE posts";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Posts Table Deleted");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
