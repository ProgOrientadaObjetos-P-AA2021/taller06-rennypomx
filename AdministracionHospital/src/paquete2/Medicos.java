/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Renny
 */
public class Medicos {
    
    private String nombre;
    private String especialidad;
    private int suelMes;
    
    public Medicos(String nom, String especi, int sueldo) {
        nombre = nom;
        especialidad = especi;
        suelMes = sueldo;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerEspecialidad(String especi) {
        especialidad = especi;
    }

    public void establecerSuelMes(int sueldo) {
        suelMes = sueldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidades() {
        return especialidad;
    }

    public int obtenerSuelMes() {
        return suelMes;
    }  
}
