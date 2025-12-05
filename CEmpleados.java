package org.example;

public class CEmpleados {

    String claveEmpleado;
    double salarioMensual;
    double porcentajeImpuestos;

    public CEmpleados(String clave, double salario, double impuestos) {
        claveEmpleado = clave;
        salarioMensual = salario;
        porcentajeImpuestos = impuestos;
    }

    public double calcularSalarioNeto() {
        double descuento = salarioMensual * (porcentajeImpuestos / 100);
        return salarioMensual - descuento;
    }

    public void aplicarAumento(double porcentajeAumento) {
        salarioMensual = salarioMensual + (salarioMensual * (porcentajeAumento / 100));
    }

    public static void main(String[] args) {
        CEmpleados empleado1 = new CEmpleados("EMP005", 12000, 8);

        System.out.println("Clave de empleado: " + empleado1.claveEmpleado);
        System.out.println("Salario actual: " + empleado1.salarioMensual);

        System.out.println("Salario neto: " + empleado1.calcularSalarioNeto());

        empleado1.aplicarAumento(10);
        System.out.println("Nuevo salario después del aumento: " + empleado1.salarioMensual);
    }
}
