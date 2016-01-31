class homework47{ 
 public static void main (String[]args){
	 
	 
	 String S ="dhy*jszn&*jgdw*a";
	 char zv ='*';
	 System.out.print(Countchars(S,zv)+""); 

}
public static int Countchars(String text, char searchchar){
	char chr;
	int count =0;
	
	 for (int i=0; i<text.length();i++){
		 chr=text.charAt(i);
		 if (chr==searchchar){
			 count++;
		 }
	 }
	 return count;
 }
}
