package com.oracle.servlet.backend;

import com.oracle.service.DepartmentService;
import com.oracle.service.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/deleteServlet")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sId = req.getParameter("id");
        System.out.println(sId);
        Integer id = Integer.parseInt(sId);
        DepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.deleteDepartment(id);
        resp.sendRedirect(req.getContextPath()+"/backend/rootDepartmentServlet");

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sId = req.getParameter("id");
        Integer id = Integer.parseInt(sId);
        DepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.deleteDepartment(id);
        resp.sendRedirect(req.getContextPath() + "/backend/rootDepartmentServlet");
    }
}
