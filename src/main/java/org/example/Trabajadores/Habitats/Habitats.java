package org.example.Trabajadores.Habitats;

public class Habitats {
    public String habitat;
    public int temp;
    public int humedad;
    public int limpieza;

    public Habitats() {
        habitat = "No definido";
    }

    public Habitats(String habitat, int temp, int humedad, int limpieza) {
        this.habitat = habitat;
        this.temp = temp;
        this.humedad = humedad;
        this.limpieza = limpieza;
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

    public void checkTemp(int temp) {
        if (temp < 0) {
            System.out.println("La temperatura: " + temp + " es muy baja, hay que calentar el hábitat");
        } else if (temp > 0 && temp < 20) {
            System.out.println("La temperatura: " + temp + " es baja, considere calentar el hábitat");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("La temperatura: " + temp + " es ideal");
        } else if (temp >= 30 && temp < 40) {
            System.out.println("La temperatura: " + temp + " es alta, considere enfriar el hábitat");
        } else if (temp >= 40) {
            System.out.println("La temperatura: " + temp + " es muy alta, hay que enfriar el hábitat");

        }
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public void checkHumedad(int humedad) {
        if (humedad < 0) {
            System.out.println("La humedad: " + humedad + " es muy baja, hay que aumentar la humedad del hábitat");
        } else if (humedad > 0 && humedad < 20) {
            System.out.println("La humedad: " + humedad + " es baja, considere aumentar la humedad del hábitat");
        } else if (humedad >= 20 && humedad < 30) {
            System.out.println("La humedad: " + humedad + " es ideal");
        } else if (humedad >= 30 && humedad < 40) {
            System.out.println("La humedad: " + humedad + " es alta, considere disminuir la humedad del hábitat");
        } else if (humedad >= 40) {
            System.out.println("La humedad: " + humedad + " es muy alta, hay que disminuir la humedad del hábitat");

        }
    }

    public int getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(int limpieza) {
        this.limpieza = limpieza;
    }

    public void checkLimpieza(int limpieza) {
        if (limpieza < 0) {
            System.out.println("La limpieza no puede ser negativa");
        } else if (limpieza > 0 && limpieza < 30) {
            System.out.println("La limpieza: " + limpieza + " es muy baja, limpie el hábitat");
        } else if (limpieza >= 30 && limpieza < 50) {
            System.out.println("La limpieza: " + limpieza + " es baja, considere limpiar el hábitat");
        } else if (limpieza >= 50 && limpieza < 70) {
            System.out.println("La limpieza: " + limpieza + " es aceptable, puede limpiar el hábitat más tarde");
        } else if (limpieza >= 70 && limpieza < 100) {
            System.out.println("La limpieza: " + limpieza + " es ideal, no es necesario limpiar el hábitat");
        } else {
            System.out.println("La limpieza no puede ser mayor a 100");
        }
    }







        @Override
        public String toString() {
            return "Habitat: " + habitat +
                    ", Temperatura: " + temp +
                    ", Humedad: " + humedad +
                    ", Limpieza: " + limpieza;
        }

    }

