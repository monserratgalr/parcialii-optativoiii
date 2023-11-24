/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Infraestructure.DbMangment.Contactos;

import java.util.Date;

/**
 *
 * @author Monse
 */
public class ClienteModels {

    public static void add(ClienteModels cliente1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String fecha_ingreso;
    public String estado;
    public String calificacion;
    public int id_persona;
    public int id_cliente;
   
    public String getFecha_ingreso(){
        return fecha_ingreso;
    }
    public void setFecha_ingreso(String fecha_ingreso) {
	this.fecha_ingreso = fecha_ingreso;
	}
    public String getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(String calificacion) {
	this.calificacion = calificacion;
	}
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado) {
	this.estado = estado;
	}
     public int getId_persona(){
        return id_persona;
    }
    public void setId_persona(int id_persona) {
	this.id_persona = id_persona;
	}
    public int getId_cliente(){
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
	}
    
}
