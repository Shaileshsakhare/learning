package assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		int num1 = 40500, num2 = -40300;
		getOrder(num1);
		getOrder(num2);
	}

	private static void getOrder(int num) {
		System.out.println("Reverse: ");
		int rev = 0, temp = 0;
		
		while((num%10)==0){
			num=num/10;
		}
		if (num > 0) {
			for (temp = num; temp > 0; temp /= 10) {
				rev = (rev * 10) + (temp % 10);	
			}
		} else {
			num = num * -1;
			for (temp = num; temp > 0; temp /= 10){    
				rev = (rev * 10) + (temp % 10);
			}
			rev *= -1;
		}

		System.out.println("" + rev);
	}

}
