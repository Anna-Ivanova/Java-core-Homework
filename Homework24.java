class Homework24{
public static void main (String[]args){
int month=Integer.parseInt(args[0]);
switch (month){
	case 12: System.out.print("Декабрь-Зима");
	break;
	case 1: System.out.print("Январь-Зима");
	break;
	case 2: System.out.print("Февраль-Зима");
	break;
	case 3: System.out.print("Март-Весна");
	break;
	case 4: System.out.print("Апрель-Весна");
	break;
	case 5: System.out.print("Май-Весна");
	break;
	
	case 6: System.out.print("июнь-Лето");
	break;
	case 7: System.out.print("июль-Лето");
	break;
	case 8: System.out.print("Август-Лето");
	break;
	
	case 9: System.out.print("Сентябрь -Осень");
	break;
	case 10: System.out.print("Октябрь-Осень");
	break;
	case 11: System.out.print("Ноябрь-Осень");
	break;	
	default: 
    System.out.println("нет такого месяца"); 
	break;
} 
}
}

