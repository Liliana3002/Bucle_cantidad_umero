/*Ciclo while es una secuencia de instrucciones que se van a repetir,
dependiendo de una determinada condición
Ejercicio: Aplicación que solicite una determinada cantidad de números
y los digita de menor a mayor*/
package apli_bucle_while;

import java.util.Scanner;

public class Apli_Bucle_While {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar la constante i:
        int i = 1, contador;
        System.out.print("Digite cuántos números quiere en pantalla: ");
        contador = entrada.nextInt();
        
        while (i<=contador){
            System.out.println(i);
            ++i;
        }
     }
}
