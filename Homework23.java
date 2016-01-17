class Homework23{
public static void main (String[]args){
int N=Integer.parseInt(args[0]);
if ((N%4==0)& N%100!=0 || N%400==0){
		System.out.print (N+" vysokosniy god"+ " 366d");
}
	else {
	System.out.println (N + "nevisokosniy god" + " 365d");
	}
}
}