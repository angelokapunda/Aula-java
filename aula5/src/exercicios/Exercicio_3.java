package exercicios;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        int somaPrincipal = 0, somaSecundaria = 0;
        int [][] numeros = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                numeros[l][c] = scanner.nextInt();
            }
        }

        System.out.println("Elementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d | ", numeros[i][i]);
            somaPrincipal += numeros[i][i];
        }
        System.out.println();

        System.out.println("Elementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d | ", numeros[i][2 -i]);
            somaSecundaria += numeros[i][2 - i];
        }
        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);



    }
}
