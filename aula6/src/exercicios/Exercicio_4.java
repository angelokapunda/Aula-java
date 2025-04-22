package exercicios;

import java.util.Scanner;
import java.util.Set;

public class Exercicio_4 {

    public static void main(String[] args) {

        Set<Integer> numeros = Set.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
        boolean existente = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = scanner.nextInt();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.contains(numero)) {
                existente = true;
                break;
            }
        }

        if (existente){
            System.out.printf("O número %d foi encontrado! ", numero);
        }else {
            System.out.printf("O número %d não foi encontrado!", numero );
        }

    }
}
