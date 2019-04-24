package entities;

public class Rectangle {
	
	public double width;
	public double height;

	
	public double area() {
		return width * height;
		
	}

	public double perimeter() {
		return 2*(height+width);
		
	}
	
	public double diagonal() {
		return (height*height)+(width*width);
	}
	
	public String toString() {
		return "Area  = " + String.format("%.2f %n", area())+
			   "Perimeter = "+ String.format("%.2f %n", perimeter())+
			   "Diagonal = "+ String.format("%.2f %n", diagonal());
	}
	
}
