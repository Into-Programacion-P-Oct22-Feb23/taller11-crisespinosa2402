/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double notaA;
        double notaB;
        double notaC;
        double notaD;

        System.out.println("Ingrese la primera nota");
        notaA = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        notaB = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        notaC = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        notaD = entrada.nextDouble();

        String resultado = obtenerPromedio(notaA, notaB, notaC, notaD);
        System.out.printf("El promedio de las notas: %.0f %.0f, %.0f y %.0f es %s",
                    notaA,
                    notaB,
                    notaC,
                    notaD,
                    resultado);

    }

    public static String obtenerPromedio(double a, double b, double c, double d) {
        double promedio;
        String cualitativo = "";
        promedio = (a + b + c + d) / 4;
        if (promedio >= 0 && promedio <= 5) {
            cualitativo = "Regular";
            
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualitativo = "Bueno";
               
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cualitativo = "Muy Bueno";
                }
                if (promedio >= 9.1 && promedio <= 10) {
                    cualitativo = "Sobresaliente";
                }
            }
        }
        return cualitativo;
    }
}