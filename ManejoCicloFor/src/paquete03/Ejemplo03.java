/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        String cadena="";
        System.out.println("ingresar limite");
        numero=entrada.nextInt();
        for (int i = 1; i <=numero; i++) {
            entrada.nextLine();
            System.out.println("ingrese el nombre del jugador");
            String nombreJugador=entrada.nextLine();
            System.out.println("posicion de campo de juego");
            String posicionJugador=entrada.nextLine();
            System.out.println("edad del jugador");
            int edadJugador=entrada.nextInt();
            System.out.println("estatura");
            double estaturaJugador=entrada.nextDouble();
            cadena=String.format("%s%d. %s-%s-,edad %d,estatura %.2f\n",
                    cadena, i, nombreJugador, posicionJugador,
                    edadJugador,
                    estaturaJugador);
        }
        System.out.printf("listado de jugadores\n%s", cadena);
    }
}
