import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int  arr [] = { 92, 108, 2, 120, 67, 4, 81, 9, 88, 1 };
		int  max;
		 max = arr[0];

		for (int i = 1; i < 10; i++) {
		  
		    if(arr[i] > max){
		        max = arr[i];
		    }
		}
	 System.out.println("max number is :" + max);
	 
	 
 }