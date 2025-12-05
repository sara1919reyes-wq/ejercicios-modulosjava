package org.example;

public class SReservasA {

    String codigoVuelo;
    int capacidadMaxima;
    int asientosReservados;

    public SReservasA(String codigo, int capacidad, int reservados) {
        codigoVuelo = codigo;
        capacidadMaxima = capacidad;
        asientosReservados = reservados;
    }

    public void reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            System.out.println("Reserva exitosa.");
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    public double porcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }

    public static void main(String[] args) {
        SReservasA vuelo1 = new SReservasA("MX2045", 120, 115);

        System.out.println("Código del vuelo: " + vuelo1.codigoVuelo);
        System.out.println("Asientos reservados: " + vuelo1.asientosReservados + "/" + vuelo1.capacidadMaxima);
        System.out.println("Porcentaje de ocupación: " + vuelo1.porcentajeOcupacion() + "%");

        vuelo1.reservarAsiento();
        vuelo1.reservarAsiento();
        vuelo1.reservarAsiento();
        vuelo1.reservarAsiento();

        System.out.println("Reservaciones finales: " + vuelo1.asientosReservados + "/" + vuelo1.capacidadMaxima);
        System.out.println("Porcentaje actualizado: " + vuelo1.porcentajeOcupacion() + "%");
    }
}

