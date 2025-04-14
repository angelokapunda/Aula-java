import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário!");
        float salario = entrada.nextFloat();

        System.out.println("Digite o seu salário!");
        float abono = entrada.nextFloat();

        float novoSalario = salario + abono;

        System.out.printf("Novo Salário : %.2f R$", novoSalario);

        entrada.close();
    }
}