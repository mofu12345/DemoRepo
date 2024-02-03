package stringRelatedQ;

public class VowelsCount {

	public static void main(String[] args) {
		
		String str= "I love java";
		str=str.toUpperCase();
		int count=0;
		
		for(int x=0; x<str.length(); x++)
		{
			if(isVowel(str.charAt(x)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isVowel(char t)
	{
		return t=='a' || t=='e' || t=='i' || t=='o' || t=='u'||
				t=='A' || t=='E' || t=='I' || t=='O' || t=='U';	
	}

}
