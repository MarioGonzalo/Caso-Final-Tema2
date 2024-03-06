package org.example;

public class Habitats {
    public String habitat;
    public int temp;
    public int humedad;
    public int limpieza;

    public Habitats() {
        habitat = "No definido";
    }
    public Habitats(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public void checkTemp(int temp){
        if (temp < 0){
            System.out.println("La temperatura: " + temp + " es muy baja, hay que calentar el hábitat");
        } else if (temp > 0 && temp < 20){
            System.out.println("La temperatura: " + temp + " es baja, considere calentar el hábitat");
        } else if (temp > 20 && temp < 30){
            System.out.println("La temperatura: " + temp + " es ideal");
        } else if (temp > 30 && temp < 40){
            System.out.println("La temperatura: " + temp + " es alta, considere enfriar el hábitat");
        } else if (temp > 40){
            System.out.println("La temperatura: " + temp + " es muy alta, hay que enfriar el hábitat");

        }
    }
    public int getHumedad() {
        return humedad;
    }
    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }
    public int getLimpieza() {
        return limpieza;
    }
    public void setLimpieza(int limpieza) {
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat +
                ", Temperatura: " + temp +
                ", Humedad: " + humedad +
                ", Limpieza: " + limpieza;
    }

}
