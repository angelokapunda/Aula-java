package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<String> clientes = new LinkedList<>();
        int opcao = 1;


        while (opcao != 0) {
            System.out.println("""
                     **************************************************
                     1 - Adicionar um novo cliente na fila.\s
                     2 - Listar todos os Clientesda fila.
                     3 - Chamar (retirar) um pessoa da fila.
                     0 - Finalizar o programa.
                     **************************************************
                     Entre com a opção desejada :
                    \s""");
            opcao = scanner.nextInt();
            scanner.skip("\\R");


            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do novo Cliente!");
                    String nomeCliente = scanner.nextLine();
                    clientes.add(nomeCliente);
                    System.out.println("Cliente adicionado à fila.");
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila está vazia");
                    } else {
                        System.out.println(clientes);
                    }
                    break;
                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila está vazia");
                    } else {
                        System.out.println(clientes.poll());
                    }
                    break;
                default:
                    if (opcao == 0) {
                        System.out.println("Programa Finalizado!");
                    } else {
                        System.out.println("Digite um número válido (1 - 3)!");
                    }


            }

        }

    }

}



