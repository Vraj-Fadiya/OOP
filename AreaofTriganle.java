import java.util.Scanner;

class AreaofTriganle{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st side of Triangle");
		int a = sc.nextInt();

		System.out.println("Enter 2nd side of Triangle");
		int b = sc.nextInt();

		System.out.println("Enter 3rd side of Triangle");
		int c = sc.nextInt();
	
		float s = (a+b+c)/2;
		
		double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("Area of Triangle: "+ Area);

		sc.close();
	}
}