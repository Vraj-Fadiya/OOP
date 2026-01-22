import java.util.Scanner;
class Rectangle{
	double width ,height;
	
	Rectangle()
	{
		width=1;
		height=1;
	}
	
	Rectangle(double w, double h)
	{
		width=w;
		height=h;		
	}

	void getArea()	
	{
		System.out.println("Area of Reactangle: "+ (width * height));
	}
	
	void getPerimeter()
	{
		System.out.println("Perimeter of Reactangle: "+ 2*(width + height));		
	}

	public static void main(String args[])
	{
		Rectangle obj1= new Rectangle();
		obj1.getArea();
		obj1.getPerimeter();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Width of Rectangle:");
		int a=sc.nextInt();
		System.out.println("Enter the Height of Rectangle:");
		int b=sc.nextInt();
	
		Rectangle obj2= new Rectangle();
		obj2.getArea();
		obj2.getPerimeter();
		
	}
} 