import java.util.Scanner;

class a{
	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter three numbers :");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

if ((a<b) && (a<c)){
	System.out.println("third largest number is : " + a );
	}
	
 else if  ((b<c) && (b<a)){
	 
			System.out.println("third largest number is : " + b );	}	
		else 
			System.out.println("third largest number is : " + c);	
	 }
	}
