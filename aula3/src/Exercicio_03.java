import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome!");
        String nome = entrada.nextLine();

        System.out.println("Digite a idade!");
        int idade = entrada.nextInt();

        System.out.println("É a primeira doação?? (true / false)");
        boolean doador = entrada.nextBoolean();


        if (idade >= 18 && idade < 60) {
            System.out.printf("%s está apto(a) para doar sangue!", nome);
        } else if (idade >=60 && idade <= 69 && !doador) {
            System.out.printf("%s está apto(a) para doar sangue!", nome);
        } else {
            System.out.printf("%s não está apto(a) para doar sangue!", nome);
        }

    }
}
