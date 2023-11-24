/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Service.Contactos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.example.Infraestructure.Conections.Conexiones;
import org.example.Infraestructure.DbMangment.Contactos.CiudadModels;

/**
 *
 * @author Monse
 */
public class CiudadService {
    private Conexiones conexion;
    public CiudadService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }
    public String registrodeCiudad(CiudadModels ciudad1){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO Ciudadades(" +
                    "ciudad," +"departamento," +"cod_postal) " +
                    "values('" +
                    ciudad1.ciudad+"', '" +
                    ciudad1.departamento + "', '" +
                    ciudad1.cod_postal + "')");
            conexion.conexionDB().close();
            return "La ciudad ingresada"+ciudad1.ciudad+"ha sido registrada";
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    public String actualizarCiudad(CiudadModels ciudad1){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE Ciudadades SET"+
                    "ciudad='"+ciudad1.ciudad+"',"+"departamento='"+ciudad1.departamento+"',"+"cod_postal='"+ciudad1.cod_postal+"'WHERE ciudad1.id_ciudad="+ciudad1.id_ciudad);
            conexion.conexionDB().close();
            return "La informacion de la ciudad ingresada" +ciudad1.ciudad + "ha sido actualizada";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String eliminarCiudad(int ciudad) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        int rowCount = conexion.getQuerySQL().executeUpdate("DELETE FROM Ciudadades WHERE id_persona="+ciudad);
        conexion.conexionDB().close();

        if (rowCount > 0) {
            return "La ciudad con el id" +ciudad+ "ha sido eliminada";
        } else {
            return "No existe ninguna ciudad con el id ingresado" +ciudad+"";
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
    public List<CiudadModels> consultadeCiudad() {
    List<CiudadModels> ciudad0 = new ArrayList<>();
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("SELECT * FROM Ciudadades"));
        while (conexion.getResultadoQuery().next()) {
            CiudadModels ciudad1 = new CiudadModels();
            ciudad1.id_ciudad = conexion.getResultadoQuery().getInt("id_ciudad");
            ciudad1.ciudad = conexion.getResultadoQuery().getString("ciudad");
            ciudad1.departamento = conexion.getResultadoQuery().getString("departamento");
            ciudad1.cod_postal = conexion.getResultadoQuery().getString("cod_postal");
            CiudadModels.add(ciudad1);
        }
    } 
    catch (SQLException e) {  
    throw new RuntimeException(e);
    }
    return ciudad0;
    }
    
}
