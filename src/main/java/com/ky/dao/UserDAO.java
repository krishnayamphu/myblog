package com.ky.dao;

import com.ky.database.ConnectDB;
import com.ky.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static void addUser(User user) {
        try {
            Connection cn = ConnectDB.connect();
            String sql = "INSERT INTO users (username,email,password) VALUES (?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3,user.getPassword());
            ps.executeUpdate();
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static boolean auth(String username, String password) {
        boolean status=false;
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                status=true;
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        System.out.println(status);
        return status;
    }
}
