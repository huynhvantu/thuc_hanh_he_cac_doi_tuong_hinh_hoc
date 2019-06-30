package Inheritance;

public class Square  extends Rectangle{
	public Square() {
		super.setWidth(1.0);
		super.setLength(1.0);
	}
	
	public Square(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public Square(double side, String color, boolean filled) {
		super.setWidth(side);
		super.setLength(side);
		super.setcolor(color);
		super.setfilled(filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setWidth(double width) {
		setSide(width);
		
	}
	
	public void setLength(double length) {
		setSide(length);
		
	}
	 
	@Override
	public String toString() {
		return " A Square with side="
				+ getSide()
				+ ", which is a subclass of "
				+ super.toString();	}
	
}
