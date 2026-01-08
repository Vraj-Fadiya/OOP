import java.util.Scanner;

class ATM{
	public static void main(String args[])
	{
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Amount: ");
	int amt = sc.nextInt();

	int a = amt / 100 ;
	amt %=100;
	System.out.println("No of 100 notes: "+a);
	
	 a = amt /50;
	amt %= 50;
	System.out.println("No of 50 notes: "+a);

	a = amt /10;
	amt %= 10;
	System.out.println("No of 10 notes: "+a);
	
	 a = amt /5;
	amt %= 5;
	System.out.println("No of 5 notes: "+a);
	
	a = amt /2;
	amt %= 2;
	System.out.println("No of 2 notes: "+a);
	
	 a = amt /1;
	amt %= 1;
	System.out.println("No of 1 notes: "+a);


	sc.close();
	
	}
}