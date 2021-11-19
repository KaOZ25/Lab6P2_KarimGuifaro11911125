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
   String nombre,velocidad, tipo;
   int daño, hp;

    public Pokemon() {
    }

    public Pokemon(String nombre, String velocidad, String tipo, int daño, int hp) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.daño = daño;
        this.hp = hp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", tipo=" + tipo + ", da\u00f1o=" + daño + ", hp=" + hp + '}';
    }
   
   
}
