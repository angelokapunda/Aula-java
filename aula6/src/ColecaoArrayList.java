import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        numeros.add(2.0);
        numeros.add(9.0);
        numeros.add(4.0);
        numeros.add(3.0);
        numeros.add(10.0);
        numeros.add(2.0);

//        System.out.println("Digite um número!");
//        double input = scanner.nextDouble();

        //numeros.add(input);


        for (double numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("O indice do valor 10 : " + numeros.indexOf(10.0));
        System.out.println("O número  10 existe na coleção? : " + numeros.contains(10.0));
        System.out.println("Qual valor está armazenado no indice 2? " + numeros.get(2));
        System.out.println("Qual o tamanho da coleção? " + numeros.size());

//        numeros.clear();


        numeros.sort(null);
        System.out.println("Exibe os dados em ordem crescente");
        numeros.forEach(System.out::println);

        numeros.sort(Comparator.reverseOrder());
        System.out.println("Exibe os dados em ordem decrescente");
        numeros.forEach(System.out::println);

        numeros.set(2, 7.0);

        System.out.println("Exibe os dados após a actualização");
        numeros.forEach(System.out::println);

        numeros.remove(2);

        System.out.println("Exibe os dados após a exclusão");
        numeros.forEach(System.out::println);
    }
}
