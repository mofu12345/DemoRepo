package arrayRelatedProgram;

public class DuplicateElementInArray {

	public static void main(String[] args) {

	/*	String a[]= {"java","C","C++","python","Java"};
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("found duplicate: "+a[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false)
		{
			System.out.println("duplicate not found");
		} */
		
		int a[]= {12,12,13,14,14,15,15,16};
		
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate: "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicate");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
