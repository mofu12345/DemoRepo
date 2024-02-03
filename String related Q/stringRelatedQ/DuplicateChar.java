package stringRelatedQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		String str="java ia a prPPpogramming language";

		Map <Character, Integer> charMap= new HashMap <>();

		char[] charArr= str.toCharArray();
		for(char key: charArr)
		{
		   if(Character.isAlphabetic(key))
		   {
		      if(charMap.containsKey(key))
		      {
		         charMap.put(key, charMap.get(key)+1);
		      }
		      else
		      {
		         charMap.put(key, 1);
		      }
		   }  
		}

		Set <Map.Entry<Character, Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
		   if(entry.getValue()>1)
		   {
		      System.out.println(entry.getKey()+ ":" + entry.getValue());
		   }
		}
	}
	}


