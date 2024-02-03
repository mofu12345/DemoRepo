package stringRelatedQ;
import java.util.Scanner;

public class CountUpperAndLowerCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		String st=sc.nextLine();
		
		int upCount=0;
		int lwCount=0;
		
		for(char c: st.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				upCount++;
			}
			else if(Character.isLowerCase(c))
			{
				lwCount++;
			}

		}
		System.out.println("Number of uppercase letter: "+upCount);
		System.out.println("Number of lowercase letter: "+lwCount);

		
	}

}
