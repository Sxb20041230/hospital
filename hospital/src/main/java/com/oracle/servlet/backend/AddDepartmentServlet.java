package com.oracle.servlet.backend;

import com.oracle.pojo.Department;
import com.oracle.service.DepartmentService;
import com.oracle.service.DepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/addDepartmentServlet")
public class AddDepartmentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sPid = request.getParameter("pid");
        String  deptName = request.getParameter("department_name");
        String  deptDesc = request.getParameter("department_description");
        Integer pid =null;
        if(sPid !=null && !"".equals(sPid)){
            pid=Integer.parseInt(sPid);
        }
        Department department = new Department();
        department.setDepartment_name(deptName);
        department.setDepartment_pid(pid);
        department.setDepartment_description(deptDesc);
        if(pid == null){

            department.setDepartment_level(1);

        }
        else {
            department.setDepartment_level(2);
        }

        DepartmentService departmentService = new DepartmentServiceImpl();
        departmentService.addDepartment(department);
        //当添加完成后重定向到root部门的数据请求  不能直接到jsp因为数据是通过该请求存放到request作用域进行转发
        response.sendRedirect(request.getContextPath()+"/backend/rootDepartmentServlet");
    }




}
