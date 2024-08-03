package pack1;

public class Operator {

	public static void main(String[] args) 
	{
		System.out.println("pre-increment");
		int x = 60;
		System.out.println(x);
		int y = ++x;
		System.out.println(y);
		
		System.out.println("post-increment");
		int a = 40;
		System.out.println(a);
		int b = a++;
		System.out.println(b);
		
		System.out.println("pre-decrement");
		int q = 80;
		System.out.println(q);
		int p = --q;
		System.out.println(p);
		
		System.out.println("post-decrement");
		int r = 60;
		System.out.println(r);
		int s = r--;
		System.out.println(s);
		
		System.out.println("Operators");
		int aa = 80;
		int bb = 90;
		System.out.println(aa < bb);
		System.out.println(aa > bb);
		int xx = 81;
		int yy = 80;
		System.out.println(xx >= yy);
		System.out.println(xx <= yy);
		int qq = 90;
		int pp = 75;
		System.out.println(qq != pp);
		System.out.println("Logical AND");
		int rr = 10;
		int ss = 10;
		boolean result1 = (rr!=ss)&&(rr>ss);
		System.out.println(result1);
		System.out.println("Logical OR");
		boolean result2 = (rr!=ss)||(rr>ss);
		System.out.println(result2);
		System.out.println("Modulus");
		int m = 98756;
		int n = 3;
		float div = m/n;
		System.out.println(div);
		int mod = m%n;
		System.out.println(mod);
		
		
		
		
		
	}

}
