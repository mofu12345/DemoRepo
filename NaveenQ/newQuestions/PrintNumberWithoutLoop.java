package newQuestions;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		
		printNum(1);
		System.out.println();
		printNumber(5, 50);
	}
	
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void printNumber(int stNum, int endNum)
	{
		if(stNum<=endNum)
		{
			System.out.println(stNum);
			stNum++;
			printNumber(stNum,endNum);
		}
	}
	

}
