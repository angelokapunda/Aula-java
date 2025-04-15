import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Dgite o código da operação matemática! (1 à 4)");
        int codigo = entrada.nextInt();

        System.out.println("Dgite o primeiro número");
        float numero_1 = entrada.nextFloat();

        System.out.println("Dgite o segundo número");
        float numero_2 = entrada.nextFloat();

        switch (codigo) {
            case 1 :
                System.out.printf("\n %.2f + %.2f = %.2f",numero_1, numero_2, (numero_1 + numero_2));
                break;
            case 2 :
                System.out.printf("\n %.2f - %.2f = %.2f",numero_1, numero_2, (numero_1 - numero_2));
                break;
            case 3 :
                System.out.printf("\n %.2f * %.2f = %.2f",numero_1, numero_2, (numero_1 * numero_2));
                break;
            case 4 :
                System.out.printf("\n %.2f / %.2f = %.2f",numero_1, numero_2, (numero_1 / numero_2));
                break;
            default:
                System.out.println("Operação Inválida!");

        }
    }
}
