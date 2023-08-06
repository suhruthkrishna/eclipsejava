package capgemini;
import java.util.*;
import java.io.*;

public class Cirlce implements Shape{
	private double radius;
	public Cirlce(double radius) {
		super();
		this.radius=radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI*(Math.pow(radius, 2)));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2*Math.PI*radius);
	}

//public static void main(String[] argrs)throws IOException{

}
