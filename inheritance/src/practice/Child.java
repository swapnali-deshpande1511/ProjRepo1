package practice;

import java.util.Scanner;

public class Child {

	
	private static Child cc;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println( "please enter five numbers ");
		int num = sc.nextInt();

		int [] arr = new int [5];
		
		for (int i=0 ; i<=4 ; i++)
		{
			int k = sc.nextInt();
			arr[i]= k;
		}
			
		Parent.pc= new Parent();
		Child.cc= new Child ();
		
		Parent pc = null;
		int k = 0;
		pc.ev(k);
		pc.od(k);
		
		}
}

			