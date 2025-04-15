import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número!");
        int numero = entrada.nextInt();

        if (numero % 2 == 0 && numero >= 0) {
            System.out.printf("O número %d é par e positivo", numero);
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.printf("O número %d é par e negativo", numero);
        } else {
            System.out.printf("O número %d é impar e negativo", numero);
        }

        entrada.close();
    }
}
