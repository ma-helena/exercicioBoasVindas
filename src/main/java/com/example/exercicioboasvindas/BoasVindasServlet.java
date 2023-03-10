package com.example.exercicioboasvindas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;
@WebServlet(name = "BoasVindasServlet", urlPatterns = "/boasVindas")
public class BoasVindasServlet extends HttpServlet {
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String nomeUsuario = req.getParameter("nomeUsuario");
       String emailUsuario = req.getParameter("emailUsuario");
       int horaCadastro = LocalDateTime.now().getHour();
       String mensagemUsuario;
       if (horaCadastro < 12){
           mensagemUsuario = "Bom dia!";
       } else if (horaCadastro<18) {
       mensagemUsuario = "Boa tarde!";
       }else {
           mensagemUsuario = "Boa noite";
       }

       req.setAttribute("mensagemUsuario", mensagemUsuario);
       req.setAttribute("nomeUsuario", nomeUsuario);
       resp.setHeader("mensagemUsuario",mensagemUsuario);

       req.getRequestDispatcher("/boasVindas.jsp").forward(req, resp);


   }

}
