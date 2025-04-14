import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        float numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo número");
        float numero2 = entrada.nextFloat();

        System.out.println("Digite o terceiro número");
        float numero3 = entrada.nextFloat();

        System.out.println("Digite o quarto número");
        float numero4 = entrada.nextFloat();

        float produtos = (numero1 * numero2) - (numero3 * numero4);

        System.out.printf("Diferença : %.2f ", produtos);

        entrada.close();
    }
}
