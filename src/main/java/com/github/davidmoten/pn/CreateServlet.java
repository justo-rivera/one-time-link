package com.github.davidmoten.pn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "create", urlPatterns = { "create" })
public class CreateServlet extends HttpServlet {

    private static final long serialVersionUID = -1313656605680750802L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        String value = req.getParameter("encryptedValue");
        System.out.println("called with id="+ id);
        System.out.println("value=\n"+ value);
        System.out.println(req.getParameterMap());
    }
    
    

}