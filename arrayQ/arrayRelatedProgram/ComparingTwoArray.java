package arrayRelatedProgram;

import java.util.Arrays;

public class ComparingTwoArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a, b);
		
		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}

		}

}
