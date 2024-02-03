package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb=new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.fund();
		
		//Dynamic polymorphism 
		Bank b=new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
		
	}

}
