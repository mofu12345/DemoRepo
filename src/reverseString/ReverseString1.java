package reverseString;
import java.util.Scanner;
public class ReverseString1 {

	public static void main(String[] args) {

		//String str="ABCD";
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		String str=sc.nextLine();
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string: "+rev);
	}

}
