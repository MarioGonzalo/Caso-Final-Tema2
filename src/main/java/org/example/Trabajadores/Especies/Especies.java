package org.example.Trabajadores.Especies;

public class Especies {
    public String especie;
    public int limpieza;
    public Boolean enfermedad;
    public int hambre;

    public Especies() {
        especie = "No definido";
    }

    public Especies(String especie, int limpieza, Boolean enfermedad, int hambre) {
        this.especie = especie;
        this.limpieza = limpieza;
        this.enfermedad = enfermedad;
        this.hambre = hambre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(int limpieza) {
        this.limpieza = limpieza;
    }

    public Boolean getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void checkHambre(int hambre) {
        if (hambre < 0) {
            System.out.println("El hambre: " + hambre + " es muy baja, no hay que alimentar al animal");
        } else if (hambre > 0 && hambre < 20) {
            System.out.println("El hambre: " + hambre + " es baja, no hay que alimentar al animal");
        } else if (hambre >= 20 && hambre < 40) {
            System.out.println("El hambre: " + hambre + " es ideal");
        } else if (hambre >= 40 && hambre < 70) {
            System.out.println("El hambre: " + hambre + " es alta, considere alimentar al animal");
        } else if (hambre >= 70) {
            System.out.println("El hambre: " + hambre + " es muy alta, hay que alimentar al animal");
        }
    }

    public void checkLimpieza(int limpieza) {
        if (limpieza < 0) {
            System.out.println("La limpieza: " + limpieza + " es muy baja, debe limpiar el hábitat");
        } else if (limpieza > 0 && limpieza < 30) {
            System.out.println("La limpieza: " + limpieza + " es baja, considere limpiar el hábitat");
        } else if (limpieza >= 30 && limpieza < 50) {
            System.out.println("La limpieza: " + limpieza + " es aceptable, puede limpiar el hábitat más tarde");
        } else if (limpieza >= 50 && limpieza < 70) {
            System.out.println("La limpieza: " + limpieza + " es buena, no es necesario limpiar el hábitat");
        } else if (limpieza >= 70 && limpieza < 100) {
            System.out.println("La limpieza: " + limpieza + " es muy alta, no es necesario limpiar el hábitat");
        } else {
            System.out.println("La limpieza no puede ser mayor a 100");
        }
    }

    public void checkEnfermedad(Boolean enfermedad) {
        if (enfermedad) {
            System.out.println("El animal está enfermo, llame al veterinario");
        } else {
            System.out.println("El animal está sano");
        }
    }

    @Override
    public String toString() {
        return "Especie: " + especie +
                ", Limpieza: " + limpieza +
                ", Enfermedad: " + enfermedad +
                ", Hambre: " + hambre;
    }
}
