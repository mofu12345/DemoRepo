package stringRelatedQ;
import java.util.Arrays;
import java.util.Scanner;
public class CountWordsInString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = scanner.nextLine();
		
		String[] string = str.split(" ");
		
		System.out.println(Arrays.toString(string));
		System.out.println("Number of words: "+string.length);
	}

}
