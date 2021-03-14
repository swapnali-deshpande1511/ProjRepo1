package practice;

import java.util.Scanner;

public class Inhrt1 extends Inhrt

{



	private static Inhrt1 t1;

	public static void main (String[] args) {
		Scanner sc = new Scanner ( System.in);
		 System.out.println( "please enter value of radius of circle , lenghth of rechangle , width of rectangle");
		 int num = sc.nextInt();
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		Inhrt.t = new Inhrt ();
		Inhrt1.t1 = new Inhrt1();

		t.crl(num);
		
		t.rect(num1 , num2);
		
		
		
	}
}
















