package com.ky.controllers.category;

import com.ky.dao.CategoryDAO;
import com.ky.models.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CategoryDelController", value = "/category-del")
public class CategoryDelController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id =Integer.parseInt(request.getParameter("id"));
    CategoryDAO.deleteCategory(id);
    response.sendRedirect("categories");
    }
}
