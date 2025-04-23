import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        // Cria a estrutura de dados Fila
        Queue<String> fila = new LinkedList<>();

        fila.add("Angelo");
        fila.add("Livia");
        fila.add("Maria");
        fila.add("Samuel");
        fila.add("Tatiana");
        fila.add("Fabricio");
        fila.add("Victor");

        System.out.println(fila);

        // Remove o primeiro elemento da fila
        fila.remove();

        System.out.println(fila);

        fila.add("Thiago");

        System.out.println(fila);

        // Método peek imprim qual a primeira pessoa da fila
        System.out.println(fila.peek());

        // Método peek imprim qual a primeira pessoa da fila e remove o msm
        System.out.println(fila.poll());

        System.out.println(fila);

        System.out.println("A Maria está na Fila? " + fila.contains("Maria"));
        System.out.println("O Angelo está na Fila? " + fila.contains("Angelo"));
        System.out.println("Qual o tamanho da Fila? " + fila.size());

        int contador = 0;

        for (var pessoa: fila){
            contador++;
            if (pessoa.equalsIgnoreCase("maria")) {
                System.out.println("Posiçã da Maria " + contador);
            }
        }



    }
}