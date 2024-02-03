package InterfaceConcept;

public interface Car {
	//Always define only abstract methods.
	//no method body
	//only method declaration 
	//u don't have to define abstract because it only allows abs method
	//this is how we only achieve 100% abstraction
	//cannot create a obj of interface 
	//only final and static are allowed
	//when to use interface?
	//whenever u need to hide the whole implementation method then u can use interface
	int wheels=4;
	
		public void start();
		public void stop();
		public void refuel();

}
