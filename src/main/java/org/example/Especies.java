package org.example;

public class Especies {
    public String especie;


    public Especies() {
        especie = "No definido";
    }
    public Especies(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }


    @Override
    public String toString() {
        return "Especie: " + especie;
    }
}
