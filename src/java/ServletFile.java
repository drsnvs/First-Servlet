/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Darshan
 */
public class ServletFile extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            double num1,num2,ans=0;
            num1 = Double.parseDouble(request.getParameter("no1"));
            num2 = Double.parseDouble(request.getParameter("no2"));
            String operator = request.getParameter("op");
            if(operator.equals("+")){
                ans = num1+num2;
            }
            else if(operator.equals("-")){
                ans = num1-num2;
            }
            else if(operator.equals("*")){
                ans = num1*num2;
            }
            else if(operator.equals("/")){
                ans = num1/num2;
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">Calculator</h1>");
            out.println("<table align=\"center\" border=\"1\"><tr><td>Number 1 </td><td>"+num1+"</td></tr>");
            out.println("<tr><td>Operator </td><td>"+operator+"</td></tr>");
            out.println("<tr><td>Number 2 </td><td>"+num2+"</td></tr>");
            out.println("<tr><td>Answer </td><td>"+ans+"</td></tr></table>");

            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
