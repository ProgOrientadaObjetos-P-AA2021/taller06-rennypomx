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
public class Enfermeros {

    private String nombre;
    private String tipo;
    private int suelMes;

    public Enfermeros(String nom, String tip, int sueldo) {
        nombre = nom;
        tipo = tip;
        suelMes = sueldo;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public void establecerSuelMes(int sueldo) {
        suelMes = sueldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerSuelMes() {
        return suelMes;
    }
}
