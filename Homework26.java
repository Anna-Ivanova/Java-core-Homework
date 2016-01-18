class Homework26{
public static void main (String[]args){
int N=Integer.parseInt(args[0]);
if ((N>=100)|(N<=999));{
	int temp1=N/100;
	int temp2=N%100;
	int temp3=temp2/10;
	int temp4=temp2%10;
switch (temp1){
	case 1: System.out.print("сто ");
	break;
	case 2: System.out.print("двести ");
	break;
	case 3: System.out.print("тристо ");
	break;
	case 4: System.out.print("четыресто ");
	break;
	case 5: System.out.print("пятьсот ");
	break;
	
	case 6: System.out.print("шестьсот ");
	break;
	case 7: System.out.print("семьсот ");
	break;
	case 8: System.out.print("восемьсот ");
	break;
	
	case 9: System.out.print("девятьсот ");
	break;
		default: 
    System.out.println("число вне диапазона"); 
	break;
}
if ((temp2>9)&(temp2<20)){
	switch (temp2){
		case 11: System.out.print ("одинадцать");
		break;
		case 12: System.out.print("двенадцать ");
	break;
	case 13: System.out.print("тринадцать ");
	break;
	case 14: System.out.print("четырнадцать ");
	break;
	case 15: System.out.print("пятнадцать ");
	break;
	
	case 16: System.out.print("шестнадцать ");
	break;
	case 17: System.out.print("семнадцать ");
	break;
	case 18: System.out.print("восемнадцать ");
	break;
	
	case 9: System.out.print("девятнадцать ");
	break;
		default: 
   	break;
	}
} else {


switch (temp3){
	case 1: System.out.print ("десять ");
		break;
	case 2: System.out.print ("двадцать ");
		break;
	case 3: System.out.print("тридцать ");
	break;
	case 4: System.out.print("сорок ");
	break;
	case 5: System.out.print("пятьдесят ");
	break;
	
	case 6: System.out.print("шестьдесят ");
	break;
	case 7: System.out.print("семдесят ");
	break;
	case 8: System.out.print("восемдесят ");
	break;
	
	case 9: System.out.print("девяносто ");
	break;	
		default:
		break;
}
}
	switch (temp4){
	case 1: System.out.print ("один ");
		break;
	case 2: System.out.print ("два ");
		break;
	case 3: System.out.print("три ");
	break;
	case 4: System.out.print("четыре ");
	break;
	case 5: System.out.print("пять ");
	break;
	
	case 6: System.out.print("шесть ");
	break;
	case 7: System.out.print("семь ");
	break;
	case 8: System.out.print("восемь ");
	break;
	
	case 9: System.out.print("девять ");
	break;	
		default:
		break;
}
}
}
}
