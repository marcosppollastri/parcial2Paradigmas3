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
public class Barrio {
    private String nombre;
    private int cantManzanas;

    public Barrio(String nombre, int cantManzanas) {
        this.nombre = nombre;
        this.cantManzanas = cantManzanas;
    }

    public Barrio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantManzanas() {
        return cantManzanas;
    }

    public void setCantManzanas(int cantManzanas) {
        this.cantManzanas = cantManzanas;
    }

    @Override
    public String toString() {
        return "Barrio: "+nombre+" | Cant Manzanas: "+cantManzanas;
    }
    

}
