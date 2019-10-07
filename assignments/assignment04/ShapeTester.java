class Shape{
	String Name;
	double perimeter;
	double area;
	
	public void draw() {
		System.out.println("Drawing Shape");
		
	}
	
	public void getArea() {
		System.out.println(area);
	}
	
	public void getPerimeter() {
		System.out.println(perimeter);
	}
	
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
	
	@Override
	public void getArea() {
		double area;
		area = this.width * this.height;
		System.out.println(area);
	}
	
	@Override
	public void getPerimeter() {
		double perimeter;
		perimeter =  2 * this.width + 2* this.height;
		System.out.println(perimeter);
	}
	
	
}

class Circle extends Shape{
	double radius;
	double pi = Math.PI;
	
	Circle(double radius){
		this.radius = radius;
	}
		
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	
	@Override
	public void getArea() {
		double area;
		area = pi* this.radius *this.radius;
		System.out.println(area);
	}
	
	@Override
	public void getPerimeter() {
		double perimeter;
		perimeter =  2* pi * this.radius;
		System.out.println(perimeter);
	}
		
	
}

class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	public void getArea() {
		double area;
		area = this.side *this.side;
		System.out.println(area);
	}
	
	@Override
	public void getPerimeter() {
		double perimeter;
		perimeter =  4 * this.side;
		System.out.println(perimeter);
	}
}

public class ShapeTester {
	//Main operation class for testing
	public static void main(String args[])
	{
		Shape s = new Shape();
		Rectangle r = new Rectangle(2.0, 3.0);
		Circle c = new Circle(4.0);
		Square sq = new Square(4.0);
		
		r.getArea();
		r.getPerimeter();
		
		c.getArea();
		c.getPerimeter();
		
		sq.getArea();
		sq.getPerimeter();
		
		r.draw();
		c.draw();
		s.draw();
		sq.draw();
		
	}
}

