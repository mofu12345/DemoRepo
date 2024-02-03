package arrayRelatedProgram;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {

		int a[]= {50,30,60,20,70};
		//max value
		int max=a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max value: "+max); 
		
		//minimum value
		int min=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min value: "+min); 
	}

}
