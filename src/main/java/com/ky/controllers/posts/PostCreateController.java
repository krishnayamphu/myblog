package com.ky.controllers.posts;

import com.ky.dao.CategoryDAO;
import com.ky.dao.PostDAO;
import com.ky.models.Category;
import com.ky.models.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PostCreateController", value = "/post-create")
public class PostCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Category> categories= CategoryDAO.getCategories();
        request.setAttribute("categories",categories);
        request.getRequestDispatcher("admin/posts/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        String picture=request.getParameter("picture");
        int categoryId=Integer.parseInt(request.getParameter("category_id"));
        int userId=1;
        Post post=new Post();
        post.setTitle(title);
        post.setText(content);
        post.setPicture(picture);
        post.setCategoryId(categoryId);
        post.setUserId(userId);
        PostDAO.addPost(post);
        response.sendRedirect("posts");
    }
}
