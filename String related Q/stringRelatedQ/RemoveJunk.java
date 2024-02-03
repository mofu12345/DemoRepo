package stringRelatedQ;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="@#!@#&^&*& latin String 0123456547";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
