package Abstract;

public class Main {

	public static void main(String[] args) {
		 Dog dog = new Dog("York");
//		 dog.breathe();
		 dog.eat();
//		dog.sleep();
//		 dog.getName();
		 int a= Animal.num ;
		 System.out.println(a);
		 
		 Crow bird = new Crow("Crow");
//		 bird.breathe();
		 bird.eat();
		 bird.fly();
		 bird.sleep();
		 
		 //interface can call instance method if it has 
		 CanFly.breathe();
		 
		
		
		 
		 
//		 Penguin pen = new Penguin("Emporer");
//		 pen.fly();
//		 pen.sleep();

	}

}
