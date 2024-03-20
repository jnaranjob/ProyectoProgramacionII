/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoprogramacionii;

/**
 *
 * @author Usuario
 */
public class ProyectoProgramacionII {

    public static void main(String[] args) {
        
        int opcion = 0;

        while (opcion != 3) {
            mostrarMenu();
   
            switch (opcion) {
                case 1:
                    mostrarNombre();
                    break;
                case 2:
                    mostrarEdad();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }  
        }
    }
    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar Nombre");
        System.out.println("2. Mostrar Edad");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarNombre() {
        System.out.println("Mi nombre es Juan Pérez");
    }

    public static void mostrarEdad() {
        System.out.println("Tengo 30 años");
    }
}
