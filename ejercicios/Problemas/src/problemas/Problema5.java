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
public class Problema5 {
    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3},
        {10, 20, 30},
        {100, 200, 300}};

        resultado(informacion);

    }

    public static void resultado(int[][] a) {
        int resultado = 0;
        for (int fila = 0; fila < a.length; fila++) {
            for (int column = 0; column < a[fila].length; column++) {
                resultado = resultado + a[fila][column];

            }
        }
        System.out.println(resultado);
    }
}
