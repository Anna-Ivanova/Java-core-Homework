class Homework18{
public static void main (String[]args){
int a=Integer.parseInt(args[0]);
int b=a/100;
int c=(a%100)/10;
int d=(a%100)%10;
if (b<c & c<d){
	System.out.print (a+" vozrast posledovatelnost");
}
}
}