package com.example.javaproductdiscountcalculatorwebapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", value = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long listPrice =  Long.parseLong(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        String productDescription = request.getParameter("productDescription");
        long discountAmount = (long) (discountPercent*listPrice*0.01);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        printWriter.println("==========Invoice==========" + "<br><br>");
        printWriter.println("Product Description: " + productDescription + "<br><br>");
        printWriter.println("List Price: " + listPrice + "<br><br>");
        printWriter.println("Discount Percent: " + discountPercent + "%" + "<br><br>");
        printWriter.println("Discount Amount: " + discountAmount + "<br><br>");
        printWriter.println("Discount Price: " + (listPrice - discountAmount) + "<br><br>");
        printWriter.println("<br><br>");
        printWriter.println("~Thank you for choosing us!~" + "<br><br>");
        printWriter.println("===========================");

        printWriter.println("</html>");
    }
}
