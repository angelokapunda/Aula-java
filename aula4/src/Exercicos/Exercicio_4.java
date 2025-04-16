package Exercicos;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int idade, identidade, areaDeAtuacao, pessoasBackEnd = 0,
                pessoasFrontEnd = 0, pessoasMobileMaior40, pessoaFullStackMenor30,
                numeroTotalPessoas;
        double media;
        String continuarLeituraDados = "S";

        while (!continuarLeituraDados.equalsIgnoreCase("N")) {

            System.out.println("Difite a sua idade!");
            idade = entrada.nextInt();

            System.out.println("""
                Como você se identifica/ identidade de gênero? (digite o código de 1 à 6)
                *************************************************************************
                1 – Mulher Cis
                2 – Homem Cis
                3 – Não Binário
                4 – Mulher Trans
                5 – Homem Trans
                6 – Outros
                ************************************************************************
                """);
            identidade = entrada.nextInt();

            System.out.println("""
                Pessoa Desenvolvedora/Área de atuação? (digite o código de 1 à 4)
                ******************************************************************
                1 – Backend
                2 – Frontend
                3 – Mobile
                4 – FullStack
                ******************************************************************
                """);
            areaDeAtuacao = entrada.nextInt();

            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador ou não? (S/N)");
            entrada.skip("\\R");
            continuarLeituraDados = entrada.nextLine();


        }


        System.out.println("Total de pessoas desenvolvedoras Backend: " );
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " );
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " );
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos:");
        System.out.println("O número total de pessoas que responderam à pesquisa: " );
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " );
    }
}
