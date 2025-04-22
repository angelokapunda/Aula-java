package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        Iterator<Integer> numeroInterator = numeros.iterator();

        System.out.println("Listar dados do Set:");
        while (numeroInterator.hasNext()) {
            System.out.println(numeroInterator.next());
        }

//        System.out.println("Listar dados do Set:");
//        numeros.forEach(System.out::println);

    }
}
