package Lab6;

	import java.io.*;

	public class Exe7 {
		public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter User Name ends with '_job' ");
				String input="";
				 while(true)
				  {
					  input=br.readLine();
					  boolean ch1=Validator.validatename(input);
					  if(ch1==true)
					  {
						  System.out.println("True: Successfully Recorded");
						  break;
				       }
					  else
						  System.out.println("False: Re Enter User Name"); 
					  
				  
				  }
				 
				
			}

}
