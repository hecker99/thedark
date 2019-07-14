
import java.util.Scanner;

class a{
	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter three numbers :");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

if ((a>b) && (b>c)){
	System.out.println("third largest number is : " + c );
	
	}
	
 else if  ((b>a) && (c>a)){
	 
			System.out.println("third largest number is : " + a);	}

 else if  ((a>c) && (b>c)){
	 
		System.out.println("third largest number is : " + c);	}	

 else if  ((a>b) && (c>b)){
	 
		System.out.println("third largest number is : " + b);	}
	 }
	}

			
	
