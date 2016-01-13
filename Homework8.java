class Homework8{
public static void main (String[]args){
int R=Integer.parseInt(args[0]);
int L=Integer.parseInt(args[1]);
int Pr=Integer.parseInt(args[2]);
double RAS=(L*100)/R;
double Pr1=(RAS*Pr)/100;
System.out.println("RASHOD NA 100KM= "+RAS); 
System.out.println("PRICE OF 1KM OF ROAD= "+Pr1); 
}
}