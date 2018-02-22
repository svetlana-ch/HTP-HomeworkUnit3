package by.htp.homeworkunit3.task03;

import java.util.Random;
import java.util.Scanner;

public class SumMultiplMatrix {

	public static void main(String[] args) {
		
		int[][] matrixA;
		int[][] matrixB;
		int[][] matrixSum;
		int[][] matrixMultipl;	

		int a1 = readFromConsole("Введите число рядов первой матрицы ->  ");
		int a2 = readFromConsole("Введите количество столбцов первой матрицы ->  ");
		int b1 = readFromConsole("Введите число рядов второй матрицы ->  ");
		int b2 = readFromConsole("Введите количество столбцов первой матрицы ->  ");		

		matrixA = initIntMatrix(a1, a2);
		matrixB = initIntMatrix(b1, b2);
		
		printMatrix(matrixA);
		printMatrix(matrixB);
		
	//	matrixSum = sumMatrix(matrixA, matrixB);
		matrixMultipl = multMatrix(matrixA, matrixB);
		
		System.out.println("Результат сложения матриц: ");
		//printMatrix(matrixSum);
		System.out.println("Результат умножения матриц: ");
		printMatrix(matrixMultipl);		
		
		

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
				matrix[i][j] = randomGenerator.nextInt(10);
				
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
	
	
	public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
		
		int [][] sumMatr = new int [matrix1.length][matrix1[0].length];
		
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix1[i].length; j++) {

				sumMatr[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}
				
		return sumMatr;
	}
	
public static int[][] multMatrix(int[][] matrix1, int[][] matrix2) {
	
		if (matrix1.length < matrix2.length) {
			int[][] temp = matrix1;
			matrix1 = matrix2;
			matrix2 = temp;
		}
		int [][] multMatr = new int [matrix1.length][matrix2[0].length];
		
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j <  matrix2[0].length; j++) { //

				for (int k = 0; k < matrix2.length; k++ ){

					multMatr[i][j] += matrix1[i][k] * matrix2[k][j];

				}

			}

		}
				
		return multMatr;
	}
		
}
