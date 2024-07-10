package com.oracle.servlet.backend;

import com.alibaba.fastjson.JSONObject;
import com.oracle.pojo.Department;
import com.oracle.service.DepartmentService;
import com.oracle.service.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/backend/loadTwoDepartmentServlet")
public class LoadTwoDepartmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");//1
        resp.setCharacterEncoding("UTF-8");//2

        Integer rootId = Integer.parseInt(req.getParameter("rootId"));//异步请求3
        DepartmentService departmentService = new DepartmentServiceImpl();
        List<Department> departmentByPid = departmentService.findDepartmentByPid(rootId);
        String json = JSONObject.toJSONString(departmentByPid);
        resp.getWriter().println(json);//4
        resp.getWriter().flush();//5
        resp.getWriter().close();//6

    }
}
