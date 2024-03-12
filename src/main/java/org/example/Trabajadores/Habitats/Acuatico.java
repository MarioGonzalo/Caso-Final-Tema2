package org.example.Trabajadores.Habitats;

public class Acuatico extends Habitats {
    public int estadoAgua;

    public Acuatico() {
        super();
        estadoAgua = 0;
    }

    public Acuatico(String habitat, int temp, int limpieza, int humedad, int estadoAgua) {
        super(habitat, temp, limpieza, humedad);
        this.estadoAgua = estadoAgua;
    }

    public int getEstadoAgua() {
        return estadoAgua;
    }

    public void setEstadoAgua(int estadoAgua) {
        this.estadoAgua = estadoAgua;
    }

    public void checkEstadoAgua(int estadoAgua) {
        if (estadoAgua < 0) {
            System.out.println("El estado del agua no puede ser negativo");
        } else if (estadoAgua > 0 && estadoAgua < 30) {
            System.out.println("El estado del agua: " + estadoAgua + " es muy bajo, mejore el estado del agua del hábitat");
        } else if (estadoAgua >= 30 && estadoAgua < 50) {
            System.out.println("El estado del agua: " + estadoAgua + " es bajo, considere mejorar el estado del agua del hábitat");
        } else if (estadoAgua >= 50 && estadoAgua < 70) {
            System.out.println("El estado del agua: " + estadoAgua + " es aceptable, puede mejorar el estado del agua del hábitat más tarde");
        } else if (estadoAgua >= 70 && estadoAgua < 100) {
            System.out.println("El estado del agua: " + estadoAgua + " es ideal, no es necesario mejorar el estado del agua del hábitat");
        } else {
            System.out.println("El estado del agua no puede ser mayor a 100");
        }
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat +
                ", Temperatura: " + temp +
                ", Humedad: " + humedad +
                ", Limpieza: " + limpieza +
                ", Estado del agua: " + estadoAgua;
    }
}
