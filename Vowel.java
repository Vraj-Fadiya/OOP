import java.util.Scanner;

class Vowel {
    public static void main(String args[])
{	
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Character: ");
	char a = sc.next().charAt(0);
	
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		System.out.println("Character is Vowel");
	
	else	
		System.out.println("Charcter is Consonant");
		
	
	//System.out.println(a);
	
	sc.close();
		
}
}