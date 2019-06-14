
package Abstract;

 abstract class Animal implements CanSleep {
	// IN ABSTACT class you can declare variables that are not static and final
	private String name;
	
	protected static final int h = 3;
	
	static int num = 3;

	public Animal(String name) {
		this.name = name;

	}

	

	private static void run() {
		System.out.println("run");
	}
	// you can define public, protected and private concrete(non Abstract)
	// methods
	// abstract methods may be only visible that is public or protected

    public abstract void eat();

	protected abstract void breathe();

	public void sleep() {
		System.out.println("How " + getName() + "s do sleep?");
	}

	// public abstract void haveBaby();

	public String getName() {

		// System.out.println("Name is "+name);
		return name;
	}

}