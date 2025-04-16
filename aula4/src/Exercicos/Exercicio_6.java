package Exercicos;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;
        do {
            System.out.println("Digite o Digite um número inteiro!");
            numero = entrada.nextInt();
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos " + soma);

    }
}
