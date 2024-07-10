package com.oracle.servlet.backend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/addDepartmentViewServlet")
public class AddDepartmentViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String pid =  request.getParameter("pid");
      request.setAttribute("pid", pid);
      request.getRequestDispatcher("/admin/department/add.jsp").forward(request, response);


      }

}
