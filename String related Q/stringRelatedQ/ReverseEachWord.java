package stringRelatedQ;

public class ReverseEachWord {

	public static void main(String[] args) {
		//Approach-1;	
	/*	String str="Welcome to java";
		
		String [] words=str.split(" ");
		String revString="";
		
		for(String w:words)
		{
			String reverseWord="";
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			revString=revString+reverseWord+" ";
		}
		System.out.println(revString); */
		
		
		
		
		
		
		String str="Welcome to java";
		
		String [] words=str.split(" ");
		String reverseWord="";
		
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
		}
		System.out.println(reverseWord);

	}

}
