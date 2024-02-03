package abstractionConcept;

public abstract class Bank {
	
	//partial abstraction because it has both abstract and non-abstract method
	//hiding the implementation logic-- is called abstraction
	//abs class can have abs method and non-abs method
	//cannot create a obj of abs class
	//when to use abs class?
	//whenever u have to achieve partial abstraction then u can use abs class.some implement can be common for all classes then then u can use abs class 
	
	int amt=100;
	final int rate=10;
	static int loanrate=12;

	public abstract void loan(); //abstract method
	
	//non-abstract method 
	public void credit()
	{
		System.out.println("Bank--Credit");
	}
	
	public void debit()
	{
		System.out.println("Bank--debit");
	}
}
