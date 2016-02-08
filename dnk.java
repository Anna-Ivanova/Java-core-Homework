class dnk{
public static void main (String[]args){
String[] dnk = new String [4];
dnk[0]="GJCG";
dnk[1]="AAVVGDR";
dnk[2]="CHJKLGG";
dnk[3]="GCOHGCBNCCCGGGG";

    
               for(String text:dnk){ 
                      gccount(text);
					  int len=text.length();
					  int c=gccount(text);
					  int procent=(c*100)/len;
					   System.out.print(procent+" ");  
					 }
					
} 
 
	public static int gccount(String tex){
		       int count=0;
               char g='G';
               char c='C';
		for (int j=0;j<tex.length();j++){
                       char ch=tex.charAt(j);
                       if((ch==g)||(ch==c)){
                        count++;
	}
	}
	 return count;
	}
}

