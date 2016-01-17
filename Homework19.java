class Homework19{
public static void main (String[]args){
int n=Integer.parseInt(args[0]);
int a=n%10;
n/=10;
int b=n%10;
n/=10;
a=10*a+b;
if (n==a){
	System.out.print ("chislo polynom");
	}
	}
}