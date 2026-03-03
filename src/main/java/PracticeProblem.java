import java.util.Scanner;

/**
 * Lesson: String Manipulation
 * Author: Weiya Liu
 * Date Created: Mar 3, 2026
 * Date Last Modified: Mar 3, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = input.nextDouble();

		System.out.println(Math.abs(num));

		input.close();

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		double num3 = (num1/num2);

		System.out.println(Math.floor(num3));
		System.out.println(Math.ceil(num3));

		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = input.nextDouble();

		System.out.println(Math.round(Math.sqrt(num)));

		input.close();

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		System.out.println(Math.pow(num1, num2)); 

		input.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		System.out.print("Input one more number: ");
		double num3 = input.nextDouble();

		System.out.println(Math.max(Math.max(num1,num2), num3));
		System.out.println(Math.min(Math.min(num1, num2), num3));

		input.close();

	}

}
