package assignment;

public class PrimeNumbers_05 {
	public static void main(String[] args) {
		int a=50,b=-100;
		calculatePrime(a,b);
	}

	private static void calculatePrime(int a, int b) {
		int c = 0,temp,sum=0;

		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a<=1 || b<=1){
			System.out.println("Plese enter correct minimum value");	
		}
		if(a<0){
			a=2;
		}
		if(b<0){
			b=2;
		}

		for (int i = a; i <= b; i++) {
			c=0;
			for (int j = 2; j <= i/2; j++) {
				if(i%j==0){
					c=1;
					//break; 
				}
			}
			if(c==0){
				sum+=i;
			}
		}
		System.out.println("Sum "+sum);
	}
	
}
