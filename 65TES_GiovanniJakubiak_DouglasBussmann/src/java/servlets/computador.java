/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.swing.JOptionPane;
import model.Carro;
/**
 *
 * @author giova
 */
@WebServlet(name = "computador", urlPatterns = {"/computador"})
public class computador extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        
        String montadora = request.getParameter("montadora");
        String modelo = request.getParameter("modelo");
        float cilindradas =  Float.parseFloat(request.getParameter("cilindradas"));
        
        Carro c = new Carro(montadora, modelo , cilindradas);
        
        HttpSession session = request.getSession(true);
        session.setAttribute("carro", c);
        
        request.setAttribute("carro", c.toString());
        request.setAttribute("distancia", cilindradas);
        
        request.getRequestDispatcher("computador.jsp").forward(request, response);
        
        
       
    }

   
}
