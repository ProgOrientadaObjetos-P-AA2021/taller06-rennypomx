/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionHospital;

import java.util.Scanner;
import paquete2.Ciudad;
import paquete2.Enfermeros;
import paquete2.Hospital;
import paquete2.Medicos;
/**
 *
 * @author Renny
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);
        String nomHospital;
        String direcHospital;
        String ciudad;
        String provincia;
        int numEspecialidades;
        int numeroMedicos;
        String nomMedico;
        String especialidad;
        int sueldoMedico;
        Medicos medico[];
        int numEnfermeros;
        String nomEnfermero;
        String tipoEnfermero;
        int sueldoEnfermero;
        Enfermeros enfermero[];

        System.out.println("Ingrese el nombre del Hospital: ");
        nomHospital = entrada.nextLine();
        nomHospital = nomHospital.toUpperCase();
        System.out.println("Ingrese la dirección donde se encuentra: ");
        direcHospital = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia: ");
        provincia = entrada.nextLine();
        Ciudad ub = new Ciudad(ciudad, provincia);
        System.out.println("Ingrese el número de especialidades con las que "
                + "cuenta el hospital: ");
        numEspecialidades = entrada.nextInt();
        System.out.println("ingrese el número de médicos del Hospital: ");
        numeroMedicos = entrada.nextInt();
        entrada.nextLine();
        medico = new Medicos[numeroMedicos];
        
        
        for (int i = 0; i < numeroMedicos; i++) {
            System.out.printf("Ingrese el nombre del médico %d: ", i + 1);
            nomMedico = entrada.nextLine();
            System.out.printf("Ingrese la especialidad del médico %d: ",
                    i + 1);
            especialidad = entrada.nextLine();
            System.out.printf("Ingrese el sueldo del médico %d: ", i + 1);
            sueldoMedico = entrada.nextInt();
            entrada.nextLine();
            Medicos m = new Medicos(nomMedico, especialidad, sueldoMedico);
            medico[i] = m;
        }
        System.out.println("Ingrese el número de enfermeros y enfermeras: ");
        numEnfermeros = entrada.nextInt();
        entrada.nextLine();
        enfermero = new Enfermeros[numEnfermeros];
     
        for (int i = 0; i < numEnfermeros; i++) {
            System.out.printf("Ingrese el nombre del enfermera/o %d: ", i + 1);
            nomEnfermero = entrada.nextLine();
            System.out.printf("Ingrese el tipo de enfermera/o si es por "
                    + "contrato ó nombramiento: ",i + 1);
            tipoEnfermero = entrada.nextLine();
            tipoEnfermero = tipoEnfermero.toLowerCase();
            System.out.printf("Ingrese el sueldo del enfermera/o %d: ", i + 1);
            sueldoEnfermero = entrada.nextInt();
            entrada.nextLine();
            Enfermeros e = new Enfermeros(nomEnfermero, tipoEnfermero,
                    sueldoEnfermero);
            enfermero[i] = e;
        }
       
        Hospital hosp = new Hospital(nomHospital, direcHospital, ub,
                numEspecialidades, medico, enfermero);
        hosp.establecerTotalSueldosMes();
        
        System.out.println();
       
        System.out.printf("%s\n", hosp);
    }

}
    
    

