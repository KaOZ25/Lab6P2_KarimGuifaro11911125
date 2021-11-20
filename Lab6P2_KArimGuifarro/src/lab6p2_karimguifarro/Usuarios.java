/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author karim
 */
public class Usuarios {
    String nombre, apellido,usuario, contraseña;
    Date F_nacimiento;
    int edad;
   Color color;
   ArrayList<Pokemon> pokedex;
    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String contraseña, Date F_nacimiento, int edad, Color color, ArrayList<Pokemon> pokedex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.F_nacimiento = F_nacimiento;
        this.edad = edad;
        this.color = color;
        this.pokedex = pokedex;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getF_nacimiento() {
        return F_nacimiento;
    }

    public void setF_nacimiento(Date F_nacimiento) {
        this.F_nacimiento = F_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", F_nacimiento=" + F_nacimiento + ", edad=" + edad + ", color=" + color + '}';
    }
   
}
