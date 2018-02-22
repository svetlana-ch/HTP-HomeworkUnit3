package by.htp.homeworkunit3.task06;

import java.util.Scanner;

public class pointInArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x1 = -4.00;
		double y1 = -3.00;
		double x2 = 4.00;
		double y2 = 0.00;
		double x3 = -2.00;
		double y3 = 0.00;
		double x4 = 2.00;
		double y4 = 4.00;
		double x = 0.00;
		double y = 0.00;
		
				
		System.out.println("Введите координату х:  ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите координату х:  ");			
		}
		x =  sc.nextDouble();
		
		System.out.println("Введите координату у:  ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите координату у:  ");			
		}
		y =  sc.nextDouble();
		
		
		if (((x >= x1) && (y >= y1) && (x <= x2) && (y <= y2)) || ((x >= x3) && (y >= y3) && (x <= x4) && (y <= x4))) {

			System.out.println("true");

		} else {

			System.out.println("false");

		}
		

	}

}
