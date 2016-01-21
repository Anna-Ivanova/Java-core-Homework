class Homework30{
public static void main(String[]args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int proiz=1;
for (int x=a;x<=b;x++){
	proiz=proiz*x;
System.out.println ("proiz A B "+ proiz); 
}
for (int x=a;x>=b;x--){
	proiz=proiz*x;
System.out.println ("proiz A B "+ proiz); 
}
}
}