import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
         int contador = 15;
        System.out.printf("Digite um número!");
        int numero = entrada.nextInt();

        do {
            System.out.printf("\n %d x %d = %d ", numero, contador, (numero * contador));
            contador++;
        }while (contador <= 10);
    }
}