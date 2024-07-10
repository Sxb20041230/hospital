package com.oracle.servlet.backend;

import com.oracle.service.DoctorService;
import com.oracle.service.DoctorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/addDoctorViewServlet")
public class AddDoctorViewServlet extends HttpServlet {
    //获取医生添加信息 科室 职称
    //科室信息和职称内容


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DoctorService doctorService =new DoctorServiceImpl();
        Integer number =doctorService.getCurrentMaxNumber();
        number=number+1;
        request.setAttribute("jobNumber", number);
        request.getRequestDispatcher("/admin/doctor/AddDoctors.jsp").forward(request, response);

    }

}
