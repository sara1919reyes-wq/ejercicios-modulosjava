package org.example;

public class DVehiculos {

    String marcaVehiculo;
    int anioFabricacion;
    int velocidadMaxima;

    public DVehiculos(String marca, int anio, int velocidad) {
        marcaVehiculo = marca;
        anioFabricacion = anio;
        velocidadMaxima = velocidad;
    }

    public String encenderVehiculo() {
        if (anioFabricacion >= 1995) {
            return "Vehículo encendido correctamente.";
        } else {
            return "El vehículo es demasiado antiguo para encender.";
        }
    }

    public int calcularAntiguedad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - anioFabricacion;
    }

    public static void main(String[] args) {
        DVehiculos auto1 = new DVehiculos("Toyota", 2015, 200);

        System.out.println("Marca: " + auto1.marcaVehiculo);
        System.out.println("Año: " + auto1.anioFabricacion);
        System.out.println("Velocidad Máxima: " + auto1.velocidadMaxima + " km/h");

        System.out.println(auto1.encenderVehiculo());
        System.out.println("Antigüedad del vehículo: " + auto1.calcularAntiguedad() + " años.");
    }
}
