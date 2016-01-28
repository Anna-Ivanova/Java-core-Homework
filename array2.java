class array2{ 
 public static void main (String[]args){

int[] array = { 50, 60, 30, 20, 10};

    int[] array = { 50, 60, 30, 20, 10};


    for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" ");
   
    for(int i=array.length-1; i>0;i--){
    	array[i]=array[i-1];
    }
	array[0]=0;
    	for(int i=0;i<array.length;i++){
    		
    		System.out.print(array[i]+" ");
    	}
}
}
//shift right