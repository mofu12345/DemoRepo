package newQuestions;

public class PrintNumbers {

	public static void main(String[] args) {
		
		int one='A'/'A';
		String set="..........";
		
		for(int i=one; i<=set.length() * set.length(); i++)
		{
			System.out.println(i);
		}
		
		System.out.println();
		printNum(2, 20);
	}
	
	public static void printNum(int stNum, int endNum)
	{
		if(stNum<=endNum)
		{
			System.out.println(stNum);
			stNum++;
			printNum(stNum,endNum);
		}
	}

}
