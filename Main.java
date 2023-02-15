import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Declaração das variáveis.
		int n, i, j, mat[][];

		// Quantidade de elementos da matriz. (n) linhas e (n) colunas.
		n = sc.nextInt();
		
		mat = new int[n][n]; // Instancio a matriz.
		
		// Laço (for) para inserir valores (inteiros) na matriz. 
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Percorre e imprime a diagonal da matriz (mat).
		System.out.println("Main diagonal:");
		for (i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();	
		
		// Percorre a matriz (mat) e imprime somente os valores negativos.
		int negativeCounter = 0;
		for (i = 0; i < mat.length; i++) {
			for (j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negativeCounter++;
				}
			} 
		}
		System.out.print("Negative numbers = " + negativeCounter);
		
		sc.close();
}
}
