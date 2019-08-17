package lab6;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2 {
	public static void main(String[] args) throws Exception 
	  {  
	    FileReader fr = new FileReader("C:\\Users\\ravkorra\\Desktop\\rr.txt"); 
	    int i=1;
	    String line;
	    BufferedReader br=new BufferedReader(fr);
	    while ((line=br.readLine())!=null) 
	    {
	    	System.out.println(i+"- "+line);
	    	i++;
	    }
	    fr.close();
	  } 

}
