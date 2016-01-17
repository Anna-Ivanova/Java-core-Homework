class Homework22{
public static void main (String[]args){
int X1=Integer.parseInt(args[0]);
int Y1=Integer.parseInt(args[1]);
int X2=Integer.parseInt(args[2]);
int Y2=Integer.parseInt(args[3]);
if ((X1==X2)| (Y1==Y2) |  (Math.abs(X1-X2)==Math.abs(Y1-Y2))){
	System.out.print ("FERZ MOVES");
}
}
}