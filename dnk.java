class dnk{
public static void main (String[]args){
String[] dnk = new String [10];
dnk[0]="GJCASERRRTTTTG";
dnk[1]="AAVVGDR";
dnk[2]="CHJKLGG";
dnk[3]="GCOHGCBNCCCGGGG";
dnk[4]="GCOHGCBNCJJGBGGGGDCCGGGG";
dnk[5]="GCCGCGCGCGCGCGCGCGCGCGKDOOEUEUEUOHGCBNCCCGGGG";
dnk[6]="GKKKKKKKAAAAAJJRJTJTJTJTJTJTJTJLL;CCCCCCCOHGCBNCCCGGGG";
dnk[7]="GCOHGCBNCGG";
dnk[8]="GCOHGCBNNNNFFDDDSSCCGGGG";
dnk[9]="GCOHGCBNCCCGGGG";

int[]rez=new int[10];
int index=0;

    
               for(int i=0;i<dnk.length;i++){ 
                       String text=dnk[i];
                          rez[i]=gccount(text);
                          
                          if(rez[index]<rez[i]){
                            index=i;
                          }
                       int rezult=rez[index];
                                                          
                                          }
               System.out.print("The highes GC contains in index"+" "+index+" ");
                                         
                                        }
                                       
 
       public static int gccount(String tex){
                      int count=0;
               char g='G';
               char c='C';
                          int procent=0;
               for (int j=0;j<tex.length();j++){
                       char ch=tex.charAt(j);
                       if((ch==g)||(ch==c)){
                        count++;
       }
                   int len=tex.length();
                                         
                   procent=(count*100)/len;
       }
        return procent;
       }
}
