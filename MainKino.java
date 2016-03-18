import java.util.HashMap;
import java.util.Map;

public class MainKino {
	
	public static void main(String[] args){
	Kinoteatr a=new Kinoteatr ("Rodina", "Hmelnickogo, 5", 2);
	Kinoteatr b=new Kinoteatr ("Kinostar", "Deribasovskaya, 12", 1);
	Kinoteatr c=new zal("Zvezdniy", "Dobrovolskogo, 62", 3, "Red", "Vizhivshiy","15:00");
	Map<String, Object> Kinoteatr = new HashMap<String, Object>();
	Kinoteatr.put("1",a );
	Kinoteatr.put("2",b );
	Kinoteatr.put("3",c);
		
	System.out.println(Kinoteatr.keySet());	
	System.out.println(Kinoteatr.entrySet());	
		
	}
}