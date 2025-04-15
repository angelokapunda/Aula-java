import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dgite o código do produto pretendido! (1 à 6)");
        System.out.println("****************************************************");
        System.out.println("1 - Cachorro Quente -- 10 R$");
        System.out.println("2 - X-Salada -- 15R$");
        System.out.println("3 - X-Bacon -- 18R$");
        System.out.println("4 - Bauru -- 12R$");
        System.out.println("5 - Refrigerante -- 8R$");
        System.out.println("6 - Suco de Laranja -- 12R$");
        System.out.println("****************************************************");
        int codigo = entrada.nextInt();

        System.out.println("Dgite a quantidade produto pretendido!");
        int quantidade = entrada.nextInt();

        switch (codigo) {
            case 1 :
                System.out.println("Cachorro Quente");
                System.out.println("Valor Total: " + (quantidade * 10) + " R$");
                break;
            case 2 :
                System.out.println("X-Salada");
                System.out.println("Valor Total: " + (quantidade * 15) + " R$");
                break;
            case 3 :
                System.out.println("X-Bacon");
                System.out.println("Valor Total: " + (quantidade * 18) + " R$");
                break;
            case 4 :
                System.out.println("Bauru");
                System.out.println("Valor Total: " + (quantidade * 12) + " R$");
                break;
            case 5 :
                System.out.println("Refrigerante ");
                System.out.println("Valor Total: " + (quantidade * 8) + " R$");
                break;
            case 6 :
                System.out.println("Suco de Laranja");
                System.out.println("Valor Total: " + (quantidade * 12) + " R$");
                break;

            default:
                System.out.println("Infeelizmente não temos o produto de código " + codigo);

        }
    }
}
