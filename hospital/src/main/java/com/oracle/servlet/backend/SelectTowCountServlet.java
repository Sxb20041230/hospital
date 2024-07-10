package com.oracle.servlet.backend;

import com.oracle.service.DepartmentService;
import com.oracle.service.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/SelectTowCountServlet")
public class SelectTowCountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sId = req.getParameter("id");
        Integer id = Integer.parseInt(sId);
        System.out.println(id);
        DepartmentService departmentService = new DepartmentServiceImpl();
        Integer count =  departmentService.selectCountFromTow(id);
        if (count>0){
            req.setAttribute("count", count);
            req.getRequestDispatcher("/admin/department/notdelete.jsp").forward(req, resp);
        }else {

            req.setAttribute("id", id);
            req.getRequestDispatcher("/admin/department/delete.jsp").forward(req, resp);
        }
    }
}
