/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.ParcialNumero2;

import ar.edu.unlar.ParcialNumero2.Ui.Sistema;
import ar.edu.unlar.ParcialNumero2.objetos.Agente;
import ar.edu.unlar.ParcialNumero2.objetos.Barrio;
import ar.edu.unlar.ParcialNumero2.objetos.Reclamo;
import java.util.ArrayList;

/**
 *
 * @author Marcos J Peña Pollastri
 *          Claudio Mercado
 * 
 * Parcial Nº2
 * 
 * A partir del diagrama de clases del sistema de tramites de una empresa de servicios
 * desarrollar un sistema que respetará las siguientes especificaciones del entorno
 * - Alta de barrios
 * - Alta de reclamos
 * - Alta de agente
 * - Alta de tramite
 */
public class Principal {

    public static ArrayList<Agente> listaAgentes;
    public static ArrayList<Reclamo> listaReclamos;
    public static ArrayList<Barrio> listaBarrios;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaAgentes = new ArrayList();
        listaReclamos = new ArrayList();
        listaBarrios = new ArrayList();
        Agente agente = new Agente(565656, "Claudio", "Mercado");
        Agente agente2 = new Agente(898989, "Marcos", "Peña Pollastri");
        Reclamo reclamo = new Reclamo("Cloacas rotas");
        Reclamo reclamo2 = new Reclamo("Alumbrado publico roto");
        Barrio barrio = new Barrio("Bella Vista", 3);
        Barrio barrio2 = new Barrio("Vargas", 21);

       // 
        listaAgentes.add(agente);
        listaBarrios.add(barrio);
        listaBarrios.add(barrio2);
        listaReclamos.add(reclamo);
        listaReclamos.add(reclamo2);
        
        
        
        
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
        sistema.setLocationRelativeTo(null);
    }
    
}
