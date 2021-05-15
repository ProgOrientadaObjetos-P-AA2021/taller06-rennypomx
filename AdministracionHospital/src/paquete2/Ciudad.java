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
public class Ciudad {
  
    private String nombre;
    private String provincia;
    
    public Ciudad(String nom, String provin) {
        nombre = nom;
        provincia = provin;
    }
    
    public void establecerNombre(String nom) {
        nombre = nom;
    }
    
    public void establecerProvincia(String provin) {
        provincia = provin;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
}
