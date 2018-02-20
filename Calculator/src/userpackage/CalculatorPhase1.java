package userpackage;

import java.util.Scanner;

import operations.BasicOperations;

public class CalculatorPhase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicOperations operation = new BasicOperations();

		Scanner scan = new Scanner(System.in);
		int option = 1;
		double numberA, numberB, result = 0;
		while (option != 0) {
			System.out.println("Choose an option:");
			System.out.println("1 Addition");
			System.out.println("2 Substraction");
			System.out.println("3 Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			option = scan.nextInt();
			if (option == 0) {
				System.out.println("Bye!");
				break;
			} else {
				System.out.println("Type the first number: ");
				numberA = scan.nextDouble();
				System.out.println("Type the second number: ");
				numberB = scan.nextDouble();

				switch (option) {
				case 1:
					result = operation.Addition(numberA, numberB);
					break;
				case 2:
					result = operation.Substraction(numberA, numberB);
					break;
				case 3:
					result = operation.Multiplication(numberA, numberB);
					break;
				case 4:
					result = operation.Division(numberA, numberB);
					break;

				default:
					System.out.println("Wrong Option!");
					break;
				}

				System.out.println("*** The result is:  " + result + "\n ***");
			}
		}
	}

}
