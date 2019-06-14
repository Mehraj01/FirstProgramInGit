package Abstract;
//it is  default or public  abstract

public abstract interface CanFly extends GetNAme{
	
	
	// all methods automatically public and abstract
	public abstract void fly();
	
	
	//No CONSTRUCTOR permitted
//	public CanFly(){
//		
//	}
	
	

	
	// can have static method since JAVA 8
	public static  void breathe(){
		System.out.println("Breathe in, breathe out, repeat");
	}

}
