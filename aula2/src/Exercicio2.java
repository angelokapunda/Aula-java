import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota do participante");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota do participante");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota do participante");
        float nota3 = entrada.nextFloat();

        System.out.println("Digite a quarta nota do participante");
        float nota4 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média Final : %.2f", media);

        entrada.close();
    }
}
