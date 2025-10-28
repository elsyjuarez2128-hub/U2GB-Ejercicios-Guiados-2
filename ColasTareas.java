/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebras;

/**
 *
 * @author Elsy Joselyn Godinez Juarez
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColasTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> colaTareas = new LinkedList<>();

        // Agregar las tareas iniciales
        colaTareas.add("Preparar café");
        colaTareas.add("Revisar emails");
        colaTareas.add("Iniciar proyecto");

        int opcion;
        do {
            System.out.println("\n===== MENÚ DE COLA DE TAREAS =====");
            System.out.println("1. Mostrar tareas en cola");
            System.out.println("2. Consultar tamaño");
            System.out.println("3. Consultar frente");
            System.out.println("4. Quitar tarea (ejecutar)");
            System.out.println("5. Agregar nueva tarea");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n Estado actual de la cola:");
                    if (colaTareas.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        for (String tarea : colaTareas) {
                            System.out.println(" - " + tarea);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n📏 Tamaño actual: " + colaTareas.size());
                    break;

                case 3:
                    if (!colaTareas.isEmpty()) {
                        System.out.println("\n👀 Tarea al frente: " + colaTareas.peek());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;

                case 4:
                    if (!colaTareas.isEmpty()) {
                        String tareaEjecutada = colaTareas.poll();
                        System.out.println("\n✅ Tarea ejecutada: " + tareaEjecutada);
                    } else {
                        System.out.println("No hay tareas para ejecutar.");
                    }
                    break;

                case 5:
                    System.out.print("\nEscribe la nueva tarea: ");
                    String nuevaTarea = sc.nextLine();
                    colaTareas.add(nuevaTarea);
                    System.out.println("Tarea agregada correctamente.");
                    break;

                case 6:
                    System.out.println("\n🚪 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 6);

        // Mostrar estado final de la cola
        System.out.println("\n===== ESTADO FINAL DE LA COLA =====");
        if (colaTareas.isEmpty()) {
            System.out.println("No quedan tareas pendientes.");
        } else {
            for (String tarea : colaTareas) {
                System.out.println(" - " + tarea);
            }
        }

        sc.close();
    }
}

