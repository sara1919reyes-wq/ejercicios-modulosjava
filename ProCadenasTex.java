package org.example;

public class ProCadenasTex {

    String cadenaTexto;
    String identificadorModulo;
    int longitudMaxima;

    public ProCadenasTex(String cadena, String id, int maxLongitud) {
        cadenaTexto = cadena;
        identificadorModulo = id;
        longitudMaxima = maxLongitud;
    }

    public void agregarPrefijo(String prefijo) {
        String nuevaCadena = prefijo + cadenaTexto;
        if (nuevaCadena.length() <= longitudMaxima) {
            cadenaTexto = nuevaCadena;
        } else {
            System.out.println("No se puede agregar el prefijo: supera la longitud permitida.");
        }
    }

    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < cadenaTexto.length(); i++) {
            if (cadenaTexto.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ProCadenasTex texto1 = new ProCadenasTex("Hola mundo", "MOD10", 50);

        System.out.println("Cadena actual: " + texto1.cadenaTexto);
        System.out.println("Espacios encontrados: " + texto1.contarEspacios());

        texto1.agregarPrefijo("*** ");
        System.out.println("Nueva cadena: " + texto1.cadenaTexto);
        System.out.println("Espacios actualizados: " + texto1.contarEspacios());
    }
}
