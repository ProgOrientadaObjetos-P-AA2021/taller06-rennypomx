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
public class Hospital {
    
    private String nombreHospital;
    private String direccionHospital;
    private Ciudad ciudadHospital;
    private int numEspecialidades;
    private Medicos[] numMedicos;
    private Enfermeros[] numEnfermeros;
    private int totalSuelMes;

    public Hospital(String nom, String direc, Ciudad ubic,
            int espec, Medicos[] medic, Enfermeros[] enfer) {
        nombreHospital = nom;
        direccionHospital = direc;
        ciudadHospital = ubic;
        numEspecialidades = espec;
        numMedicos = medic;
        numEnfermeros = enfer;
    }
    public void establecerNombreHospital(String nombre) {
        nombreHospital = nombre;
    }

    public void establecerDireccionHospital(String direc) {
        direccionHospital = direc;
    }

    public void establecerCiudadHospital(Ciudad hosp) {
        ciudadHospital = hosp;
    }

    public void establecerNumEspecialidades(int num) {
        numEspecialidades = num;
    }

    public void establecerNumMedicos(Medicos[] listm) {
        numMedicos = listm;
    }

    public void establecerNumEnfermeros(Enfermeros[] enfer) {
        numEnfermeros = enfer;
    }

    public void establecerTotalSueldosMes() {
        int sueldos = 0;
        for (Medicos obtenerListaMedico : obtenerListaMedicos()) {
            sueldos = sueldos + obtenerListaMedico.obtenerSuelMes();
        }
        for (Enfermeros obtenerListaEnfermero : obtenerListaEnfermeros()) {
            sueldos = sueldos + obtenerListaEnfermero.obtenerSuelMes();
        }
        totalSuelMes = sueldos;
    }

    public String obtenerNombreHospita() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public int obtenerNumeroEspecialidades() {
        return numEspecialidades;
    }

    public Medicos[] obtenerListaMedicos() {
        return numMedicos;
    }

    public Enfermeros[] obtenerListaEnfermeros() {
        return numEnfermeros;
    }

    public int obtenerTotalSueldosMes() {
        return totalSuelMes;
    }

    @Override
    public String toString() {
        String cadena = "Información Hospital\n";
        cadena = String.format("%s%s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos:\n",
                cadena,
                nombreHospital,
                direccionHospital,
                obtenerCiudadHospital().obtenerNombre(),
                obtenerCiudadHospital().obtenerProvincia(),
                numEspecialidades);
        
        for (Medicos obtenerListaMedico : obtenerListaMedicos()) {
            cadena = String.format("%s - %s - sueldo: %d - %s\n",
                    cadena,
                    obtenerListaMedico.obtenerNombre(),
                    obtenerListaMedico.obtenerSuelMes(),
                    obtenerListaMedico.obtenerEspecialidades());
        }
        cadena = String.format("%s\nListado de enfermeros(as):\n",cadena);
        for (Enfermeros obtenerListaEnfermero : obtenerListaEnfermeros()) {
            cadena = String.format("%s - %s - sueldo: %d - %s\n",
                    cadena,
                    obtenerListaEnfermero.obtenerNombre(),
                    obtenerListaEnfermero.obtenerSuelMes(),
                    obtenerListaEnfermero.obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %d\n",
                cadena, obtenerTotalSueldosMes());
        return cadena;
    }
}
