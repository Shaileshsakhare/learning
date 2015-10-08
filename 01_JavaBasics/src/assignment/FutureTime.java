package assignment;

public class FutureTime {
	public static void main(String[] args) {
		int h = 8, m = 56, s = 440, f;
		calculateFutureTime(h, m, s);
	}

	private static void calculateFutureTime(int h, int m, int s) {
		int ss,mm;
		ss=s/60;
		s=s%60;
		
		m=m+ss;
		mm=m/60;
		m=m%60;
		
		h=h+mm;
		System.out.println("Future Time: "+h+" : "+mm+" : "+ss);
	}
}
