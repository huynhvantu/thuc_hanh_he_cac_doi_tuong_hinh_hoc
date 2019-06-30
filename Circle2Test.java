package Inheritance;

public class Circle2Test {

	public static void main(String[] args) {
		Circle2 circle = new Circle2();
		System.out.println(circle);
		
		circle = new Circle2(3.5);
		System.out.println(circle);
		
		circle = new Circle2 ("indigo", false, 3.5);
		System.out.println(circle);
	}

}
 