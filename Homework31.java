class Homework31{
public static void main(String[]args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int sum=0;
for (int x=a;x<=b;x++){
	sum=sum+x*x;
System.out.println ("summa kvadratov A B "+ sum); 
}
for (int x=a;x>=b;x--){
	sum=sum+x*x;
System.out.println ("summa kvadratov A B "+ sum); 
}
}
}