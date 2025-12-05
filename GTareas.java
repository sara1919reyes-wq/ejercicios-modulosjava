package org.example;

public class GTareas {

    String descripcionTarea;
    String prioridadAsignada;
    boolean tareaCompletada;

    public GTareas(String descripcion, String prioridad) {
        descripcionTarea = descripcion;
        prioridadAsignada = prioridad;
        tareaCompletada = false;
    }

    public void marcarComoCompletada() {
        tareaCompletada = true;
    }

    public boolean esUrgente() {
        return prioridadAsignada.equalsIgnoreCase("Alta") && !tareaCompletada;
    }

    public static void main(String[] args) {
        GTareas tarea1 = new GTareas("Entregar proyecto de programación", "Alta");

        System.out.println("Descripción: " + tarea1.descripcionTarea);
        System.out.println("Prioridad: " + tarea1.prioridadAsignada);
        System.out.println("¿Está completada?: " + tarea1.tareaCompletada);

        System.out.println("¿La tarea es urgente?: " + tarea1.esUrgente());

        tarea1.marcarComoCompletada();

        System.out.println("Tarea marcada como completada");
        System.out.println("¿Está completada?");
    }
}
