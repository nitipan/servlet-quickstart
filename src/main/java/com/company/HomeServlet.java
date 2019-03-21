package com.company;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Optional<Cookie> cookieOptional = Optional.empty();
        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("username")) {
                cookieOptional = Optional.of(cookie);
                break;
            }
        }
        Cookie usernameCookie;
        if (!cookieOptional.isPresent()) {
            usernameCookie = new Cookie("username", "cc3user1");
            usernameCookie.setMaxAge(600);
            resp.addCookie(usernameCookie);
        }
        req.getRequestDispatcher("/jsp/home.jsp").forward(req, resp);
    }
}
