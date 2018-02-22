package by.htp.homeworkunit3.task05;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Fraction fr1 = new Fraction(1, 2);
		Fraction fr2 = new Fraction(3, 4);
		
		
		Fraction fr3;
		fr3 = fr1.add(fr2);
		Fraction fr4 = fr1.multiply(fr2);
		Fraction fr5 = fr1.subtract(fr2);
		Fraction fr6 = fr1.divide(fr2);
				
		printFraction(fr3);
		printFraction(fr4);
		printFraction(fr5);
		printFraction(fr6);
		
		
		
		fr3 = fr3.add(5);

		printFraction(fr3);	
		
		
		int k = 5;
		Fraction[] array = new Fraction[k];

		
		array[0] = new Fraction(1, 2);
		array[1] = new Fraction(2, 3);
		array[2] = initFraction();
		array[3] = enterFraction();
		array[4] = new Fraction(6, 11);
		
		printFraction(array[2]);
		
		
		Fraction sumFr = array[0];
		for(int i=1; i<array.length; i++){
			sumFr = sumFr.add(array[i]);
			
		}
		
		Fraction mulFr = array[0];
		for(int i=1; i<array.length; i++){
			mulFr = mulFr.multiply(array[i]);
			
		}
		
		Fraction subFr = array[0];
		for(int i=1; i<array.length; i++){
			subFr = subFr.subtract(array[i]);
			
		}
		
		Fraction divFr = array[0];
		for(int i=1; i<array.length; i++){
			divFr = divFr.divide(array[i]);
			
		}
		
		
		
		printFraction(sumFr);
		printFraction(mulFr);
		printFraction(subFr);
		printFraction(divFr);
		
		

		

	}

	public static void printFraction(Fraction fr) {
		System.out.println(fr.getNumerator() + "/" + fr.getDenominator());
	}
	
	public static Fraction enterFraction() {
		Fraction newFraction = new Fraction();
		int num;
		int den;
		num = readFromConsole("Введите числитель: ");
		den = readFromConsole("Введите знеаменатель: ");
		newFraction.setNumerator(num);
		newFraction.setDenominator(den);		
		return newFraction;
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
	
	public static Fraction initFraction() {

		Fraction newFraction = new Fraction();
		int num;
		int den;
		num = (int)(Math.random()*15);
		den = (int)(Math.random()*25);
		newFraction.setNumerator(num);
		newFraction.setDenominator(den);		
		return newFraction;		

	}

}
