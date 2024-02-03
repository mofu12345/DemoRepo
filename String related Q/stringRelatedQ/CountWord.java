package stringRelatedQ;
import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter a number: ");
	//	String a=sc.nextLine();
		String a="Welcome to java";
		int count=1;
		
		for(int i=0; i<a.length()-1; i++)
		{
			if((a.charAt(i)==' ') && (a.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
