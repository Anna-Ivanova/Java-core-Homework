class homework48{ 
 public static void main (String[]args){
	 
	 
System.out.print("Minimum= "+ Minimum(5,2,35)+""); 

}
public static int Minimum(int x, int y, int w){
	
	if (x<y && x<w){
		return x;
	} else if (y<x && y<w){
		return y;
	}else 
	 return w;
 }
}