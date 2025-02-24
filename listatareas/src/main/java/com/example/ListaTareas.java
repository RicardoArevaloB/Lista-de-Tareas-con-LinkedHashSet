package com.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ListaTareas {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedHashSet<String> tareas = new LinkedHashSet<>();

            System.out.println("Ingrese sus tareas y escriba 'fin' para terminar el registro de las tareas:");

            while (true) {
                System.out.print("Tarea: ");
                String tarea = sc.nextLine();

                if (tarea.equalsIgnoreCase("fin")) {
                    break;
                }

                tareas.add(tarea);
            }

            System.out.println("\nLista de tareas:");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }

            System.out.print("\nIngrese el nombre de la tarea que desea eliminar: ");
            String tareaEliminar = sc.nextLine();

            if (tareas.remove(tareaEliminar)) {
                System.out.println("La tarea '" + tareaEliminar + "' ha sido eliminada.");
            } else {
                System.out.println("La tarea '" + tareaEliminar + "' no está en la lista.");
            }

            System.out.println("\nLista de tareas actualizada:");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }

            sc.close();
        }

    }
}