package org.example.Trabajadores.Especies;

public class Aves {
    public int alas;
    public int plumaje;

    public Aves() {
        alas = 0;
        plumaje = 0;
    }

    public Aves(String especie, int limpieza, Boolean enfermedad, int hambre, int alas, int plumaje) {
        this.alas = alas;
        this.plumaje = plumaje;
    }

    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getPlumaje() {
        return plumaje;
    }
    public void setPlumaje(int plumaje) {
        this.plumaje = plumaje;
    }

    public class Aguila extends Aves {
        public Aguila() {
            super("Aguila", 5, false, 5, 2, 5);
        }
        public Aguila(int limpieza, Boolean enfermedad, int hambre, int plumaje) {
            super("Aguila", limpieza, enfermedad, hambre, 2, plumaje);
        }
    }

    public class Cotorro extends Aves {
        public Cotorro() {
            super("Cotorro", 5, false, 5, 2, 5);
        }
        public Cotorro(int limpieza, Boolean enfermedad, int hambre, int plumaje) {
            super("Cotorro", limpieza, enfermedad, hambre, 2, plumaje);
        }
    }

    public class Loro extends Aves {
        public Loro() {
            super("Loro", 5, false, 5, 2, 5);
        }
        public Loro(int limpieza, Boolean enfermedad, int hambre, int plumaje) {
            super("Loro", limpieza, enfermedad, hambre, 2, plumaje);
        }
    }

    public class Pinguino extends Aves {
        public Pinguino() {
            super("Pinguino", 5, false, 5, 2, 5);
        }
        public Pinguino(int limpieza, Boolean enfermedad, int hambre, int plumaje) {
            super("Pinguino", limpieza, enfermedad, hambre, 2, plumaje);
        }
    }
}
