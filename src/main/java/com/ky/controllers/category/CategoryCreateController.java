package com.ky.controllers.category;

import com.ky.dao.CategoryDAO;
import com.ky.models.Category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CategoryCreateController", value = "/category-create")
public class CategoryCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("admin/category/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String description=request.getParameter("desc");
        Category category=new Category(name,description);
        try {
            CategoryDAO.addCategory(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("categories");
    }
}
