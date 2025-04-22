package exercicios;

import java.util.List;
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
        boolean numeroProcurado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = scanner.nextInt();


        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.contains(numero)) {
                System.out.printf("O número %d está localizado na posição: %d", numero, numeros.indexOf(numero));
                numeroProcurado = true;
                break;
            }
        }

        if (!numeroProcurado){
            System.out.printf("O número %d não foi encontrado!", numero );
        }

    }
}
