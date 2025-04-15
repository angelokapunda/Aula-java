import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A!");
        int valor_01 = entrada.nextInt();

        System.out.println("Digite o valor de B!");
        int valor_02 = entrada.nextInt();

        System.out.println("Digite o valor de C!");
        int valor_03 = entrada.nextInt();

        if (valor_01 + valor_02 > valor_03) {
            System.out.println("A soma de A + B é MAIOR que C");
        } else if (valor_01 + valor_02 < valor_03) {
            System.out.println("A soma de A + B é MENOR que C");
        } else {
            System.out.println("A soma de A + B é IGUAL que C");
        }

    entrada.close();
    }
}
