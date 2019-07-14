import java.util.Scanner;

class a{
	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter three numbers :");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((a>b) && (b>c) && (a>c)){
			System.out.println("third largest number is : " + b );
			
			}
			
		 else if  ((b>c) && (c>a) && (b>a)){
			 
					System.out.println("third largest number is : " + c);	}	
		 else if  ((b<c) && (c>a) && (a>b)){
			 
				System.out.println("third largest number is : " + a);	}	

		 else if  ((b<c) && (c>a) && (a<b)){
			 
				System.out.println("third largest number is : " + b);	}

		 else if  ((b>c) && (b>a) && (a>c)){
			 
				System.out.println("third largest number is : " + a);	}

		 else if  ((a>b) && (c>b) && (a>c)){
			 
				System.out.println("third largest number is : " + c); }
			 }
			}