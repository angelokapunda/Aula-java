import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um número!");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n %d x %d = %d ", numero, i, (numero * i));
        }
    }
}