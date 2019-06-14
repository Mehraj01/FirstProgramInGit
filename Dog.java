package Abstract;
//dog is CONCRETE (NON ABSTRACT SUBCLASS)
// First CoNCRETE must inherit all abstract methods from super class

public class Dog extends Animal{
	
	public Dog(String name){
		super(name);
	}
	
	

	@Override
	public void eat() {
		System.out.println(getName() + "is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in , breathe out, repeat");
		
	}
	
	

	@Override
	public void sleep() {
		super.sleep();
		System.out.println(" Dog must be awake");
		
	}
	
	
	
	

}
