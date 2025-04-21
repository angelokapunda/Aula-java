package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Elementos pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0 ) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Elementos nos índices ímpares:: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 != 0 ) {
                System.out.print(numeros[i] + " ");
            }
        }

    }
}
