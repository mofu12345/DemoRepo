package PlindromeSeries;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter a String: ");		
		String st=sc.nextLine();
		
		String org_String=st;
		
		String rev="";
		
		int len=st.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		if(org_String.equals(rev))
		{
			System.out.println(org_String+" is palindrome string");
		}
		else
		{
			System.out.println(org_String+" is not palindrome string");
		}
	}

}
