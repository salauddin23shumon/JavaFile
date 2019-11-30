package calculator;

import java.util.Scanner;

public class Calc {
	
	private static int num1, num2;

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.showMenu(calc);

	}

	public float sum(float a, float b) {

		return a + b;
	}

	public float subtract(float a, float b) {

		return a - b;
	}

	public float mul(float a, float b) {

		return a * b;
	}

	public float div(float a, float b) {

		return a / b;
	}
	
	public void showMenu(Calc calc) {
		float result;
		String choice="0";
		char end=0;
		Scanner read =new Scanner(System.in);
		do {
			System.out.println("Select any one");
			System.out.println("For addition press 1 or +");
			System.out.println("For subtraction press 2 or -");
			System.out.println("For multiplication press 3 or *");
			System.out.println("For division press 4 or /");
			System.out.println("For exit press c");
		
			choice=read.nextLine();

			switch(choice) {
				case "1": case "+":
					calc.takeInput();
					result = calc.sum(num1, num2);
					System.out.println("result is: "+result+"\n");
					break;
				case "2": case "-":
					calc.takeInput();
					result = calc.subtract(num1, num2);
					System.out.println("result is: "+result+"\n");
					break;
				case "3": case "*":
					calc.takeInput();
					result = calc.mul(num1, num2);
					System.out.println("result is: "+result+"\n");
					break;
				case "4": case "/":
					calc.takeInput();
					result = calc.div(num1, num2);
					System.out.println("result is: "+result+"\n");
					break;
				case "c":
					System.out.println("progrmm is terminated......");
					end = choice.charAt(0);
//					System.out.println(end);
					break;
				default:
					System.out.println("you have pressed wrong input!!! plese try again\n");
				
			}
		}while(end!='c' );
	}
	
	public void takeInput() {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter 1st number:");
		num1=input.nextInt();
		System.out.println("Enter 2nd number:");
		num2=input.nextInt();
	}

}
