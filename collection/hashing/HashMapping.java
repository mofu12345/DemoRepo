package hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapping {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap <>();
		
		map.put(101, "Abaiya");
		map.put(102, "Ashfaq");
		map.put(103, "Arabia");
		
		System.out.println(map);
		
//		for(Map.Entry<Integer, String> e: map.entrySet())
//		{
//			System.out.print(e.getKey()+ " ");
//			System.out.print(e.getValue());
//			System.out.println();
//		}
//		
		//another way
		Set<Integer> keys=map.keySet();
		
		for(int key: keys) 
		{
			System.out.println(key+ " "+map.get(key));
		}
	//remove
		map.remove(102);
		System.out.println(map);
	}
}
