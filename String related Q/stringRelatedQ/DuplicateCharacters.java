package stringRelatedQ;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str="Test automation using selenium";
		char[] ch=str.toCharArray();
		int count=1;
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("duplicate character in string are: "+ch[j]+i);
					count++;
				}
			}
		}
		System.out.println("number of duplicate character: "+count);
	}

}
