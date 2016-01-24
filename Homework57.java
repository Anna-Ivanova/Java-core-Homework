import java.util.Random;
import java.util.Scanner;
class Homework57{
public static void main(String[]args){
	Random rand=new Random();
	int Zagadanoechislo=rand.nextInt(101);
	int Popitki=0;
	Scanner in= new Scanner(System.in);
	int Ugaday;
	boolean ugadal = false;
		System.out.println ("i gessed from 1 till 100 "+Zagadanoechislo);
 while (ugadal==false){
	 System.out.println("type number");
	  Ugaday=in.nextInt();
	  Popitki++;
	  
	  if(Zagadanoechislo==Ugaday){
		  ugadal=true;
	  }
	  
	 else if (Zagadanoechislo<Ugaday){
		 Ugaday=in.nextInt();
		 System.out.println("Try again - guessed number is bigger " + Ugaday);
	 } 
		 else if (Zagadanoechislo>Ugaday){
		 Ugaday=in.nextInt();
		 System.out.println("Try again - guessed number is Less " + Ugaday); 
		 
	 }
	 
	 
	 } 
 	if (Popitki<=3);{
	System.out.print ("You guessed a number, but looks like you're a cheater!");
	if (Popitki>=3 || Popitki<=7);
	System.out.print ("Congrats, you guessed a number!");
	if (Popitki>=7);
	System.out.print ("You guessed a number, but can be better!");

}
}
}

