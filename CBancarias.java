package org.example;

public class CBancarias {
    public static void main(String[] args) {

        CuentaSimple cuentaEjemplo = new CuentaSimple("CTA-001", "Sara Reyes", 1500.00);

        cuentaEjemplo.mostrarDatos();

        cuentaEjemplo.depositar(500.00);

        cuentaEjemplo.retirar(200.00);

        cuentaEjemplo.retirar(2000.00);

        cuentaEjemplo.mostrarDatos();
    }
}

class CuentaSimple {

    String numeroCuenta;
    String nombreTitular;
    double saldoActual;

    public CuentaSimple(String cuenta, String titular, double saldo) {
        this.numeroCuenta = cuenta;
        this.nombreTitular = titular;
        this.saldoActual = saldo;
    }

    public void depositar(double cantidadDeposito) {
        saldoActual = saldoActual + cantidadDeposito;
        System.out.println("💰 Depósito realizado con éxito.");
    }

    public void retirar(double cantidadRetiro) {
        if (cantidadRetiro <= saldoActual) {
            saldoActual = saldoActual - cantidadRetiro;
            System.out.println(" Retiro realizado correctamente.");
        } else {
            System.out.println("⚠️ No es posible retirar: saldo insuficiente.");
        }
    }

    public void mostrarDatos() {
        System.out.println("====================================");
        System.out.println("🏦 Número de cuenta: " + numeroCuenta);
        System.out.println("👤 Titular: " + nombreTitular);
        System.out.println("💳 Saldo actual: $" + saldoActual);
        System.out.println("====================================");
    }
}
