package ifelse;



public class IfElseStatement {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if (num>10) 
					System.out.println(num + " is greater than 10");
		
		else if (num<=10 && num>=5)		
					System.out.println(num + " is greater 10 & lesser than 15");
		else 		
					System.out.println(num + " is lesser than 10");
		
		
	}
	
	
}
