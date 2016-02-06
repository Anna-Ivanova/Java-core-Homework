class array3{ 
public static void main (String[]args){

int[] array = { 50, 60, 30, 20, 10};

    for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" ");
   
    for(int i=0; i<(array.length-1)/2;i++){
    int temp=a[i];
	a[i]=a[a.length-1-i];
	a[a.length-1-i]=temp;
    
    }
   for(int i=0; i<array.length;i++){	
    	System.out.print(array[i]+" ");}
    	System.out.println(" "); 	
}
}