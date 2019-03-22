import java.util.Scanner;

public class IncomeTaxExample {

	public static void main(String[] args) {
		float CTC, incomeAmount;
		System.out.println("Enter CTC -");
		Scanner s = new Scanner(System.in);
		CTC = s.nextFloat();

		if (CTC >= 0 && CTC <= 180000) {
			System.out.println("Tax payable in percentage is Nil");
		}

	
		if (CTC >= 181001 && CTC <= 300000) {
			incomeAmount = CTC * 0.1f;
			System.out.println("Tax amount of Slab B is- " + incomeAmount);
		}

		
		if (CTC >= 300001 && CTC <= 500000) {
			incomeAmount = CTC * 0.2f;
			System.out.println("Tax amount of Slab C is- " + incomeAmount);
		}

		
		if (CTC >= 500001 && CTC <= 1000000) {
			incomeAmount = CTC * 0.3f;
			System.out.println("Tax amount of Slab D is- " + incomeAmount);
		}
		s.close();
	}

}
