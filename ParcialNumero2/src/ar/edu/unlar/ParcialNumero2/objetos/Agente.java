/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.unlar.ParcialNumero2.objetos;

/**
 *
 * @author Marcos J. Peña Pollastri
 */
public class Agente extends Persona{
    
    private int legajo;

    public Agente() {
       
    }

    @Override
    public String toString() {
        return "Agente: "+nombre+" | Legajo: "+legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public Agente(int legajo, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    
    

}
