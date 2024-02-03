package arrayRelatedProgram;

public class EvenAndOddFromArray {

	public static void main(String[] args) {

	/*	int a[]= {1,2,5,6,7,4};
		
		System.out.print("even number: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		System.out.print("odd number: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			System.out.print(a[i]);
		} */
		
		/*int	a[]= {1,8,3,6,5,4,7};
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("number of even: "+evenCount);
		System.out.println("number of odd: "+oddCount); */
		
		//even and odds from array
		int a[]={12,15,16,18,14,11,13};

		int evenCount=0, oddCount=0;
		for(int i=0; i<a.length; i++)
		{
		 if(a[i]%2==0)
		 {
		  evenCount++;
		 }
		 else
		 {
		  oddCount++;
		 }
		}
		System.out.println("number of even digits: "+evenCount);
		System.out.println("number of odd digits: "+oddCount);

	
	
	}

}
