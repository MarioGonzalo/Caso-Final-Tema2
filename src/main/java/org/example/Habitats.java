package org.example;

public class Habitats {
    public String habitat;

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

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }

}
