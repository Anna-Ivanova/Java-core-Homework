class Homework29{
public static void main(String[]args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int sum=0;
for (int x=a;x<=b;x++){
	sum=sum+x;
System.out.println ("summa A B "+ sum); 
}
for (int x=a;x>=b;x--){
	sum=sum+x;
System.out.println ("summa A B "+ sum); 
}
}
}