public class Homework28 {
 public static void main(String[] args) {
int D=Integer.parseInt(args[0]);
int M=Integer.parseInt(args[1]);

switch (M){

case 1: if(D<=19){

System.out.print ("Козерог");

}else { System.out.print ("Водолей");}

break;

case 2: if(D<=18){

System.out.print ("Водолей");

}else { System.out.print ("Рыбы");}

break;

case 3: if(D<=19){

System.out.print ("Рыбы");

}else { System.out.print ("Овен");}

break;

case 4: if(D<=19){

System.out.print ("Овен");

}else { System.out.print ("Телец");}

break;

case 5: if(D<=20){

System.out.print ("Телец");

}else { System.out.print ("Близнецы");}

break;

case 6: if(D<=21){

System.out.print ("Близнецы");

}else { System.out.print ("Рак");}

break;

case 7: if(D<=22){

System.out.print ("Рак");

}else { System.out.print ("Лев");}

break;

case 8: if(D<=22){

System.out.print ("Лев");

}else { System.out.print ("Дева");}

break;

case 9: if(D<=22){

System.out.print ("Дева");

}else { System.out.print ("Весы");}

break;

case 10: if(D<=22){

System.out.print ("Весы");

}else { System.out.print ("Скорпион");}

break;

case 11: if(D<=22){

System.out.print ("Скорпион");

}else { System.out.print ("Стрелец");}

break;

case 12: if(D<=21){

System.out.print ("Стрелец");

}else { System.out.print ("Козерог");}

break;

default: System.out.print ("введите правильную дату и месяц");

}
}
}

