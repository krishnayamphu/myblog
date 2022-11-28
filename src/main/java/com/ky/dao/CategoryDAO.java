package com.ky.dao;

import com.ky.database.ConnectDB;
import com.ky.models.Category;
import com.ky.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryDAO {
    public static ArrayList<Category> getCategories(){
        ArrayList<Category> categories=new ArrayList<>();
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM category";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Category category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                category.setDescription(rs.getString("description"));
                category.setCreatedAt(rs.getString("created_at"));
                category.setUpdatedAt(rs.getString("updated_at"));

                categories.add(category);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return categories;
    }
    public static void addCategory(Category category) {
        try {
            Connection cn = ConnectDB.connect();
            String sql = "INSERT INTO category (name,description) VALUES (?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.executeUpdate();
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static boolean auth(String username, String password) {
        boolean status = false;
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                status = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        System.out.println(status);
        return status;
    }
}
