package listRelatedQ;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {

	ArrayList<Integer> list=new ArrayList<>();
	
	//add element
	list.add(15);
	list.add(18);
	list.add(16);
	
	System.out.println(list);
	
	//GET ELEMENT
	int element=list.get(0);
	System.out.println(element);
	
	//add elemnt in between
	list.add(1, 13);
	System.out.println(list);
	
	//set element
	list.set(1, 14);
	System.out.println(list);
	
	//delete element
	list.remove(3);
	System.out.println(list);
	
	//size
	int size=list.size();
	System.out.println(size);
	
	//loop
	for(int i=0; i<list.size(); i++)
	{
		System.out.println(list.get(i));
	}
	//sorting
	Collections.sort(list);
	System.out.println(list);
	
	}
}
