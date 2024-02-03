package arrayRelatedProgram;

public class LinearSearch {

	public static void main(String[] args) {

		int a[]= {20,18,30,48,47};
		
		int search_elem=20;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			//System.out.println(a[i]);
			if(search_elem==a[i])
			{
				System.out.println("Element fount at: "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
