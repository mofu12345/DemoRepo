package swappingTwoNumbers;

public class Logic2 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are "+a+" "+b);
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b;//30-10=20
		
		System.out.println("After swapping values are "+a+" "+b);

	}

}
