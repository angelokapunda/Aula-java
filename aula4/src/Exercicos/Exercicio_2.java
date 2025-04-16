package Exercicos;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numerosPares = 0, numerosImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número!");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        System.out.println("Total de números pares: " + numerosPares);
        System.out.println("Total de números imppares: " + numerosImpares);

        entrada.close();
    }
}
