public class Figure {
double d1,d2;
Figure()
{}
Figure(double a,double b)
{
	d1=a;
	d2=b;
}
void area()
{
	
}
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	void area()
	{
		System.out.println("Area of rectangle is "+(d1*d2));
	}
}
class Square extends Figure
{
	Square(double a)
	{
		super(a,a);
	}
	void area()
	{
		System.out.println("Area of square is "+(d1*d2));
	}
}
class Demo
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(2,4);
		r.area();
		Square s=new Square(3);
		s.area();
	}
}
