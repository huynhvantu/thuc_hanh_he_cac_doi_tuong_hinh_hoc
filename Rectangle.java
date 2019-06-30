package Inheritance;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;		
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.length = length;
		this.width = width;
		super.setcolor(color);
		super.setfilled(filled);
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		 
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width="
				+ getWidth()
				+ " and length= "
				+ getLength()
				+ ", which is a subclass of "
				+ super.toString();
	}
}
