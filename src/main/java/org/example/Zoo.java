package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class Zoo {
    static class Recurso {
        private String nombre;
        private int cantidadDisponible;

        public Recurso(String nombre, int cantidadDisponible) {
            this.nombre = nombre;
            this.cantidadDisponible = cantidadDisponible;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }

        public void setCantidadDisponible(int cantidadDisponible) {
            this.cantidadDisponible = cantidadDisponible;
        }
    }

    // Clase para administrar los recursos del zoológico
    public static class AdministradorRecursos {
        private static Map<String, Recurso> inventario = new HashMap<>();

        // Método estático para agregar un nuevo recurso al inventario
        public void agregarRecurso(String nombre, int cantidadInicial) {
            inventario.put(nombre, new Recurso(nombre, cantidadInicial));
        }

        // Método estático para obtener la cantidad disponible de un recurso dado su nombre
        public static int obtenerCantidadDisponible(String nombreRecurso) {
            Recurso recurso = inventario.get(nombreRecurso);
            if (recurso != null) {
                return recurso.getCantidadDisponible();
            }
            return 0;
        }

        // Método estático para actualizar la cantidad disponible de un recurso
        public static void actualizarCantidadRecurso(String nombreRecurso, int nuevaCantidad) {
            Recurso recurso = inventario.get(nombreRecurso);
            if (recurso != null) {
                recurso.setCantidadDisponible(nuevaCantidad);
            }
        }

        // Método estático para realizar un pedido de un recurso
        public static void hacerPedido(String nombreRecurso, int cantidadPedido) {
            // Aquí se simularía el proceso de pedido al proveedor
            System.out.println("Se ha realizado un pedido de " + cantidadPedido + " unidades de " + nombreRecurso + " al proveedor.");
        }
    }


    static class TareaMantenimiento {
        private String descripcion;
        private boolean esUrgente;

        public TareaMantenimiento(String descripcion, boolean esUrgente) {
            this.descripcion = descripcion;
            this.esUrgente = esUrgente;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public boolean esUrgente() {
            return esUrgente;
        }
    }

    // Clase para administrar el mantenimiento y la seguridad del zoológico
    class MantenimientoSeguridad {
        private List<TareaMantenimiento> tareasPendientes;

        public MantenimientoSeguridad() {
            this.tareasPendientes = new ArrayList<>();
        }

        // Agregar una nueva tarea de mantenimiento o reparación
        public void agregarTarea(String descripcion, boolean esUrgente) {
            tareasPendientes.add(new TareaMantenimiento(descripcion, esUrgente));
        }

        // Obtener la lista de tareas pendientes
        public List<TareaMantenimiento> getTareasPendientes() {
            return tareasPendientes;
        }

        // Método para activar el sistema de seguridad
        public void activarSistemaSeguridad() {
            // Aquí se simularía la activación del sistema de seguridad, por ejemplo, encendiendo cámaras y sensores.
            System.out.println("Sistema de seguridad activado.");
        }

        // Método para desactivar el sistema de seguridad
        public void desactivarSistemaSeguridad() {
            // Aquí se simularía la desactivación del sistema de seguridad, por ejemplo, apagando cámaras y sensores.
            System.out.println("Sistema de seguridad desactivado.");
        }
    }

}
