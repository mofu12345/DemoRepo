package swappingTwoNumbers;

public class Logic3 {

	public static void main(String[] args) {

		int a=10, b=20;
		
		System.out.println("Before swapping values are "+a+" "+b);
		
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //20/10=20
		
		System.out.println("After swapping values are "+a+" "+b);
	}

}
