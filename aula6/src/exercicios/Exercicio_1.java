package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma Cor!");
            cores.add(scanner.nextLine());
        }

        System.out.println("Todas as cores : " );
        for (String cor : cores) {
            System.out.println(cor);
        }
        cores.sort(null);

        System.out.println("Ordenar cores : ");
        for (String cor : cores) {
            System.out.println(cor);
        }

    }
}
