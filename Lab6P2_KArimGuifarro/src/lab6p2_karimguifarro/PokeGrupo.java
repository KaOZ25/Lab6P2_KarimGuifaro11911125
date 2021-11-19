/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class PokeGrupo {
    String nombre, tipo;
    ArrayList <Usuarios> miebros;
    Usuarios lider;

    public PokeGrupo() {
    }

    public PokeGrupo(String nombre, String tipo, ArrayList<Usuarios> miebros, Usuarios lider) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.miebros = miebros;
        this.lider = lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuarios> getMiebros() {
        return miebros;
    }

    public void setMiebros(ArrayList<Usuarios> miebros) {
        this.miebros = miebros;
    }

    public Usuarios getLider() {
        return lider;
    }

    public void setLider(Usuarios lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipo=" + tipo + ", miebros=" + miebros + ", lider=" + lider;
    }
    
}
