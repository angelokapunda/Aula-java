import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
         int contador = 15;
        System.out.printf("Digite um número!");
        int numero = entrada.nextInt();

        while (contador <= 10);{
            System.out.printf("\n %d x %d = %d ", numero, contador, (numero * contador));
            contador++;
        }
    }
}