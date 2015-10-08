package assignment;

public class ThreeNumbersSort {
	public static void main(String[] args) {	
		int a=100,b=40,c=300,temp=0;
		
		if(c>a && c>b){
			if(a>b){
				temp=a;
				a=b;
				b=temp;
			}
		}	
		else if(b>a && b>c){
			temp=b;
			b=c;
			c=temp;
			
			if(a>b){
			temp=a;
			a=b;
			b=temp;
			}
		}
		else{
			temp=c;
			c=a;
			a=temp;
			if(a>b){
				temp=a;
				a=b;
				b=temp;
			}
		}
		System.out.println("a = "+a+" b= "+b+" c= "+c);
	}
}
