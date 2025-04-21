package exercicios;

public class Exercicio_4 {

    public static void main(String[] args) {

        final int linhas = 10;
        final int colunas = 4;
        float soma = 0;
        float [][] notas = new float[linhas][colunas];
        float[] media = new float[linhas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                notas[l][c] = (float) Math.random() * 10;
                soma += notas[l][c];
            }
            media[l] = soma / 4;
        }

        for (int l = 0; l < linhas; l++) {
            System.out.printf("%.1f |", media[l]);
        }



    }
}
