package org.example;

public class BGeometria {
    public static void main(String[] args) {

        RectanguloDatos rectanguloEjemplo = new RectanguloDatos("FIG-RECT-01", 12.5, 8.2);

        rectanguloEjemplo.mostrarInformacion();

        System.out.println("Área calculada: " + rectanguloEjemplo.calcularArea());
        System.out.println("Perímetro calculado: " + rectanguloEjemplo.calcularPerimetro());
    }
}

class RectanguloDatos {

    String etiquetaIdentificacion;
    double medidaBase;
    double medidaAltura;

    public RectanguloDatos(String etiqueta, double base, double altura) {
        this.etiquetaIdentificacion = etiqueta;
        this.medidaBase = base;
        this.medidaAltura = altura;
    }

    public double calcularArea() {
        return medidaBase * medidaAltura;
    }

    public double calcularPerimetro() {
        return 2 * (medidaBase + medidaAltura);
    }

    public void mostrarInformacion() {
        System.out.println("====================================");
        System.out.println("📐 Identificador: " + etiquetaIdentificacion);
        System.out.println("📏 Base: " + medidaBase);
        System.out.println("📏 Altura: " + medidaAltura);
        System.out.println("====================================");
    }
}

