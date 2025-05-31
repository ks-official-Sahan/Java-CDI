package com.sahansachintha.cdi;

import com.sahansachintha.cdi.remote.AppSettings;
import com.sahansachintha.cdi.remote.UserRegistration;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CDITest")
public class CDITest extends HttpServlet {

    @EJB
    private AppSettings appSettings;

    @EJB
    private UserRegistration userRegistration;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        userRegistration.registerUser("Sahan", "Sachintha", "Sahan@gmail.com", "Sahan123");

        out.println(appSettings.getAppName() + " " + appSettings.getAppVersion());

//        try {
//            InitialContext ctx = new InitialContext();
//            AppSettings appSettings = (AppSettings) ctx.lookup("java:global/cdi-module/AppSettingsBean");
//
//            out.println(appSettings.getAppName() + " " + appSettings.getAppVersion());
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
    }
}
