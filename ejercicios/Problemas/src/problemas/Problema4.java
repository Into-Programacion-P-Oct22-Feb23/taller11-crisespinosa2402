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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String opcion2;
        int opcion;
        boolean bandera = true;
        String nombre;
        int cedula;
        while (bandera) {
            System.out.println("Ingrese el nombre y su apellido porfavor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula de identidad");
            cedula = entrada.nextInt();
            System.out.println("Ingrese:\n1 para obtener el valor de la "
                    + "planilla\n2 para obtener el predio");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1) {
                obtenerPlanillaLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    obtenerValorInmueble(nombre, cedula);
                } else {
                    System.out.println("Error");
                }
            }
            System.out.println("ingrse(s)para salir");
            opcion2 = entrada.nextLine();

            if (opcion2.equals("s")) {
                bandera = false;
            }
        }

    }

    public static void obtenerPlanillaLuz(String a, int b) {
        Scanner entrada = new Scanner(System.in);
        double valorKilovatio;
        double numeroKilovatio;
        double operacion;

        System.out.println("Ingrese el valor de kilovatio");
        valorKilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios");
        numeroKilovatio = entrada.nextDouble();
        operacion = valorKilovatio * numeroKilovatio;

        System.out.printf("Cliente %s -con cedula %d debe cancelar el"
                + "valor de $%.2f\n",
                a,
                b,
                operacion);

    }

    public static void obtenerValorInmueble(String a, int b) {
        Scanner entrada = new Scanner(System.in);

        double valorPredio;
        double valorInmueble;
        double porcentaje = 2;
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = (valorInmueble * porcentaje) / 100;
        System.out.printf("Cliente: %s -con cedula: %d -tiene un bien inmueble"
                + "con valor en $%.2f y tiene que pagar de predio de: $%.2f\n",
                a,
                b,
                valorInmueble,
                valorPredio);
    }
}
