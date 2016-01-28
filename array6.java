class array6{ 
 public static void main (String[]args){

    int n=Integer.parseInt(args[0]);  
	      
    int[] array = { 50, 60, 30, 20, 10};
    
       for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" ");
   
       for(int i=0; i<(array.length-n);i++){
    	array[i]=array[i+n];
    }
    	
        for(int i=array.length-n; i<array.length;i++){
    	
	    array[i] = 0;
    }
       for(int i=0;i<array.length;i++){
    	System.out.print(array[i]+" ");
    	}
}
}