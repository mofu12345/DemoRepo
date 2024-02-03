package numberRelatedQuestions;

import java.util.Scanner;

public class CountingEvensAndOdds {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int evencount=0;
		int oddCount=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Numbers of even number: "+evencount);
		System.out.println("Numbers of odd number: "+oddCount);

		
	}

}
