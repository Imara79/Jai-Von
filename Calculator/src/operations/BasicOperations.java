package operations;

public class BasicOperations {

	public Double Addition(double Addend1, double AddendB) {
		double sum;
		sum = Addend1 + AddendB;
		return sum;
	}

	public Double Substraction(double minuend, double subtrahend) {
		double difference;
		difference = minuend - subtrahend;
		return difference;
	}

	public double Multiplication(double multiplier, double multiplicand) {
		double product;
		product = multiplier * multiplicand;
		return product;
	}

	public double Division(double dividend, double divisor) {

		double quotient = 0;
		if (divisor >0)
			quotient = dividend / divisor;
		else
			System.out.println("Cannot divide by zero.");
		return quotient;

	}
}
