package generateRandomNumberAndString;

import java.util.Random;
public class GenerateRandomNumber {

	public static void main(String[] args) {

		Random rand=new Random();
		int rand_int=rand.nextInt();
		System.out.println(rand_int);
		
		double rand_double=rand.nextDouble();
		System.out.println(rand_double); 
		
		int rand_int1=rand.nextInt(15);
		System.out.println(rand_int1);
		
	}

}
