package org.example.Trabajadores.Especies;

public class Mamiferos extends Especies {

    public int patas;
    public int pelaje;

    public Mamiferos() {
        patas = 0;
        pelaje = 0;
    }

    public Mamiferos(String especie, int limpieza, Boolean enfermedad, int hambre, int patas, int pelaje) {
        super(especie, limpieza, enfermedad, hambre);
        this.patas = patas;
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPelaje() {
        return pelaje;
    }
    public void setPelaje(int pelaje) {
        this.pelaje = pelaje;
    }

    public class Leon extends Mamiferos {
        public Leon() {
            super("Leon", 5, false, 5, 4, 5);
        }
        public Leon(int limpieza, Boolean enfermedad, int hambre, int pelaje) {
            super("Leon", limpieza, enfermedad, hambre, 4, pelaje);
        }
    }

    public class Tigre extends Mamiferos {
        public Tigre() {
            super("Tigre", 5, false, 5, 4, 5);
        }
        public Tigre(int limpieza, Boolean enfermedad, int hambre, int pelaje) {
            super("Tigre", limpieza, enfermedad, hambre, 4, pelaje);
        }
    }

    public class Oso extends Mamiferos {
        public Oso() {
            super("Oso", 5, false, 5, 4, 5);
        }
        public Oso(int limpieza, Boolean enfermedad, int hambre, int pelaje) {
            super("Oso", limpieza, enfermedad, hambre, 4, pelaje);
        }
    }

    public class Elefante extends Mamiferos {
        public Elefante() {
            super("Elefante", 5, false, 5, 4, 5);
        }
        public Elefante(int limpieza, Boolean enfermedad, int hambre, int pelaje) {
            super("Elefante", limpieza, enfermedad, hambre, 4, pelaje);
        }
    }

}
