package FindLargestNumber;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" a is a largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" b is a largest number");
		}
		else
		{
			System.out.println(c+" c is a largest number");
		}
		
	}

}
