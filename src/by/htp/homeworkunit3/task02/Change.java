package by.htp.homeworkunit3.task02;

import java.util.Random;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {

		int r = readFromConsole("Введите число рядов матрицы ->  ");
		int c = readFromConsole("Введите количествоо столбцов матрицы ->  ");

		int[][] matr = initIntMatrix(r, c);
		
		printMatrix(matr);
		
		int a = readFromConsole("Введите первый изменяемый ряд ->  ");
		int b = readFromConsole("Введите второй изменяемый ряд ->  ");
		
		while (a >= matr.length || b >= matr.length) {
			System.out.printf("Введите корректное значение ряда от 0 до %d  \n", matr.length-1);
			a = readFromConsole("Введите первый изменяемый ряд ->  ");
			b = readFromConsole("Введите второй изменяемый ряд ->  ");
		}
		
		changeMatrixRow(matr, a, b);
		
		printMatrix(matr);
		
		

	}
	
	public static void printMatrix(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d] ", mas[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] initIntMatrix(int row, int column) {

		int[][] matrix = new int[row][column];
		
		
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
	
	
	public static int[][] changeMatrixRow(int[][] matrix, int row1, int row2) {
		
				
		int[] temp = new int[matrix[0].length];

		for (int i = 0; i < matrix[0].length; i++) {			

			temp[i] = matrix[row1][i];
			matrix[row1][i] = matrix[row2][i];
			matrix[row2][i] = temp[i];

			}

					
			return matrix;

	}
	
	
}


