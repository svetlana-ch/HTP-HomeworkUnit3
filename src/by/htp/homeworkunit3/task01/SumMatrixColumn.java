package by.htp.homeworkunit3.task01;

import java.util.Random;
import java.util.Scanner;

public class SumMatrixColumn {

	public static void main(String[] args) {
		
		int n = readFromConsole("Введите размерность матрицы N ->  ");
		
		int[][] matrNxN = initIntMatrixNxN(n);
		
		printMatrix(matrNxN);
		
		maxOfColumnNumber(matrNxN);
		
		

	}
	
	public static void printMatrix(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d] ", mas[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] initIntMatrixNxN(int size) {

		int[][] matrix = new int[size][size];
		
		
		Random randomGenerator = new Random();		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = randomGenerator.nextInt(100);
				
			}
		}


		return matrix;

	}
	
	public static int readFromConsole(String massage) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.print(massage);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(massage);			
		}
		x =  sc.nextInt();
		
		return x;
	}
	
	
	public static void maxOfColumnNumber(int[][] matrix) {

		for (int j = 0; j < matrix[0].length; j++) {

			int max = matrix[0][j];

			for (int i = 0; i < matrix.length; i++) {

				if (matrix[i][j] > max) {

					max = matrix[i][j];

				}

			}

			System.out.printf("Максимальный элемент столбца  %d -->  %d\n", j, max);

		}

	}
	
	

}
