package Abstract;

  public  abstract class Bird extends Animal implements CanFly, GetNAme {
	
	
	 private static  int num;
// FIRST subclass must implement all inherited abstract methods
	public Bird(String name) {
		super(name);
	}
	
//	@Override// abstract method eat(); can be final but it will not can inherited any subclass of Bird
//	public  void eat(){
//		System.out.println(getName() +" is pecking");
//	}
	
	@Override// abstract method breathe();
	public void breathe(){
		System.out.println("Breathe in, breathe out, repeat");
	}
	
	
	public abstract void sound();
	
	
	
	@Override
	public void fly() {
		System.out.println(getName()+ " is flapping its wings");
		
	}

	public void eggingOn(){
		
		
	}
	
	

}
