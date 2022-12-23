package com.mycompany.web.servlets;

import java.io.IOException;
//import com.mycompany.web.models.AccionesCliente;
import com.mycompany.web.models.AccionesOrador;
import com.mycompany.web.models.Orador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verorador")
public class VerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("Id") != "") {
            int i = Integer.parseInt(req.getParameter("Id"));
            if (i != 0) {
                Orador registro = AccionesOrador.verOrador(i);

                req.setAttribute("c", registro);

                if (i == registro.getId()) {
                    RequestDispatcher respuesta = req.getRequestDispatcher("/datosorador.jsp");
                    respuesta.forward(req, resp);
                } else {
                    RequestDispatcher respuesta = req.getRequestDispatcher("/oradornoexiste.jsp");
                    respuesta.forward(req, resp);
                }
            } else {
                RequestDispatcher respuesta = req.getRequestDispatcher("/oradornoexiste.jsp");
                respuesta.forward(req, resp);
            }
        } else {
            RequestDispatcher respuesta = req.getRequestDispatcher("/oradornoexiste.jsp");
            respuesta.forward(req, resp);
        }

    }
}
