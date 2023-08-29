package com.mycompany.act2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACT2 {
    public static void main(String[] args) {
        int memoriaTotal = 2000;
        int memoriaUtilizada = 100;  
        Scanner scanner = new Scanner(System.in);

        List<Particion> particiones = new ArrayList<>();
        List<Proceso> procesos = new ArrayList<>();

        System.out.print("Ingrese el número de particiones adicionales: ");
        int numParticiones = scanner.nextInt();

        for (int i = 0; i < numParticiones; i++) {
            System.out.print("Ingrese el tamaño de la partición " + (i + 1) + ": ");
            int tamanoParticion = scanner.nextInt();
            particiones.add(new Particion("Partición " + (i + 1), tamanoParticion));
        }
        
        particiones.add(0, new Particion("Sistema Operativo", 100)); 
        procesos.add(new Proceso("java", 200));
        procesos.add(new Proceso("word", 700));
        procesos.add(new Proceso("paint", 1000));

        for (int i = 0; i < procesos.size(); i++) {
            Proceso proceso = procesos.get(i);
            boolean asignado = false;

            for (int j = 0; j < particiones.size(); j++) {
                Particion particion = particiones.get(j);

                if (!particion.ocupada && particion.tamano >= proceso.tamano) {
                    particion.ocupada = true;
                    particion.nombreProceso = proceso.nombre;
                    asignado = true;
                    System.out.println(proceso.nombre + " asignado a la partición " + particion.nombre);
                    memoriaUtilizada += proceso.tamano;
                    break;
                }
            }

            if (!asignado) {
                System.out.println(proceso.nombre + " no pudo ser asignado a la memoria");
            }
        }

        int memoriaDisponible = memoriaTotal - memoriaUtilizada;
        if (memoriaDisponible < 0) {
            
        }
        
        System.out.println("Memoria disponible: " + memoriaDisponible);

        // Cierre del Scanner
        scanner.close();
    }
}