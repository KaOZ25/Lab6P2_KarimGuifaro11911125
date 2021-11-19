/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

/**
 *
 * @author karim
 */
public class Pokemon {
   String nombre, daño, hp, velocidad;

    public Pokemon() {
    }

    public Pokemon(String nombre, String daño, String hp, String velocidad) {
        this.nombre = nombre;
        this.daño = daño;
        this.hp = hp;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", daño=" + daño + ", hp=" + hp + ", velocidad=" + velocidad;
    }
   
}
