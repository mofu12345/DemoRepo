package InterfaceConcept;

public class CarTEST {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threftsafe();
		
		//dynamic polymorphism or upcasting
		Car c=new BMW();
		c.start();
		c.stop();
		c.refuel();
				
	}

}
