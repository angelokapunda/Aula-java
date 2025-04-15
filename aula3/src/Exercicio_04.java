import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro nome que define as características de um tipo de animal");
        String nome1 = entrada.nextLine();

        System.out.println("Digite o segundo nome que define as características de um tipo de animal");
        String nome2 = entrada.nextLine();

        System.out.println("Digite o terceiro nome que define as características de um tipo de animal");
        String nome3 = entrada.nextLine();

        if (nome1.equalsIgnoreCase("vertebrado")) {
            if (nome2.equalsIgnoreCase("ave")) {
                if (nome3.equalsIgnoreCase("carnivoro")){
                    System.out.println("Águia");
                } else {
                    System.out.println("Pomba");
                }
            } else {
                if (nome3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else {
                    System.out.println("Vaca");
                }
            }
        } else {
            if (nome2.equalsIgnoreCase("inseto")) {
                if (nome3.equalsIgnoreCase("hermatofalo")){
                    System.out.println("Pulga");
                } else {
                    System.out.println("Lagarta");
                }
            } else {
                if (nome3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                } else {
                    System.out.println("Minhoca");
                }
            }
        }
    }
}
