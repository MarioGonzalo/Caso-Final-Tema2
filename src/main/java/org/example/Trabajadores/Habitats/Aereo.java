package org.example.Trabajadores.Habitats;

public class Aereo extends Habitats {
    public int nidos;

    public Aereo() {
        nidos = 0;
    }
    public Aereo(String habitat, int temp, int humedad, int limpieza, int nidos) {
        super(habitat, temp, humedad, limpieza);
        this.nidos = nidos;
    }

    public int getNidos() {
        return nidos;
    }

    public void setNidos(int nidos) {
        this.nidos = nidos;
    }

    public void checkNidos(int nidos) {
        if (nidos < 0) {
            System.out.println("El número de nidos no puede ser negativo");
        } else if (nidos > 0 && nidos < 30) {
            System.out.println("El número de nidos: " + nidos + " es muy bajo, aumente el número de nidos del hábitat");
        } else if (nidos >= 30 && nidos < 50) {
            System.out.println("El número de nidos: " + nidos + " es bajo, considere aumentar el número de nidos del hábitat");
        } else if (nidos >= 50 && nidos < 70) {
            System.out.println("El número de nidos: " + nidos + " es ideal, puede mantener el número de nidos del hábitat");
        } else if (nidos >= 70 && nidos < 100) {
            System.out.println("El número de nidos: " + nidos + " es excesivo, considere reducir el número de nidos del hábitat");
        } else {
            System.out.println("El número de nidos no puede ser mayor a 100");
        }
    }

}
