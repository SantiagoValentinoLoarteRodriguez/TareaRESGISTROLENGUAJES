/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import controlador.GestionLenguaje;
import modelo.LenguajeProgramacion;
import java.util.Scanner;
/**
 *
 * @author valen
 */
public class SistemaRegistro {
    private static final GestionLenguaje gestion = new GestionLenguaje();
    private static final Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }
    //Vista del menu para el programa
    public static void Menu() {
        int opcion;
        do {
            System.out.println("\n ########## Menu para Registrar Lenguajes ##########");
            System.out.println("              ---Seleccione una opcion--- ");
            System.out.println("           1. Agregar lenguaje de programacion");
            System.out.println("           2. Buscar lenguaje de programacion");
            System.out.println("           3. Eliminar Lenguaje registrado");
            System.out.println("           4. Imprimir Lenguajes registrados");
            System.out.println("           5. Salir del programa");
            System.out.println("####################################################");
            System.out.print("Opcion a ingresar: ");
            opcion = lector.nextInt();
            lector.nextLine(); 

            switch (opcion) {
                case 1 -> AgregarLenguaje();
                case 2 -> BuscarLenguaje();
                case 3 -> EliminarLenguaje();
                case 4 -> gestion.ImprimirLenguajes();
                case 5 -> System.out.println("Saliendo del programa....");
                default -> System.out.println("Opcion no valida. Seleccione del 1 al 5.");
            }
        } while (opcion != 5);
    }

    private static void AgregarLenguaje() {
        System.out.print("Ingrese el anio de creacion: ");
        int anioCreacion = lector.nextInt();
        lector.nextLine(); 
        System.out.print("Ingrese la caracteristica principal: ");
        String caracteristicaPrincipal = lector.nextLine();
        System.out.print("Ingrese el nombre del lenguaje: ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese la utilizacion: ");
        String utilizacion = lector.nextLine();

        gestion.AgregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }
                                                    
    private static void BuscarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje que desea buscar: ");
        String nombre = lector.nextLine();
        LenguajeProgramacion lenguaje = gestion.BuscarLenguaje(nombre);
        if (lenguaje != null) {
            System.out.println("Lenguaje encontrado: " + lenguaje);
        } else {
            System.out.println("El lenguaje no ha sido encontrado.");
        }
    }

    private static void EliminarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje que desea eliminar: ");
        String nombre = lector.nextLine();
        System.out.println("Lenguaje eliminado");
        if (!gestion.EliminarLenguaje(nombre)) {
            System.out.println("No se pudo eliminar, el lenguaje no ha sido encontrado.");
        }
    }
}
    


