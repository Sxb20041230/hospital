package com.oracle.servlet.backend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/backend/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("username");
        String pwd = req.getParameter("password");
        String roleId = req.getParameter("roleId");
        String requestcode = req.getParameter("code");
        HttpSession session = req.getSession();
        session.getAttribute("valcode");
        String sessioncode = (String) session.getAttribute("valcode");
        if(requestcode==null || "".equals(requestcode)|| !requestcode.equals(sessioncode)){
            req.setAttribute("captError","验证码有误，请重新输入");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        //用户AdminService 登录
        //医生接口登录
        //扩展 管理员和医生登录后主菜单不一样



    }


        //校验
    }

