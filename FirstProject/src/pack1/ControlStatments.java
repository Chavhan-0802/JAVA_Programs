package pack1;

public class ControlStatments {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a = 1500;
		int b = 350;
		
		System.out.println("***If Else***");
		
		if(a>b)
		
			System.out.println("value of a is greater than b");	
		else	
			System.out.println("value of b is greater than a");	
		System.out.println();
		
		System.out.println("***Switch Case***");
		
		int days = 2;
			switch(days)
			{
			case 0 : 
				System.out.println("Sunday");
				break;
			case 1 :
				System.out.println("Monday");
				break;
			default :
				System.out.println("Value is incorrect.");
			}
		
		
	}

}
