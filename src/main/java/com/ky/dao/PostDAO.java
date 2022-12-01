package com.ky.dao;

import com.ky.database.ConnectDB;
import com.ky.models.Category;
import com.ky.models.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostDAO {
    public static ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            Connection cn = ConnectDB.connect();
            String sql = "SELECT * FROM posts";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setText(rs.getString("text"));
                post.setPicture(rs.getString("picture"));
                post.setCategoryId(rs.getInt("category_id"));
                post.setUserId(rs.getInt("user_id"));
                post.setCreatedAt(rs.getString("created_at"));
                post.setUpdatedAt(rs.getString("updated_at"));
                posts.add(post);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return posts;
    }

    public static void addPost(Post post) {
        try {
            Connection cn = ConnectDB.connect();
            String sql = "INSERT INTO posts (title,text,picture,category_id,user_id) VALUES (?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getText());
            ps.setString(3,post.getPicture());
            ps.setInt(4,post.getCategoryId());
            ps.setInt(5,post.getUserId());
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
