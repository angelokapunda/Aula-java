import java.util.Scanner;

public class Matriz {

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            final int linha = 3;
            final int coluna = 5;
            int [][] numeros = new int[linha][coluna];

            int matrizInteiros[][] = {{10, 15, 35}, {70,120,140}, {50, 100, 150}};

            int matrizIrregular[][] = {{10, 15}, {70,120}, {50, 100}};

            Float matrizReal[][] = new Float[3][3];


            for (int l = 0; l < linha; ++l) {
                for (int c = 0; c < coluna; c++) {
                    numeros[l][c] = (int) (Math.random() * 100);
                }
            }

            for (int l = 0; l < linha; ++l) {
                for (int c = 0; c < coluna; c++) {
                    System.out.printf("%d ", numeros[l][c]);
                }
                System.out.println();
            }









		/*for(int linha = 0; linha < matrizInteiros.length; linha ++)
		{
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++)
			{
				System.out.printf("\n matrinInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}

		for(int linha = 0; linha < matrizReal.length; linha ++)
		{
			for(int coluna = 0; coluna < matrizReal.length; coluna++)
			{
				System.out.println("\nDigite um número Real: ");
				matrizReal[linha][coluna] = leia.nextFloat();
			}
		}

		for(Float[] vetor : matrizReal)
		{
			for(var valor : vetor)
			{
				System.out.println("Exibir a posição atual: " + valor);
			}
		}*/

//            for(int linha = 0; linha < matrizIrregular.length; linha ++)
//            {
//                for(int coluna = 0; coluna < matrizIrregular[linha].length; coluna++)
//                {
//                    System.out.printf("\n matrizIrregular[%d][%d] = %d", linha, coluna, matrizIrregular[linha][coluna]);
//                }
//            }



        }

    }


