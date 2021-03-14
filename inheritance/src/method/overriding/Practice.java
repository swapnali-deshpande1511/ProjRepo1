package method.overriding;

import java.util.Scanner;



public class Practice extends ParentPractice {
	
	void m1 ( int a, int b){
		int e = a*b;
		System.out.println( " the result of multiplication of the numbers ="+ e);
	}
	
	void m2 (int a , int b )
	{
		int f = a%b;
		System.out.println(" the result of division = " + f);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println( "please enter two numbers ");
		 int num = sc.nextInt();
		 int num1 = sc.nextInt();
		
		 Practice cc = new Practice ();
		 ParentPractice pp = new ParentPractice();

                cc.m1(num, num1);
                cc.m2(num, num1);
                pp.m1(num, num1);
                pp.m2(num, num1);

	}

}
