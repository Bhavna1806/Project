package lab6;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex3 {
	public static void main(String[] args) throws Exception 
	  {  
	    FileReader fr = new FileReader("C:\\Users\\ravkorra\\Desktop\\Test.txt"); 
	    int lines=0,characters=0,words=0;
	    String line;
	    BufferedReader br=new BufferedReader(fr);
	    while ((line=br.readLine())!=null) 
	    {
	    	lines=lines+1;
	    	String[] temp=line.split(" ");
	    	words=words+temp.length;
	    	for (String string : temp) {
	    		characters=characters+string.length();
				
			}
	    }
	    System.out.println("lines= "+lines);
	    System.out.println("characters= "+characters);
	    System.out.println("words= "+words);
	    fr.close();
	  } 

}
