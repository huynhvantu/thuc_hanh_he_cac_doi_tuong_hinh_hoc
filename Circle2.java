package Inheritance;
import Inheritance.Shape;

public class Circle2 extends Shape{
	public double radius;
	
	public Circle2() {
		radius = 1.0;
	}
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	public Circle2(String color, boolean filled, double radius) {
		super.setcolor(color);
		super.setfilled(filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;		
	}
	
	public double getArea() {
		return radius*radius* Math.PI;
	}
	
	public double getPerimeter() {
		return radius  * 2 * Math.PI;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius="  
				+ getRadius()
				+ " , which is a subclass of "
				+ super.toString();
	}
}
