/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.LenguajeProgramacion;
/**
 *
 * @author valen
 */
public class GestionLenguaje {
    //Creamos atributos para el controlador
    private LenguajeProgramacion[]ArregloLenguajes;
    private int ContadorLenguajes;
    private static final int FACTOR_CRECIMIENTO = 2;
    
    //Constructor
    public GestionLenguaje(){
        ArregloLenguajes= new LenguajeProgramacion[FACTOR_CRECIMIENTO];
        ContadorLenguajes=0;
    }
    
    public void AgregarLenguaje( int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (ContadorLenguajes == ArregloLenguajes.length) {
            
        }
        
        ArregloLenguajes[ContadorLenguajes++] = new LenguajeProgramacion( anioCreacion, caracteristicaPrincipal,nombre, utilizacion);
        System.out.println("---Lenguaje agregado exitosamente---");
    }
    
    public LenguajeProgramacion BuscarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null;
    }
    
     public boolean EliminarLenguaje(String nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < ContadorLenguajes - 1; j++) {
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[--ContadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }

   
    public void ImprimirLenguajes() {
        if (ContadorLenguajes == 0) {
            System.out.println("No hay lenguajes registrados.");
        } else {
            for (int i = 0; i < ContadorLenguajes; i++) {
                System.out.println(ArregloLenguajes[i]);
            }
        }
    }    
}

