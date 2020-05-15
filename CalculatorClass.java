package CalculatorFunctions;

import java.util.Scanner;

public class CalculatorClass {
	
	public static void add(int number, int number2) {
		if(number >=1 && number <=50 && number2>= 51 && number2<=100 ) {
		System.out.println("Addition of two number: " +number + number2 );
		}
		else {
			System.out.println("Number is out of line");
		}
	}
	
	public static void sub(int number, int number2) {
		if(number >=51 && number <=100 && number2>= 1 && number2<=50 ) {
		int sub=number - number2;
		System.out.println("Subtraction of two number: " +sub );
		}
		else {
			System.out.println("Number is out of line");
		}
	}
	
	public static void mul(int number, int number2) {
		if(number >=1 && number <=100 && number2>= 101 && number2<=200 ) {
		System.out.println("Multiplication of two number: " + number * number2);
		}
		else {
			System.out.println("Number is out of line");
		}
	}
	
	public static void div(double number, double number2) {
		if(number2==0) {
			System.out.println("Numbers Can not be divided");
		}
		else {
			System.out.println("Divisio of numbers:"+number / number2);
		}
	}
	public static void Average(int number1, int number2, int number3 ) {
		if(number1>=1 && number1<= 100 && number2>=101 && number2<=200 && number3>= 201 && number3<=300 ) {
		  float Avg=(number1 + number2 + number3)/3;
		  System.out.println("The average of three number is "  + Avg);
		}
		else {
			System.out.println("Number is out of line");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int num1,num2,num3,choice;
		System.out.println("Choose the calculator operation:");
		System.out.println("\n 1. Add\n 2. Subtract \n 3.Multiply \n 4.Divide \n5. Average");
		choice = input.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter Number 1(Range between 1 and 50):");
			num1 = input.nextInt();
			System.out.println("Enter Number 2(Range between 51 and 100):");
			num2 = input.nextInt();
			add(num1,num2);
			break;
		case 2:
			System.out.println("Enter Number 1(Range between 51 and 100):");
			num1 = input.nextInt();
			System.out.println("Enter Number 2(Range between 1 and 50):");
			num2 = input.nextInt();
			sub(num1,num2);
			break;
		case 3:
			System.out.println("Enter Number 1(Range between 1 and 100):");
			num1 = input.nextInt();
			System.out.println("Enter Number 2:(Range between 101 and 200)");
			num2 = input.nextInt();
			mul(num1,num2);
			break;
		case 4:
			System.out.println("Enter Number 1:");
			num1 = input.nextInt();
			System.out.println("Enter Number 2(Must not be zero):");
			num2 = input.nextInt();
			div(num1,num2);
			break;
		case 5:
			System.out.println("Enter Number 1:(Range between 1 and 100)");
			num1 = input.nextInt();
			System.out.println("Enter Number 1:(Range between 101 and 200)");
			num2 = input.nextInt();
			System.out.println("Enter Number 1:(Range between 201 and 300)");
			num3 = input.nextInt();
			Average(num1,num2,num3);
			break;
		default:
			System.out.println("You chose a invalid number");
		}
	}

}
