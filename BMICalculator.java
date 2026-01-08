import java.util.Scanner;

class BMICalculator{
	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Your Weight in Pound: ");
	double w = sc.nextDouble();
	
	System.out.println("Enter Your Height in Inche: ");
	double h = sc.nextDouble();

	w = w * 0.45359237d;
	h = h * 0.0254d;

	System.out.println("Weight : "+ w);
	System.out.println("Height : "+ h);

	double BMI = w/h*h;
	System.out.println("Your BMI is : "+ BMI);
	
	}
}