package org.example;

import org.example.Trabajadores.Habitats.Acuatico;
import org.example.Visitantes.Visitantes;
import org.example.Trabajadores.Habitats.Aereo;
import org.example.Trabajadores.Habitats.Terrestre;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir){
            System.out.println("Bienvenido al zoológico");
            System.out.println("1. Ver hábitats");
            System.out.println("2. Ver visitantes");
            System.out.println("3. Salir");
            int opcion = 1;
            switch (opcion){
                case 1:
                    System.out.println("Hábitats");
                    System.out.println("1. Terrestre");
                    System.out.println("2. Aéreo");
                    System.out.println("3. Acuático");
                    int opcionHabitat = 1;
                    switch (opcionHabitat){
                        case 1:
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp = sc.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad = sc.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza = sc.nextInt();
                            System.out.println("Ingrese la vegetación del hábitat");
                            int vegetacion = sc.nextInt();
                            Terrestre t1 = new Terrestre("Terrestre", temp, humedad, limpieza, vegetacion);
                            System.out.println(t1.toString());
                            break;
                        case 2:
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp2 = sc2.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad2 = sc2.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza2 = sc2.nextInt();
                            System.out.println("Ingrese la estado del aire del hábitat");
                            int estadoAire = sc2.nextInt();
                            Aereo a1 = new Aereo("Aereo", temp2, humedad2, limpieza2, estadoAire);
                            System.out.println(a1.toString());
                            break;
                        case 3:
                            Scanner sc3 = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp3 = sc3.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad3 = sc3.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza3 = sc3.nextInt();
                            System.out.println("Ingrese el estado del agua del hábitat");
                            int estadoAgua = sc3.nextInt();
                            Acuatico ac1 = new Acuatico("Acuatico", temp3, humedad3, limpieza3, estadoAgua);
                            System.out.println(ac1.toString());
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Visitantes");
                    Visitantes v1 = new Visitantes();
                    System.out.println(v1.toString());
                    break;
                case 3:
                    seguir = false;
                    break;
            }

        }
        Acuatico a1 = new Acuatico();
        System.out.println(a1.toString()); // {estadoAgua: 40}

    }
}