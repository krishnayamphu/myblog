package com.ky.database.autotables;

import com.ky.database.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryTable {
    public static void create(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "CREATE TABLE category (id int PRIMARY KEY AUTO_INCREMENT, name varchar(256) not null, description varchar(256), created_at timestamp default CURRENT_TIMESTAMP, updated_at timestamp default CURRENT_TIMESTAMP, UNIQUE(name))";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Category Table Created");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    public static void remove(){
        try {
            Connection cn = ConnectDB.connect();
            String sql = "DROP TABLE category";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Category Table Deleted");
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
