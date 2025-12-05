package org.example;

public class CInventario {
    public static void main(String[] args) {

        ProductoAlmacen productoEjemplo = new ProductoAlmacen("COD-PRODUCTO-01", 50, 15.99);

        productoEjemplo.mostrarInfo();
        productoEjemplo.agregarStock(20);
        productoEjemplo.mostrarInfo();
    }
}

class ProductoAlmacen {

    String referenciaAlmacen;
    int cantidadDisponibles;
    double precioUnitario;

    public ProductoAlmacen(String referencia, int cantidad, double precio) {
        this.referenciaAlmacen = referencia;
        this.cantidadDisponibles = cantidad;
        this.precioUnitario = precio;
    }

    public void agregarStock(int cantidadEntrada) {
        cantidadDisponibles = cantidadDisponibles + cantidadEntrada;
        System.out.println("📦 Se agregó mercancía al inventario.");
    }

    public double valorTotal() {
        return cantidadDisponibles * precioUnitario;
    }

    public void mostrarInfo() {
        System.out.println("====================================");
        System.out.println("🔖 Referencia: " + referenciaAlmacen);
        System.out.println("📊 Cantidad en stock: " + cantidadDisponibles);
        System.out.println("💲 Precio unitario: $" + precioUnitario);
        System.out.println("💰 Valor total del inventario: $" + valorTotal());
        System.out.println("====================================");
    }
}

