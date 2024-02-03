package abstractionConcept;

public class HDFCBank extends Bank{

	@Override
	public void loan() 
	{
		System.out.println("HDFC--LOAN Method");
	}
	
	public void fund()
	{
		System.out.println("HDFC--Funds");
	}

}
