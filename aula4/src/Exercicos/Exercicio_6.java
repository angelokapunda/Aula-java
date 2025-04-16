package Exercicos;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0, contador = 0, media;
        do {
            System.out.println("Digite o Digite um número inteiro!");
            numero = entrada.nextInt();
            if (numero % 3 == 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        media = soma / contador;
        System.out.println("A média de todos os números múltiplos de 3 é " + media);

        entrada.close();
    }
}
