package capgemini;

public class Square implements Shape{
	private double side;
	public Square(double side) {
		super();
		this.side=side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
	
}
