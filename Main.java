package capgemini;
import java.util.*;
import java.io.*;
public class Main {
public static void main(String[] argrs)throws IOException{
	//Rectangle r=new Rectangle(21,10);
	Square s=new Square(10);
	calculateCost(s); 
	/*System.out.println(s.getArea());
	System.out.println(s.getPerimeter());
	Shape sq=new Square(10);
	System.out.println(sq.getArea());
	System.out.println(sq.getPerimeter());
	Shape cir=new Cirlce(4);
	System.out.println(cir.getArea());
	System.out.println(cir.getPerimeter());
	Shape tri=new Triangle(10);
	System.out.println(tri.getArea());
	System.out.println(tri.getPerimeter());*/
	
}
static void calculateCost(Shape s) {
	if( s instanceof Rectangle) {
		System.out.println("Rectangle");
	}
	else if( s instanceof Square) {
		System.out.println("Square");
	}
	else if( s instanceof Triangle) {
		System.out.println("Triangle");
	}
	else if( s instanceof Cirlce) {
		System.out.println("Circle");
	}
	else {
		System.out.println("Invalid shape");
	}
	//OR To find the name of the class with simple name the name ofthe package will not be printed and get class is from object class
	System.out.println(s.getClass().getSimpleName());
	//System.out.printlns();
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	double area=s.getArea();
	double peri=s.getPerimeter();
	double carp=area*10;
	double pai=peri*10*30;
	double cei=area*100;
	double total=carp+pai+cei;
	System.out.println("The carpet cost is "+carp);
	System.out.println("The painting cost is "+pai);
	System.out.println("The false ceileing cost is "+cei);
	System.out.println("The total cost is "+total);
}
}
