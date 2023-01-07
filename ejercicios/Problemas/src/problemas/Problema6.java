/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        System.out.println(obtenerPromedio(informacion));

        System.out.println(obtenerDesviacion(informacion,
                obtenerPromedio(informacion)));
    }

    public static double obtenerPromedio(int[] a) {
        int resultado = 0;
        double promedio;

        for (int fila = 0; fila < a.length; fila++) {
            resultado = resultado + a[fila];

        }
        promedio = (resultado / a.length);
        return promedio;

    }

    public static double obtenerDesviacion(int[] a, double b) {
        double num = 0;
        int resultado = 0;
        double desviacion;
        
        for (int fila = 0; fila < a.length; fila++) {
            resultado = resultado + a[fila];
            double x = a[fila] - b;
            double y = Math.pow(x, 2);
            num = num + Math.pow(a[fila] - b, 2);

        }
        desviacion = Math.sqrt(num / a.length);
        return desviacion;
    }
}
