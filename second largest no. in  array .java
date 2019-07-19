class array {

	public static void main(String[] args) {
		int  arr [] = { 92, 150, 2, 120, 67, 4, 81, 9, 88, 1 };
		int  max;
		int  secmx;

		 max = arr[0];
		 secmx = arr[0];

		 

		for (int i = 1; i < 10; i++) {
		  
		    if(arr[i] > max) {
		    	 secmx = max;
		        max = arr[i];
		    }
		   else if (arr[i]>secmx) {
			   secmx = arr [i];
		    	
		    }
		    
		    
		    
		    }
		
		System.out.println("second largest no is :" + secmx);
        
		}
}