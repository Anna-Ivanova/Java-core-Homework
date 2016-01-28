class array4{ 
public static void main (String[]args){

int[] array = { 50, 60, 30, 20, 10};
int x=array[0];
    for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" ");
   
    for(int i=0; i<array.length-1;i++){
    	array[i]=array[i+1];
    }
	    array[array.length-1] = x;
		
    for(int i=0;i<array.length;i++){
    	System.out.print(array[i]+" ");
    	}
}
}

// shift left