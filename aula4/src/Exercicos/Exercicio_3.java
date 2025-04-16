package Exercicos;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0;

        while (idade >= 0) {
            System.out.println("Digite uma idade");
             idade = entrada.nextInt();

             if (idade > 0 && idade < 21){
                 idadeMenor21++;
             } else if (idade > 50) {
                 idadeMaior50++;
             }
        }

        System.out.printf("\n Total de pessoas menores de 21 anos: %d", idadeMenor21);
        System.out.printf("\n Total de pessoas maiores de 50 anos: %d", idadeMaior50);

        entrada.close();
    }
}
