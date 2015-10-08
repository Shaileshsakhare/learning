package assignment;

public class DigitOrdering {

	public static void main(String[] args) {
		long num1 = 45587, num2 = -43372;
		getOrder(num1);
		getOrder(num2);
	}

	private static void getOrder(long num) {
		// TODO Auto-generated method stub

		int digit;
		long temp;

		if (num > 0) {
			System.out.print("Ascending  : ");
			for (digit = 0; digit < 9; digit++)
				for (temp = num; temp > 0; temp /= 10)
					if (temp % 10 == digit)
						System.out.print(" " + digit);
		} else {
			System.out.print("\n"+"Descending  : "+"-");
			num = num * -1;
			for (digit = 9; digit > 0; digit--)
				for (temp = num; temp > 0; temp /= 10)
					if (temp % 10 == digit)
						System.out.print(" " + digit);

		}
	}

}