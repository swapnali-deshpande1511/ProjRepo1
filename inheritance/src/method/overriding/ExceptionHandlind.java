


package method.overriding;

import java.util.Scanner;

public class ExceptionHandlind {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println( "please enter ten numbers ");
		int a = 0;

		int [] arr = new int [10];
		
		for (int i=0; i<=9; i++)
		{
			int x = sc.nextInt();
			arr [i]=x;
		
	}
		try 
		
		{
			System.out.println(arr[15]);
		}
		 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println( "out of danger");
		
		for (int i=0; i<=9; i++)
		{
			
          a = a + arr [i];
		}
		System.out.println("addition of array =" + a);
}
}
