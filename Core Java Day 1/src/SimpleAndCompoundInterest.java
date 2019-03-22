import java.util.Scanner;
import java.math.*;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		float Principal, RATE_OF_INTEREST, Years, SimpleInterest, CompoundInterest;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principle-");

		Principal = s.nextFloat();
		System.out.println("Enter the RATE_OF_INTEREST-");

		RATE_OF_INTEREST = s.nextFloat();
		System.out.println("Enter the number of years-");

		Years = s.nextFloat();
		s.close();

		SimpleInterest = Principal * Years * RATE_OF_INTEREST;

		System.out.println("Simple interest is-" + SimpleInterest);

		CompoundInterest = (float) (Principal * (Math.pow(1 + (RATE_OF_INTEREST / 100), Years)));

		System.out.println("Compound interest is-" + CompoundInterest);

	}

}
