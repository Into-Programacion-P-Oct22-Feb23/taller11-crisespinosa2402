/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
        public static void main(String[] args) {
            String[] arreglo = obtenerElementos();
            System.out.println("\nEl arreglo:");
            for (int fila = 0; fila < arreglo.length; fila++) {
                System.out.printf("[%s] ", arreglo[fila]);
            }
            System.out.println("\nTiene valores como:");
            obtenerElementos(arreglo);
        }

        public static String[] obtenerElementos() {
            Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
            int var = 0;
            System.out.println("Ingrese el número de elementos que contendrá "
                    + "el arreglo:");
            var = entrada.nextInt();
            entrada.nextLine();
            String[] ciudad = new String[var];
            for (int fila = 0; fila < ciudad.length; fila++) {

                System.out.printf("Ingrese una ciudad de nuestro pais en "
                        + "la posición [%d]:\n",
                        fila);
                ciudad[fila] = entrada.nextLine();
            }
            return ciudad;
        }

        public static void obtenerElementos(String[] arreglo) {
            int var;
            for (int fila = 0; fila < arreglo.length; fila++) {
                var = arreglo[fila].length();
                if (var == 4 || var == 5) {
                    System.out.printf("%s\n", arreglo[fila]);
                }
            }
        }
}
