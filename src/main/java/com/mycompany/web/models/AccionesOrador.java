package com.mycompany.web.models;
//import com.mycompany.web.models.Orador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccionesOrador {
//insertar registro
public static int registrarOrador(Orador o){
    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver"); //EN CADA CONEXION DEBEREMOS CARGAR LA CLASE PRIMERO PARA PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BBDD
        //Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas","root","");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas",DatosConexionBd.usuario(),DatosConexionBd.password());

        String query = "INSERT INTO oradores(nombre,apellido,contacto) VALUES (?,?,?)";
        
        String nombre = o.getNombre();
        String apellido = o.getApellido();
        String contacto = o.getContacto();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, nombre);
        pst.setString(2, apellido);
        pst.setString(3, contacto);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println(e);
        System.out.println("uppsss algo salio mal");
    }

    return estado;
}

//consultar registro por id

public static Orador verOrador(int idAConsultar){
    Orador oradorADevolver = new Orador();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas",DatosConexionBd.usuario(),DatosConexionBd.password());


        String query = "SELECT * FROM oradores WHERE id_orador=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, idAConsultar);

        ResultSet consultaOrador = pst.executeQuery();

        if (consultaOrador.next()){
            oradorADevolver.setId( consultaOrador.getInt(1));
            oradorADevolver.setNombre( consultaOrador.getString(2));
            oradorADevolver.setApellido( consultaOrador.getString(3));
            oradorADevolver.setContacto( consultaOrador.getString(4));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("uppsss algo salio mal");
    }

    return oradorADevolver;
}   

//consultar todos los registros de una tabla

public static List<Orador> ListarOradores(){
    List<Orador> listaOradoresADevolver = new ArrayList<Orador>();
    

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas",DatosConexionBd.usuario(),DatosConexionBd.password());


        String query = "SELECT * FROM oradores";

        PreparedStatement pst = conexion.prepareStatement(query);

        ResultSet consultaOradores = pst.executeQuery();

        while (consultaOradores.next()){
            Orador OradoresADevolver = new Orador(); //EN CADA VUELTA NECESITAREMOS INSTANCIAR UN NUEVO OBJETO
            OradoresADevolver.setId( consultaOradores.getInt(1));
            OradoresADevolver.setNombre( consultaOradores.getString(2));
            OradoresADevolver.setApellido( consultaOradores.getString(3));
            OradoresADevolver.setContacto( consultaOradores.getString(4));
            listaOradoresADevolver.add(OradoresADevolver);
        }
        conexion.close();
    } catch (Exception e){
        System.out.println(e);
        System.out.println("uppsss algo salio mal");
    }

    return listaOradoresADevolver;
} 


//actualizar registro

public static int actualizarOrador(Orador o){
    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas",DatosConexionBd.usuario(),DatosConexionBd.password());


        String query = "UPDATE oradores SET nombre=?,apellido=?,contacto=? WHERE id_orador=?";

        int id = o.getId();
        String nombre = o.getNombre();
        String apellido = o.getApellido();
        String contacto = o.getContacto();

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, nombre);
        pst.setString(2, apellido);
        pst.setString(3, contacto);
        pst.setInt(4, id);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println("uppsss algo salio mal");
    }

    return estado;
}

    //borrar cliente
    public static int eliminarOrador(int idABorrar) {
        // si logro insertar el cliente estado va a tomar valo 1
        int estado = 0;
        // debo manejar excepciones para ver que todo este ok
        // y que al usuario pueda seguir usando la aplicacion
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciabsas",DatosConexionBd.usuario(),DatosConexionBd.password());
            String query = "DELETE FROM oradores WHERE id_cliente=?";
            
            PreparedStatement pst = conexion.prepareStatement(query);
            pst.setInt(1, idABorrar);
            
            estado = pst.executeUpdate();
            conexion.close();

        } catch (Exception e) {
            // System.out.println(e);
            System.out.println("Ups algo salio mal");
        }
        return estado;
    }    

    
}
