package com.oracle.servlet.backend;

import com.oracle.pojo.Doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/backend/addDoctorServlet")
public class AddDoctorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String jobNumber = req.getParameter("jobNumber");
        Integer dID = Integer.parseInt(req.getParameter("departmentId"));
        Integer pID = Integer.parseInt(req.getParameter("professionaltitle"));
        Doctor doctor =new Doctor();
        doctor.setDepartmentId(dID);
        doctor.setDoctorName(name);
        doctor.setJob_number(Integer.parseInt(jobNumber));
        doctor.setProfessionId(pID);
        System.out.println(doctor);


    }
}
