/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Service.Contactos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.example.Infraestructure.Conections.Conexiones;
import org.example.Infraestructure.DbMangment.Contactos.MovimientoModels;

/**
 *
 * @author Monse
 */
public class MovimientoService {
    private Conexiones conexion;
    public MovimientoService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }
    public String registrodeMovimiento(MovimientoModels movimiento1){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO Movimientos(" +
                    "fecha_movimiento,"+"tipo_movimiento,"+"saldo_anterior,"+"saldo_actual,"+"monto_movimiento,"+"cuenta_origen,"+"cuenta_destino,"+"canal)"+
                    "values('"+
                    movimiento1.fecha_movimiento+",'"+movimiento1.tipo_movimiento+"','"+movimiento1.saldo_anterior+movimiento1.saldo_actual+movimiento1.monto_movimiento+movimiento1.cuenta_origen+movimiento1.cuenta_destino+movimiento1.canal+"')");
            conexion.conexionDB().close();
            return "El movimiento ha sido registrado";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String actualizarMovimiento(MovimientoModels movimiento1){
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE Movimientos SET " +
                    "fecha_movimiento='"+movimiento1.id_cuenta+"',"+"tipo_movimiento='"+movimiento1.tipo_movimiento+"',"+"saldo_anterior='"+movimiento1.saldo_anterior+"',"+
                    "saldo_actual='"+movimiento1.saldo_actual+"',"+"monto_movimiento='"+movimiento1.monto_movimiento+"',"+"cuenta_origen='"+movimiento1.cuenta_origen+"',"+
                    "cuenta_destino='"+movimiento1.cuenta_destino+"',"+"canal='"+movimiento1.canal+"',"+"id_cuenta='"+movimiento1.id_cuenta+"',"+
                    "'WHERE Movimientos.id_movimiento="+ movimiento1.id_movimiento);
            conexion.conexionDB().close();
            return "Los datos han sido actualizados";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public String eliminarMovimiento(int MovimientoModels) {
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        int rowCount = conexion.getQuerySQL().executeUpdate("DELETE FROM Movimientos WHERE id_movimiento="+MovimientoModels);
        conexion.conexionDB().close();
        if (rowCount > 0) {
            return "El movimiento con el id ingresado "+MovimientoModels +"ha sido eliminado";
        } else {
            return "No existe ningun movimiento con el id ingresado"+MovimientoModels;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
    public List<MovimientoModels> consultarMovimiento() {
    List<MovimientoModels> movimiento0 = new ArrayList<>();
    try {
        conexion.setQuerySQL(conexion.conexionDB().createStatement());
        conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("SELECT * FROM Movimientos"));
        while (conexion.getResultadoQuery().next()) {
            MovimientoModels movimiento1 = new MovimientoModels();
            movimiento1.fecha_movimiento = conexion.getResultadoQuery().getDate("fecha_movimiento");
            movimiento1.tipo_movimiento= conexion.getResultadoQuery().getString("tipo_movimiento");
            movimiento1.saldo_anterior = conexion.getResultadoQuery().getFloat("saldo_anterior");
            movimiento1.saldo_actual = conexion.getResultadoQuery().getFloat("saldo_actual");
            movimiento1.monto_movimiento = conexion.getResultadoQuery().getFloat("monto_movimiento");
            movimiento1.cuenta_origen = conexion.getResultadoQuery().getFloat("cuenta_origen");
            movimiento1.cuenta_destino = conexion.getResultadoQuery().getFloat("cuenta_destino");
            movimiento1.canal = conexion.getResultadoQuery().getFloat("canal");
            movimiento1.id_cuenta = conexion.getResultadoQuery().getInt("id_cuenta");
            movimiento1.id_movimiento = conexion.getResultadoQuery().getInt("id_movimiento");

            MovimientoModels.add(movimiento0);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return movimiento0;
}
    
}
