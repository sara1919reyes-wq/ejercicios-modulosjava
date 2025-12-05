package org.example;

public class Glibros {
    public static void main(String[] args) {

        LibroRegistrado libroEjemplo = new LibroRegistrado("SRR-019", "SARA REYES", 10);

        libroEjemplo.mostrarInformacion();

        libroEjemplo.reservarLibro();

        libroEjemplo.mostrarInformacion();
    }
}

class LibroRegistrado {

    String codigoIdentificador;
    String nombreAutor;
    boolean estadoPrestamo;
    int añosPublicacion;

    public LibroRegistrado(String codigo, String autor, int antiguedad) {
        this.codigoIdentificador = codigo;
        this.nombreAutor = autor;
        this.añosPublicacion = antiguedad;
        this.estadoPrestamo = false;
    }

    public void reservarLibro() {
        if (!estadoPrestamo) {
            estadoPrestamo = true;
            System.out.println("📘 El libro ha sido reservado con éxito.");
        } else {
            System.out.println("⚠️ El libro ya está prestado y no se puede reservar.");
        }
    }

    public boolean esApto() {
        return añosPublicacion > 5;
    }

    public void mostrarInformacion() {
        System.out.println("====================================");
        System.out.println("📚 Código del libro: " + codigoIdentificador);
        System.out.println("👤 Autor: " + nombreAutor);
        System.out.println("📅 Antigüedad: " + añosPublicacion + " años");
        System.out.println("📦 Estado: " + (estadoPrestamo ? "Prestado" : "Disponible"));
        System.out.println("🔎 Apto para préstamo: " + (esApto() ? "Sí" : "No"));
        System.out.println("====================================");
    }
}


