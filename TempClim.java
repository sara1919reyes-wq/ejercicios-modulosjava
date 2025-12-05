package org.example;

public class TempClim {

    double valorTemperatura;
    String unidadMedida;
    String fechaRegistro;

    public TempClim(double valor, String unidad, String fecha) {
        valorTemperatura = valor;
        unidadMedida = unidad;
        fechaRegistro = fecha;
    }

    public void convertirTemperatura() {
        if (unidadMedida.equalsIgnoreCase("Celsius")) {
            valorTemperatura = (valorTemperatura * 9 / 5) + 32;
            unidadMedida = "Fahrenheit";
        } else if (unidadMedida.equalsIgnoreCase("Fahrenheit")) {
            valorTemperatura = (valorTemperatura - 32) * 5 / 9;
            unidadMedida = "Celsius";
        }
    }

    public boolean esExtrema() {
        if (unidadMedida.equalsIgnoreCase("Celsius")) {
            return valorTemperatura > 40;
        } else {
            return valorTemperatura > 104;
        }
    }

    public static void main(String[] args) {
        TempClim registro1 = new TempClim(38, "Celsius", "05-12-2025");

        System.out.println("Temperatura registrada: " + registro1.valorTemperatura + " " + registro1.unidadMedida);
        System.out.println("Fecha: " + registro1.fechaRegistro);

        System.out.println("¿Es extrema?: " + registro1.esExtrema());

        registro1.convertirTemperatura();

        System.out.println("Temperatura convertida: " + registro1.valorTemperatura + " " + registro1.unidadMedida);
        System.out.println("¿Es extrema ahora?: " + registro1.esExtrema());
    }
}
