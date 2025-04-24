import java.util.Scanner;

public class CalculadoraMetodos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Digite o primeiro número");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número");
            double numero2 = scanner.nextDouble();

            System.out.println("""
                    ***************************************************************
                    1 - Somar
                    2 - Subtrair
                    3 - Multiplicar
                    4 - Dividir
                    0 - Sair
                    ***************************************************************
                    Qual operação matemática você deseja acessar
                    """);
            opcao = scanner.nextInt();

            if (opcao == 0) {
                sobre();
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> System.out.printf("%.2f + %.2f = %.2f",numero1, numero2, somar(numero1, numero2));
                case 2 -> System.out.printf("%.2f - %.2f = %.2f",numero1, numero2, subtrair(numero1, numero2));
                case 3 -> System.out.printf("%.2f * %.2f = %.2f",numero1, numero2, multiplicar(numero1, numero2));
                case 4 -> System.out.printf("%.2f / %.2f = %.2f",numero1, numero2, dividir(numero1, numero2));
                default -> System.out.println("Opção inválida");
            }

        }

    }

    static double somar (double numero1, double numero2) {
        return numero1 + numero2;
    }
    static double subtrair (double numero1, double numero2) {
        return numero1 - numero2;
    }
    static double multiplicar (double numero1, double numero2) {
        return numero1 * numero2;
    }
    static double dividir (double numero1, double numero2) {
        if (numero2 == 0) {
            return -1;
        }
        return numero1 / numero2;
    }
    static void sobre () {
        System.out.println("Calculadora com métodos");
        System.out.println("Feita por Angrlo dos Santos");
    }

}