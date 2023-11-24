/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Infraestructure.DbMangment.Contactos;

import org.example.Service.Contactos.PersonaService;

/**
 *
 * @author Monse
 */
public class PersonaModels {



    public static PersonaService consultaPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nombre;
    private String apellido;
    private String tipo_documento;
    private String nro_documento;
    private String direccion;
    private String celular;
    private String email;
    private String estado;
    private int id_ciudad;
    private int id_persona;
    
    
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
	}
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido) {
	this.apellido = apellido;
	}
    public String getApellido(){
        return apellido;
    }
     public void setTipo_documento(String tipo_documento) {
	this.tipo_documento = tipo_documento;
	}
    public String getTipo_documento(){
        return tipo_documento;
    }
    public void setNro_documento(String nro_documento) {
	this.nro_documento = nro_documento;
	}
    public String getNro_documento(){
        return nro_documento;
    }
    public void setDireccion(String direccion) {
	this.direccion = direccion;
	}
    public String getDireccion(){
        return direccion;
    }
   public void setCelular(String celular) {
	this.celular = celular;
	}
    public String getCelular(){
        return celular;
    }
   public void setEmail(String email) {
	this.email = email;
	}
    public String getEmail(){
        return email;
    }
    public void setEstado(String estado) {
	this.estado = estado;
	}
    public String getEstado(){
        return estado;
    }
    public void setId_ciudad(int id_ciudad) {
	this.id_ciudad = id_ciudad;
	} 
    public int getId_ciudad(){
        return id_ciudad;
    }
    public void setId_persona(int id_persona) {
	this.id_persona = id_persona;
	}     
    public int getId_persona(){
        return id_persona;
    }
    public PersonaModels consultarPorId(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}

   
