package stringRelatedQ;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class DuplicateCharInWord {

	public static void main(String[] args) {
		
		String str="Java is a programming language";
		
		Map<Character, Integer> dupCharMap= new HashMap<>();
		
		char[] charArr = str.toCharArray();
		for(char keys: charArr)
		{
			if(Character.isAlphabetic(keys))
			{
				if(dupCharMap.containsKey(keys))
				{
					dupCharMap.put(keys, dupCharMap.get(keys)+1);
				}
				else
				{
					dupCharMap.put(keys, 1);
				}
			}
		}
		Set <Map.Entry<Character, Integer>> entrySet=dupCharMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
		}
		
		
	}

}
