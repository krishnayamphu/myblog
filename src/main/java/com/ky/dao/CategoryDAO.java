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
    public static ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM category";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
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
    public static Category getCategory(int id) {
        Category category=new Category();
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM category WHERE id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                category.setDescription(rs.getString("description"));
                category.setCreatedAt(rs.getString("created_at"));
                category.setUpdatedAt(rs.getString("updated_at"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return category;
    }

    public static void addCategory(Category category) throws SQLException {
        Connection cn = ConnectDB.connect();
        String sql = "INSERT INTO category (name,description) VALUES (?,?)";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, category.getName());
        ps.setString(2, category.getDescription());
        ps.executeUpdate();
        cn.close();
    }

    public static void deleteCategory(int id) {
        try {
            Connection cn = ConnectDB.connect();
            String sql = "DELETE FROM category WHERE id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void updateCategory(Category category) {
        try {
            Connection cn = ConnectDB.connect();
            String sql = "UPDATE category SET name=?,description=? WHERE id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.setInt(3,category.getId());
            ps.executeUpdate();
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

    }
}
