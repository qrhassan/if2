package ifStaement;

	// import java.util.Random;

public class If {

	public static void main(String[] args) {
		
	/*
		int temp = (int)(Math.random()*50); 
		
		// int temp = (int)(Math.random(6));
		
		System.out.println(temp);
		
		if (temp==50) System.out.println("will go out");
		
		else if (temp >= 45) System.out.println("will go out");
		
		else System.out.println("its too cold");

			/*	
		Random random = new Random();
		
		int dice = random.nextInt(6)+1;  // can add nextInt() for double for value before .011 example- 1.0102
	                                       // vice versa for nextDouble()
		System.out.println(dice);
	 	*/
		
		/*
		int num = (int)(Math.random()*10);
		System.out.println(num);
		
		if(num>10)
		System.out.println(num + " is greater than 10");
		
		else if (num<10 && num>5)
				System.out.println(num + " is lesser than 10 & greater than 5");
		
		else
			System.out.println(num + " is less than 10");
		*/
		
		int temperature = (int)(Math.random()*50);
		System.out.println(temperature);
		
		if (temperature>40) System.out.println("will go out");
		
		else if (temperature<40) System.out.println("will not go out");
		
		else System.out.println("we'll think about it");
	}
	
}
	
