class Homework58{
public static void main(String[]args){
int zpchas=Integer.parseInt(args[0]);
int chasy=Integer.parseInt(args[1]);	
double zpweek;
if ((zpchas>=8)&(chasy<60)){
	if (chasy>40){
	zpweek=(zpchas*40)+(zpchas*(chasy-40)*1.5);
	System.out.println("Salary for week= "+zpweek);
	
}else{
	zpweek=(zpchas*chasy);
		System.out.println("Salary for week= "+zpweek);
}
}
else if (chasy>60){
System.out.println ("your employer dont have to work more than 60 hours");
}
else if (zpchas<8){
	System.out.println ("pls input salary not less than 8");
}	
}
	
}	
	
