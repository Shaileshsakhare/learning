package assignment;

public class NumberOfDays {
	public static void main(String[] args) {
		int mm = 2, yy = 2016, out;
		out = calculate(mm, yy);
		if(out==-1){
			System.out.println("Enter Correct Month");
		}
		else if(out==-2){
			System.out.println("Enter Correct Year.");
		}
		else{
			System.out.println("Number of days in "+mm+" of Year "+yy+" are "+out);
		}
	}

	public static int calculate(int mm, int yy) {
		int temp = 0;
		if ((mm <= 0) || (mm > 12)) {
			temp=-1;
		}
		else{
			switch (mm) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: temp=31;break;
			case 2:  if((yy%4==0)&&(yy%400!=0)||(yy%100==0)){
						temp=29;break;}
					else{
						temp=28;break;}
			case 4:
			case 6:
			case 9:
			case 11: temp=30;break;	
			default:
				break;
			}
		} 
		if(yy<=0){
			temp=-2;
		}
		
		 return temp; 	
	}

}
