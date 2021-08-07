package org.hetao.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hetao.domain.Role;
import org.hetao.domain.User;
import org.hetao.services.impl.RoleServiceImpl;
import org.hetao.services.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application:json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if("login".equals(action))
        {
            login(request,response);
        }
        else if("region".equals(action))
        {
            region(request,response);
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }
    public void login(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String user_id=request.getParameter("user_id");
        String pwd=request.getParameter("pwd");
        User user=null;
        user=new UserServiceImpl().isUser(new User(user_id,pwd));
        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(user);
        PrintWriter printWriter=response.getWriter();
        printWriter.println(json);
    }
    public void region(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        String uid=request.getParameter("id");
        String rname=request.getParameter("region");
        Role role=new RoleServiceImpl().queryRole(new Role(Integer.valueOf(uid),rname));
        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(role);
        PrintWriter printWriter=response.getWriter();
        printWriter.println(json);
    }

}
