/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import operations.CommonOperations;
 
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CommonOperations dao = new CommonOperations();
           Map<Integer, String> listCatagory = dao.MapList();
            request.setAttribute("listCategory", listCatagory);

            RequestDispatcher dispatcher = request.getRequestDispatcher("inventory.jsp");
            dispatcher.forward(request, response);
 
     
        
    }
}