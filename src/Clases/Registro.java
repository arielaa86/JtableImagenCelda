/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Registro implements Serializable{
    
    
    private ArrayList<Persona> listaPersona;

    public Registro() {
        listaPersona = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    
    
    
    
    
}
