package stringRelatedQ;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class DuplicateCharacter {
	public static void main(String[] args) 
	{
		printDuplicates("A");
		printDuplicates("");
		printDuplicates(null);
		printDuplicates("ANACONDA CONFRONT");
		printDuplicates("007 IS A JAMES BOND TAG NUMBER"); 
	}
	
	public static void printDuplicates(String str)
	{
		if(str == null)
		{
			System.out.println("NULL String");
			return;
		}
		
		if(str.isEmpty())
		{
			System.out.println("Empty String");
			return;
		}
		
		if(str.length()==1)
		{
			System.out.println("Single Char String");
			return;
		}
		
		char words[]=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(Character ch: words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);		
			}			
		}
	
		Set <Map.Entry<Character, Integer>> entrySet =charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()> 1)
			{
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
		}
	}
	
}


