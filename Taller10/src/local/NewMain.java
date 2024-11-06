
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Ej1_Persona persona = new Ej1_Persona();
        Ej1_Persona profesor = new Ej1_Profesor();
        Ej1_Persona estudiante = new Ej1_Estudiante();
        
        persona.presentarse();
        profesor.presentarse();
        estudiante.presentarse();
        
        //Ejercicio2
        Ej2_Vehiculo vehiculo = new Ej2_Vehiculo();
        Ej2_Bicicleta bicicleta = new Ej2_Bicicleta();
        
        vehiculo.moverse();
        bicicleta.moverse();
    }
    
}
