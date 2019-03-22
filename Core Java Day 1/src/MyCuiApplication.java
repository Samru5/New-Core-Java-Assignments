import java.util.Scanner;

public class MyCuiApplication {
	public static void main(String[] args) {
		String loginName;
		String password;
		int count = 0;
		Scanner s = new Scanner(System.in);
		do {
			count++;
			System.out.println("Enter login name-");

			loginName = s.nextLine();
			System.out.println("Enter password-");
			password = s.nextLine();

			if (loginName.equals("Tom") && password.equals("abc")) {

				System.out.println("Welcome " + loginName);
				break;
			}

		} while (count < 3);
		s.close();
		if (count == 3)

			System.out.println("Contact Admin");

	}

}
