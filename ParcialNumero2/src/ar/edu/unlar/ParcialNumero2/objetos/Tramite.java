/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.unlar.ParcialNumero2.objetos;

import java.util.ArrayList;

/**
 *
 * @author Marcos J. Peña Pollastri
 */
public class Tramite {
    
    private String descripcion;
    private String prioridad;
    private ArrayList<Reclamo> listaReclamos;
    private Agente agente;
    private Barrio barrio;

    public Tramite(String descripcion, String prioridad, ArrayList<Reclamo> listaReclamos, Agente agente, Barrio barrio) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.listaReclamos = listaReclamos;
        this.agente = agente;
        this.barrio = barrio;
    }

    public Tramite() {
        descripcion = null;
        prioridad = null;
        listaReclamos = new ArrayList();
        agente = null;
        barrio = null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public ArrayList<Reclamo> getListaReclamos() {
        return listaReclamos;
    }

    public void setListaReclamos(ArrayList<Reclamo> listaReclamos) {
        this.listaReclamos = listaReclamos;
    }
    
    public void addReclamo(Reclamo reclamo){
        listaReclamos.add(reclamo);
        
    }
    


    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Tramite{" + "descripcion=" + descripcion + ", prioridad=" + prioridad + ", listaReclamos=" + listaReclamos + ", agente=" + agente + ", barrio=" + barrio + '}';
    }
    
    
}
