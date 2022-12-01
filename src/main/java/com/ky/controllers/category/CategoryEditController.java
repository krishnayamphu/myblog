package com.ky.controllers.category;

import com.ky.dao.CategoryDAO;
import com.ky.models.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CategoryEditController", value = "/category-edit")
public class CategoryEditController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Category category=CategoryDAO.getCategory(id);
        request.setAttribute("category",category);
        request.getRequestDispatcher("admin/category/edit.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String description=request.getParameter("desc");
        Category category=new Category();
        category.setId(id);
        category.setName(name);
        category.setDescription(description);
        CategoryDAO.updateCategory(category);
        response.sendRedirect(request.getHeader("referer"));
    }
}
