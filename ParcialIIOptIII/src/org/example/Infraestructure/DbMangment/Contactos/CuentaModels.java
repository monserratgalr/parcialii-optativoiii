/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Infraestructure.DbMangment.Contactos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Monse
 */
public class CuentaModels {

    public static void add(List<CuentaModels> cuenta0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String nro_cuenta; //que en el form con keypressed rellene los demas datos (no me salio..........)
    public Date fecha_alta;
    public String tipo_cuenta;
    public String estado;
    public float saldo;
    public String nro_contrato; //no me parecio necesario entonces no lo agregue al form
    public String promedio_acreditacion;
    public String moneda; // tampoco me parecio informacion necesaria en el form
    public float costo_mantenimiento;
    public int id_cliente; 
    public int id_cuenta;
   

    
    public Date getFecha_alta(){
        return fecha_alta;
    }
    public void setFecha_alta(Date fecha_alta) {
	this.fecha_alta = fecha_alta;
	}
    public String getNro_cuenta(){
        return nro_cuenta;
    }
    public void setNro_cuenta(String nro_cuenta) {
	this.nro_cuenta = nro_cuenta;
	}
    public String getTipo_cuenta(){
        return tipo_cuenta;
    }
    public void setTipo_cuenta(String tipo_cuenta) {
	this.tipo_cuenta = tipo_cuenta;
	}
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado) {
	this.estado = estado;
	}
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo) {
	this.saldo = saldo;
	}
    public String getNro_contrato(){
        return nro_contrato;
    }
    public void setNro_contrato(String nro_contrato) {
	this.nro_contrato = nro_contrato;
	}
    public String getPromedio_acreditacion(){
        return promedio_acreditacion;
    }
    public void setPromedio_acreditacion(String promedio_acreditacion) {
	this.estado = promedio_acreditacion;
	}
    public String getMoneda(){
        return moneda;
    }
    public void setMoneda(String moneda) {
	this.moneda = moneda;
	}
    public float getCosto_mantenimiento(){
        return costo_mantenimiento;
    }
    public void setCosto_mantenimiento(float estado) {
	this.costo_mantenimiento = estado;
	}
     public int getId_cliente(){
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
	}
    public int getId_cuenta(){
        return id_cuenta;
    }
    public void setId_cuenta(int id_cuenta) {
	this.id_cuenta = id_cuenta;
	}
}
    
    

