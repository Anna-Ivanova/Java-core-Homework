class Homework15b{
public static void main (String[]args){
int N=10675;
int hours=N/3600;
int ostsec=N%3600;
int min=ostsec/60;
int sec=ostsec%60;
System.out.println("hours="+ hours);
System.out.println("min="+ min); 
System.out.println("sec="+ sec); 
}
}