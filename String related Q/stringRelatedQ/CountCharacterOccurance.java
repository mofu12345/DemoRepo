package stringRelatedQ;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Java Programming java oops";
		
		int totalCount=s.length();
		
		int countAfterRemoval=s.replaceAll("a", "").length();
		
		int count=totalCount-countAfterRemoval;
		
		System.out.println("Number of occurance of a: "+count);
	}

}
