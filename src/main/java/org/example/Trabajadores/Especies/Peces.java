package org.example.Trabajadores.Especies;

public class Peces {

public int aletas;
    public int escamas;

    public Peces() {
        aletas = 0;
        escamas = 0;
    }

    public Peces(String especie, int limpieza, Boolean enfermedad, int hambre, int aletas, int escamas) {
        this.aletas = aletas;
        this.escamas = escamas;
    }

    public int getAletas() {
        return aletas;
    }
    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getEscamas() {
        return escamas;
    }
    public void setEscamas(int escamas) {
        this.escamas = escamas;
    }

    public class PezGlobo extends Peces {
        public PezGlobo() {
            super("Pez globo", 5, false, 5, 2, 5);
        }
        public PezGlobo(int limpieza, Boolean enfermedad, int hambre, int escamas) {
            super("Pez globo", limpieza, enfermedad, hambre, 2, escamas);
        }
    }

    public class PezPayaso extends Peces {
        public PezPayaso() {
            super("Pez payaso", 5, false, 5, 2, 5);
        }
        public PezPayaso(int limpieza, Boolean enfermedad, int hambre, int escamas) {
            super("Pez payaso", limpieza, enfermedad, hambre, 2, escamas);
        }
    }

    public class MantaRaya extends Peces {
        public MantaRaya() {
            super("Manta raya", 5, false, 5, 2, 5);
        }
        public MantaRaya(int limpieza, Boolean enfermedad, int hambre, int escamas) {
            super("Manta raya", limpieza, enfermedad, hambre, 2, escamas);
        }
    }

    public class CaballitoMar extends Peces {
        public CaballitoMar() {
            super("Caballito de mar", 5, false, 5, 2, 5);
        }
        public CaballitoMar(int limpieza, Boolean enfermedad, int hambre, int escamas) {
            super("Caballito de mar", limpieza, enfermedad, hambre, 2, escamas);
        }
    }
}
