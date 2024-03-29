package com.example.springmymvc01;

import org.springframework.stereotype.Controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}