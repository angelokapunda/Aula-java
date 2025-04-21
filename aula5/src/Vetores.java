import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorInteiros = {10, 15, 35, 70, 140};
        Float [] vetorReal = new Float[5];
        String vetorStrings[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};

        System.out.println("Posicão 0 : " + vetorInteiros[0]);
        for (int vetor : vetorInteiros){
            System.out.println( "Posições : " +vetor);
        }

        for (int i = 0; i < vetorReal.length; i++) {
            System.out.println("Digite um número real");
            vetorReal[i] = entrada.nextFloat();
        }

        for(float valor : vetorReal) {
            System.out.println("Elemento actual: " + valor);
        }
        System.out.println("**************************************");

        Arrays.sort(vetorReal);

        for(float valor : vetorReal) {
            System.out.println("Odem crescente: " + valor);
        }
        System.out.println("**************************************");

        Arrays.sort(vetorReal, Collections.reverseOrder());

        for(float valor : vetorReal) {
            System.out.println("Odem decrescente: " + valor);
        }
        System.out.println("**************************************");

        for (var valorString : vetorStrings) {
            System.out.println("String em ordem crescente: " + valorString);
        }
    }
}
