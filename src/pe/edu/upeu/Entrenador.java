/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu;

/**
 *
 * @author AngelDX
 */
public class Entrenador extends SeleccionFutbol{
   int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, 
            String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
   @Override
    public void entrenamiento(){
        System.out.println("Dirige un encuentro"
                + " (clase Entrenador)");
    }
    
   @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido (Clase Entrenador)");
    }    
}
