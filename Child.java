package assignment1;

abstract class Parent{
	abstract String print();
}

public class Child extends Parent{
	
	@Override
	String print() {
		return ("Hello World");
	}
	
	public static void main(String[] args) {
		Parent c = new Child ();
		System.out.println(c.print());
	}
	
}
