package org.example.Visitantes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Clase para el guía virtual
public class Visitantes {
    public void proporcionarTourPersonalizado() {
        System.out.println("Bienvenido al tour virtual. Por favor, seleccione su tipo de interés:");
        System.out.println("1. Mamíferos");
        System.out.println("2. Aves");
        System.out.println("3. Acuáticos");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("¡Descubra el fascinante mundo de los mamíferos!");
                break;
            case 2:
                System.out.println("¡Aprenda todo sobre las diversas especies de aves!");
                break;
            case 3:
                System.out.println("¡Sumérjase en el emocionante hábitat acuático!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Mostrando información sobre los animales y hábitats a través del guía virtual.");
    }
}

// Clase para el quiosco interactivo
class QuioscoInteractivo {
    private Map<String, String> informacionAnimales;

    public QuioscoInteractivo() {
        informacionAnimales = new HashMap<>();
        informacionAnimales.put("León", "El león es el rey de la selva");
        informacionAnimales.put("Tigre", "El tigre es un majestuoso felino");
        informacionAnimales.put("Pingüino", "Los pingüinos son aves que viven en las regiones polares");
    }

    public void proporcionarTourPersonalizado() {
        System.out.println("Bienvenido al quiosco interactivo. Por favor, seleccione su tipo de interés:");
        System.out.println("1. Información sobre animales");
        System.out.println("2. Mapa del zoológico");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Seleccione un animal para obtener más información:");
                for (String animal : informacionAnimales.keySet()) {
                    System.out.println("- " + animal);
                }
                String seleccion = scanner.nextLine();
                String informacion = informacionAnimales.get(seleccion);
                if (informacion != null) {
                    System.out.println(informacion);
                } else {
                    System.out.println("Animal no encontrado en la base de datos.");
                }
                break;
            case 2:
                System.out.println("Mapa del zoológico en construcción...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Mostrando información sobre los animales y hábitats desde el quiosco interactivo.");
    }
}
