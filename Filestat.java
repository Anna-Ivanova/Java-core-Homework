/*52.	��������� FileStat. �������� ���������, ������� ����������� � �������� ���������� � �������� � ���������� ��������� ������ ��������� �����.
 
 * ���������� ������ ��������� ��������� ������:
a.	���������� �����
b.	���������� �����������
c.	���������� ����
d.	���������� �������� (������ �����)
���� � �������� ���������� ������������ � ��������� ������ FileStat, �������� � ������������ ���������� ��� �����. � ������ ������������� �����������:
e.	������ ������ ������ �� ����������, ���������� ��� ����� � ��� ������
f.	��������� ��������� ������, � �.�. ��� �����

*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class Filestat {
	
	public static void main (String[] args) throws IOException{
		
		
		 Scanner scaner=new Scanner (System.in);
		 System.out.println("pls input name file");
		 BufferedReader reader=null;
		 try{
		 reader= new BufferedReader(new FileReader ("C:\\Users\\Anna Ivanova\\workspace\\Filestat\\"+scaner.next()));;
		 }catch (FileNotFoundException ex){
			 System.out.println(ex.getMessage()+"not found");
			 System.exit(0);
		 }
      
			
		 
		    int count =0;
			int sentenceCount = 0;
			int wordcount=0;
			int charcount=0;
	        String line;
	        String delimiters = "?!.";
	        
	        
	        while ((line = reader.readLine()) != null) {
			 count++;
		     for (int i = 0; i < line.length(); i++) {
             if (delimiters.indexOf(line.charAt(i)) != -1) { 
             sentenceCount++;
                }
              } 
  	        String a[]=line.split(" ");
  	        for (int j=0; j<a.length;j++){
  	        	if (a[j].length()>0){
  	        		wordcount++;
  	        	}
  	        }
  	      while((reader.read())>-1){
	        	charcount++;
	        }	                
	        }
	    	        
	              
		    
			System.out.println("Quanty of rows="+count);	  
			System.out.println("Quanty of sentances="+sentenceCount);
			System.out.println("Quanty of words="+wordcount);

			
			System.out.println("Quanty of chars="+charcount);		 
			 
			reader.close();		
	        			
	}
	        }

	


