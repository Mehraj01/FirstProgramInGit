package Abstract;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(" I am not good at that , what about to swim instead?");
		
	}

	@Override
	public void sleep() {
		super.sleep();
		System.out.println("How  pengiuns do sleep?");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
