package Exercicos;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numero_1 = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int numero_2 = entrada.nextInt();

        if (numero_1 < numero_2) {
            for (int i = numero_1; i < numero_2; i++) {
                if (i % 3 == 0 && i % 5 == 0 ) {
                    System.out.printf("\n %d é muliplo de 3 e 5", i);
                }
            }
        } else {
            System.out.println("Intervalo é inválido");
        }

        entrada.close();
    }
}
