class factorial{
public static void main (String[]args){

	int n=Integer.parseInt(args[0]);
	System.out.print("Factorial= "+f(n));
	}
		public static int f (int n){
			int result;
			if(n==1){
				result=1;
					}else{
				result=f(n-1)*n;
			}return result;
			
		}
	}
