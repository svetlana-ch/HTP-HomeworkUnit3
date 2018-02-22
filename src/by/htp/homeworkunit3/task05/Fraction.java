package by.htp.homeworkunit3.task05;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {// constructor
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return this.numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
		
	public Fraction add(Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = this.denominator * fraction2.denominator;
		newNumerator = this.numerator * fraction2.denominator + fraction2.numerator
				* this.denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	public Fraction add(int number){
		int newNumerator;
		int newDenominator;
		
		newDenominator = denominator;
		newNumerator = numerator * 1 + number * denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	public void sokr(){
		
		int nod;
		if(this.numerator > this.denominator){
			nod = this.numerator;
		}else {
			nod = this.denominator;
		}
		
		
		while ( !((this.numerator % nod == 0) && (this.denominator % nod == 0))  ){
			nod--;
		}
		
		this.numerator = this.numerator / nod;
		this.denominator = this.denominator / nod;
		
	}
		
	
	
	public Fraction multiply(Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = this.denominator * fraction2.denominator;
		newNumerator = this.numerator * fraction2.numerator ;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	public Fraction multiply(int number){
		int newNumerator;
		int newDenominator;
		
		newDenominator = denominator;
		newNumerator = numerator * number;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	
	
	public Fraction subtract(Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = this.denominator * fraction2.denominator;
		newNumerator = this.numerator * fraction2.denominator - fraction2.numerator
				* this.denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	public Fraction subtract(int number){
		int newNumerator;
		int newDenominator;
		
		newDenominator = denominator;
		newNumerator = numerator - number * denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	
	
	
	public Fraction divide(Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = this.denominator * fraction2.numerator;
		newNumerator = this.numerator * fraction2.denominator;

		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	
	
	public Fraction divide(int number){
		int newNumerator;
		int newDenominator;
		
		newDenominator = denominator * number;
		newNumerator = numerator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		newFraction.sokr();
		
		return newFraction;
	}
	

}
