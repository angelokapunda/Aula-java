import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome!");
        String nome = entrada.nextLine();

        System.out.println("Dgite o código do seu cargo! (1 à 6)");
        int codigo = entrada.nextInt();

        System.out.println("Dgite o seu salario");
        int salario = entrada.nextInt();

        switch (codigo) {
            case 1 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Gerente");
                System.out.println("Salário: " + (salario + (salario * 0.1)) + " R$");
                break;
            case 2 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Vendedor");
                System.out.println("Salário: " + (salario + (salario * 0.07))+ " R$");
                break;
            case 3 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Supervisor");
                System.out.println("Salário: " + (salario + (salario * 0.09))+ " R$");
                break;
            case 4 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Motorista");
                System.out.println("Salário: " + (salario + (salario * 0.06)) + " R$");
                break;
            case 5 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Estoquista ");
                System.out.println("Salário: " + (salario + (salario * 0.05)) + " R$");
                break;
            case 6 :
                System.out.println("Nome do colaborador: " + nome);
                System.out.println("Cargo : Técnico de TI");
                System.out.println("Salário: " + (salario + (salario * 0.08)) + " R$");
                break;

            default:
                System.out.println("Infeelizmente não temos o Cargo de código " + codigo);

        }
    }
}
