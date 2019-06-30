package Inheritance;
public class Shape {
	private String color;
	private boolean filled;
	
	
	public Shape() {
		this.color ="green";
		this.filled = true;
		
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;		
	}
	 
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;		
	}

	public boolean isFilled() {
		return filled;		
	}
	
	public void setfilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		return "A Shape with color of " + getcolor() + " and " + (isFilled()  ? "filled" : "not filled");
	}

}

