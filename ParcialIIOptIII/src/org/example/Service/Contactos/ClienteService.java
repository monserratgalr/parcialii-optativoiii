/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Service.Contactos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.example.Infraestructure.Conections.Conexiones;
import org.example.Infraestructure.DbMangment.Contactos.ClienteModels;

/**
 *
 * @author Monse
 */
public class ClienteService {
    private Conexiones conexion;
    public ClienteService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }
    public String registrarCliente(ClienteModels cliente1) throws SQLException{
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        boolean execute = conexion.getQuerySQL().execute("INSERT INTO Clientes(" +
                "fecha_ingreso," +"estado," +"calificacion," +"id_persona)" +
                "values('" +
                cliente1.fecha_ingreso+"','"+cliente1.estado +cliente1.calificacion +cliente1.id_persona +"')");
        conexion.conexionDB().close();
        return "El cliente  ha sido registrado";
    }
    public String eliminarCliente(int ClienteModels) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        int rowCount = conexion.getQuerySQL().executeUpdate("DELETE FROM Clientes WHERE id_cliente = " + ClienteModels);
        conexion.conexionDB().close();
        if (rowCount > 0) {
            return "El cliente con el id ingresado " + ClienteModels + " ha sido eliminado";
        } else {
            return "No se existe ningun cliente con el id ingresado " + ClienteModels;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
    public String actualizarCuenta(ClienteModels cliente1){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE Clientes SET"+
              "fecha_ingreso='"+cliente1.fecha_ingreso+"',"+"estado='"+cliente1.estado+"',"+"calificacion='"+"id_persona='"+cliente1.id_persona+"' WHERE cliente1.id_cliente="+cliente1.id_cliente);
            conexion.conexionDB().close();
            return "Los datos han sido actualizados";
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<ClienteModels> consultaACliente() throws SQLException {
    List<ClienteModels> cliente0 = new ArrayList<>();
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("SELECT * FROM Clientes"));
        while (conexion.getResultadoQuery().next()) {
            ClienteModels cliente1 = new ClienteModels();
            cliente1.fecha_ingreso = conexion.getResultadoQuery().getString("fecha_ingreso");
            cliente1.estado = conexion.getResultadoQuery().getString("estado");
            cliente1.calificacion = conexion.getResultadoQuery().getString("calificacion");
            cliente1.id_persona = conexion.getResultadoQuery().getInt("id_persona");
            cliente1.id_cliente = conexion.getResultadoQuery().getInt("id_cliente");
            ClienteModels.add(cliente1);
        }
    }
    catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return cliente0;
} 
    
}
