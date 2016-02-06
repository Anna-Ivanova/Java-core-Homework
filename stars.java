class stars{ 
 public static void main (String[]args){

	
    int a=8;
	star(a);
	triangle1(a);
	square(a);
	pryamougolnik(a);
	
	}
	public static void star (int num){
		
		for (int i=0; i<num;i++){
			System.out.print('*');
		
		}
			System.out.println();
	}
	public static void triangle1(int a){
	for(int j=0;j<=a;j++){
	star(j);
	}
	System.out.println();
	for(int j=a;j>0;j--){
		star(j);
	} 
	}
	public static void square(int b){
	for(int j=0;j<b;j++){
	star(b);
	}
	System.out.println();
	}
public static void pryamougolnik(int b){
	for(int j=0;j<b/2;j++){
	star(b);
	}	
}
}