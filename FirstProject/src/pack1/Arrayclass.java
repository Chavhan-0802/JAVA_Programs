package pack1;

public class Arrayclass {
	
	public static void main(String[] args) {
		
		int[] array1 = {10,20,30,40,50};
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]); 
		
		System.out.println("--------------------");
		System.out.println(array1[4]-10);
		System.out.println("--------------------");
		int ArraySize = array1.length;
		System.out.println(ArraySize);
		System.out.println("--------------------");
		array1[2]= 300;
		System.out.println(array1[2]);
		System.out.println("-------------------");
		int[] array2 = new int[5];
		System.out.println(array2);
		System.out.println(array2[4]);
		
		System.out.println(array2[0]=1);
		System.out.println(array2[1]=2);
		System.out.println(array2[2]=3);
		System.out.println(array2[3]=4);
		System.out.println(array2[4]=5);
		
		
		
		
		
	}

}
