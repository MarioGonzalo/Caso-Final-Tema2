package org.example.Trabajadores.Habitats;

public class Terrestre extends Habitats {
    public int vegetacion;

    public Terrestre() {
        vegetacion = 0;
    }

    public Terrestre(String habitat, int temp, int humedad, int limpieza, int vegetacion) {
        super(habitat, temp, humedad, limpieza);
        this.vegetacion = vegetacion;
    }


    public int getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(int vegetacion) {
        this.vegetacion = vegetacion;
    }

    public void checkVegetacion(int vegetacion) {
        if (vegetacion < 0) {
            System.out.println("La vegetación no puede ser negativa");
        } else if (vegetacion > 0 && vegetacion < 30) {
            System.out.println("La vegetación: " + vegetacion + " es muy baja, aumente la vegetación del hábitat");
        } else if (vegetacion >= 30 && vegetacion < 50) {
            System.out.println("La vegetación: " + vegetacion + " es baja, considere aumentar la vegetación del hábitat");
        } else if (vegetacion >= 50 && vegetacion < 70) {
            System.out.println("La vegetación: " + vegetacion + " es ideal, puede mantener la vegetación del hábitat");
        } else if (vegetacion >= 70 && vegetacion < 100) {
            System.out.println("La vegetación: " + vegetacion + " es excesiva, considere reducir la vegetación del hábitat");
        } else {
            System.out.println("La vegetación no puede ser mayor a 100");
        }
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat +
                ", Temperatura: " + temp +
                ", Humedad: " + humedad +
                ", Limpieza: " + limpieza +
                ", Vegetación: " + vegetacion;
    }

}