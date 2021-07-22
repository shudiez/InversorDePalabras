package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        //Este metodo lo que hace es obtener la longitud de la cadena de palabras
        longitudPalabra = palabra.length();

        //Mientras sea diferente de cero que se siga cumpliendo la condicion
        while (longitudPalabra != 0) {

            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;

        }

        System.out.print("Palabra Invertida: " + palabraInvertida);
        System.out.println("");
    }

}
