class homework51{ 
 public static void main (String[]args){
	int[] array = { 50, 60, 30, 20, 10}; 
	 
System.out.print( "Average count="+ Averagecount(array)+""); 

}
public static int Averagecount(int[]ar){
	
	int sum=0;
		for(int x:ar){
		sum+=x;
		}
	double aver= (double)sum/ar.length-1;
	return sum;
	 }
}

