class array5{ 
 public static void main (String[]args){

int[] array = { 50, 60, 30, 20, 10};
int x=array[array.length-1];

    for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" ");
   
    for(int i=array.length-1; i>0;i--){
    	array[i]=array[i-1];
    }
	array[0]=x;
    	for(int i=0;i<array.length;i++){
    		
    		System.out.print(array[i]+" ");
    	}
}
}
//shift right