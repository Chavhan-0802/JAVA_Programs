package pack1;

public class MethodClass {
	
	
	static void mul()
	{
		int q= 5;
		int p=20;
		int r = q*p;  
		System.out.println("add:" +r);	
	}
	
	
	static void add()
	{
		System.out.println("Calling Static Method in Static Method");
		mul();
	}
	 
	public static void main(String[] args) 
	{
		add();	
	}

}
