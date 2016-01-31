class homework52{ 
 public static void main (String[]args){
	 
	 
System.out.print("Maximumsqsum= "+ Maximumsqsum(5,2,4)+""); 

}
public static int Maximumsqsum(int x, int y, int w){
	int max1;
	int max2;
	if (x>y && x>w){
		max1=x;
	} else if (y>x && y>w){
		max1=y;
	}else 
	 max1=w;
 if (max1!=x&& x>y && x>w){
	 max2=x;
	} else if (max1!=y&&y>x && y>w){
		max2=y;
	}else 
	 max2=w;
	 int squareSum=(max1*max1)+(max2*max2);
	 return squareSum;
 }
}