package capgemini;
import java.lang.*;
public class Triangle implements Shape{
	private double height;
	public Triangle(double height) {
		super();
		this.height=height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double num=Math.sqrt(3)/4;
		return (num*(Math.pow(height, 2)));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 3*height;
	}
}
