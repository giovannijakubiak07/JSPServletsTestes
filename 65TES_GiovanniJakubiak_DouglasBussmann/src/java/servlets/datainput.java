/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.Funcoes;
import javax.servlet.http.HttpSession;
import model.Carro;

/**
 *
 * @author giova
 */
@WebServlet(name = "datainput", urlPatterns = {"/datainput"}) 
public class datainput extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Funcoes f = new Funcoes();
        
        HttpSession session = request.getSession(true);
        Carro c = (Carro) session.getAttribute("carro");
        
        f.setCarro(c);
        
        String carro = c.toString();
        request.setAttribute("carro", carro);
        
        float total = Float.parseFloat(request.getParameter("total"));
        float preco = Float.parseFloat(request.getParameter("preco"));
        float consumo =  Float.parseFloat(request.getParameter("consumo"));
        
        float valor = f.CalculaValorGastoParaAbastecer(total, preco);
        float distancia = f.CalculaDistanciaMaxima(total, consumo);
        
        request.setAttribute("valor", valor);
        request.setAttribute("distancia", distancia);
        
        request.getRequestDispatcher("datainput.jsp").forward(request, response);
        
        
       
    }

   
}
