package reverseString;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String str="ABCD";
		String rev="";
		
		char a[]=str.toCharArray();
		
		int length=a.length;
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
	}

}
