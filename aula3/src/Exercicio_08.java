import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        float saldo = 1000;
        float quantia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dgite o código da operação matemática! (1 à 3)");
        System.out.println("****************************************************");
        System.out.println(" Código da Operação  ||  Operação");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("****************************************************");
        int codigo = entrada.nextInt();


        switch (codigo) {
            case 1 :
                System.out.println("Operador - Saldo");
                System.out.printf("Saldo : " + saldo + " R$");
                break;
            case 2 :
                System.out.println("Digite a quantia que deseja sacar!");
                quantia = entrada.nextFloat();
                if (quantia <= saldo) {
                    saldo-=quantia;
                    System.out.println("Operador - Saque");
                    System.out.printf("Saldo : " + saldo + " R$");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;
            case 3 :
                System.out.println("Digite a quantia que quer depositar!");
                quantia = entrada.nextFloat();
                if (quantia > 0) {
                    float saldoTotal = saldo + quantia;
                    System.out.println("Operador - Depósito");
                    System.out.println("saldo : " + saldoTotal);
                } else {
                    System.out.println("O valor mínimo  é de 1R$");
                    System.out.printf("Saldo : " + saldo + " R$");
                }
                break;
            default:
                System.out.println("Operação Inválida!");

        }
    }
}
