package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner ax=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=ax.nextInt();
		
		int rev=0;
		
		while(num !=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
