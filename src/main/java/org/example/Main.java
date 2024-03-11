package org.example;

import org.example.Trabajadores.Habitats;

public class Main {
    public static void main(String[] args) {
        Habitats h1 = new Habitats("Pawada", 25, 30, 50);
        System.out.println(h1.toString()); // {habitat: Acuático, temp: 25, humedad: 30, limpieza: 50}
        h1.checkTemp(h1.getTemp()); // La temperatura: 25 es ideal
        h1.checkHumedad(h1.getHumedad()); // La humedad: 30 es ideal
        h1.checkLimpieza(h1.getLimpieza()); // La limpieza: 50 es ideal

    }
}