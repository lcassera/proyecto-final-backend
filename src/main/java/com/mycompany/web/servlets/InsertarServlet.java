package com.mycompany.web.servlets;

import com.mycompany.web.models.Orador;

import java.io.IOException;

import com.mycompany.web.models.AccionesOrador ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevoorador")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre , apellido, contacto;

        nombre = req.getParameter("nombre");

        apellido = req.getParameter("apellido");

        contacto = req.getParameter("contacto");

        Orador nuevoOrador = new Orador();

        nuevoOrador.setNombre(nombre);
        nuevoOrador.setApellido(apellido);
        nuevoOrador.setContacto(contacto);

        int estado = AccionesOrador.registrarOrador(nuevoOrador);

        if (estado == 1){
            resp.sendRedirect("exito.jsp");            
        } else {
            resp.sendRedirect("error.jsp");
        }



    }
}
