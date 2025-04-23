package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<String> livros = new Stack<>();
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("""
                     **************************************************
                     1 - Adicionar um novo livro na pilha.\s
                     2 - Listar todos os livros da Pilha.
                     3 - Retirar um livro da pilha.
                     0 - Finalizar o programa.
                     **************************************************
                     Entre com a opção desejada :
                    \s""");
            opcao = scanner.nextInt();
            scanner.skip("\\R");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Livro!");
                    String nomeLivro = scanner.nextLine();
                    livros.push(nomeLivro);
                    System.out.println("Livro adicionado à pilha.");
                    break;
                case 2:
                    if (livros.isEmpty()) {
                        System.out.println("A Pilha está vazia");
                    } else {
                        System.out.println(livros);
                    }
                    break;
                case 3:
                    if (livros.isEmpty()) {
                        System.out.println("A Pilha está vazia");
                    } else {
                        System.out.println(livros.pop());
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
