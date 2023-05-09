package ex;

interface Shape {
	public double getArea();
}

class Rectangle implements Shape{
	private double width;
	private double height;
	
	@Override
	public double getArea() {
		return width*height;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
}

class Circle implements Shape{
	private double radius;
	
	@Override
	public double getArea() {
		return Math.PI*(radius*radius);
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
}

public class Exam {
	public static void main(String[] args) {
		Shape r = new Rectangle(75.2, 173.5);
		Shape c = new Circle(10.6);
		
		System.out.println("사각형 넓이 : " + r.getArea());
		System.out.println("원 넓이 : " + c.getArea());
		System.out.println("원 면적 : "+ ((int)(c.getArea()*100)/100.0));
		System.out.printf("원 넓이 : %.2f", c.getArea());
	}

}
