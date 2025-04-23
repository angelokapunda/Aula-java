import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        pilha.push("Pai rico pai pobre");
        pilha.push("Comunicação não violenta");
        pilha.push("Hábitos Atómicos");
        pilha.push("It: A coisa");
        pilha.push("A coragem de ser imperfeito");
        pilha.push("Quem pensa enriquece");
        pilha.push("Diário de um banana");
        pilha.push("O código da vinci");

        System.out.println(pilha);

        // Remove o ultimo elemento da pilha;
        pilha.pop();

        System.out.println(pilha);

        pilha.push("Roube como um artista");
        System.out.println(pilha);

        // Exibe o elemento do top da pilha
        System.out.println(pilha.peek());

        System.out.println("O livor Diário de um Banana existe a pilha?? "
                + pilha.contains("Diário de um banana"));


    }
}

