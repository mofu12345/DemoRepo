package arrayRelatedProgram;

public class SumOfElementOfArray {

	public static void main(String[] args) {

		
		int a[]= {5,2,4,7,8};
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
