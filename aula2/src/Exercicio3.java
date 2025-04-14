import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu Salário Bruto!");
        float salarioBruto = entrada.nextFloat();

        System.out.println("Digite o seu Adicional Noturno");
        float adicionalNoturno = entrada.nextFloat();

        System.out.println("Digite as suas Horas Extras");
        float horasExtras = entrada.nextFloat();

        System.out.println("Digite o seu Desconto");
        float desconto = entrada.nextFloat();

        float salarioLiquido = (salarioBruto + adicionalNoturno) + (horasExtras * 5) - desconto;

        System.out.printf("Salário Líquido : %.2f ", salarioLiquido);

        entrada.close();
    }
}
