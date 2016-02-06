class Sdvigrevers
{
		static void ap(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
public static void main (String[]args){

int n = Integer.parseInt(args[0]);
int[] a = new int[]{9,8,7,6,5,4,3,2,1};
    ap (a); 
    for (int i=0;i<a.length/2;i++){
    	int temp =a[i];
    	a[i]=a[a.length-1-i];
    	a[a.length-1-i]=temp;
    }
        ap(a);
   for (int j=0; j<(a.length-n)/2;j++ ){
   	int temp=a[j];
   	a[j]=a[a.length-j-n-1];
   	a[a.length-j-n-1]=temp;
   }
   ap(a);
   int count=0;
   for (int j=a.length-n;j<(a.length+n)/2;j++){
   	int temp=a[j];
   	a[j]=a[a.length-1-count];
   	a[a.length-1-count]=temp;
   	count++;
   }
   ap(a);  
}
}