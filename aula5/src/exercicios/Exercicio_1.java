package exercicios;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean numeroProcurado = false;
        int [] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println("Digite um numero!");
        int numeroDigitado = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeroDigitado == numeros[i]) {
                System.out.printf("O número %d esta localizado na posição %d", numeroDigitado, i);
                numeroProcurado = true;
                break;
            }
        }
        if(!numeroProcurado) {
            System.out.printf("O número %d não foi encontrado!", numeroDigitado);
        }


    }
}
