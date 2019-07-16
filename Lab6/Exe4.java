package Lab6;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.util.Scanner;

	public class Exe4 {
		
		public static void main(String args[])
		{
		File f1 = null;
		String filetype="Undetermined";
		Scanner in=new Scanner(System.in);
		System.out.println("/*give the file name along with the path*/\nname=");
		String name=in.nextLine();
//		f1=new File("C:\\Users\\ravkorra\\Desktop\\JEE training\\Exercises\\src\\lab8\\"+name);
		f1=new File(name);
		try {
			filetype = Files.probeContentType(f1.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Exists- "+f1.exists());
		System.out.println("Readable- "+f1.canRead());
		System.out.println("Writable- "+f1.canWrite());
		System.out.println("File Type- "+filetype);
		System.out.println("File Length- "+(byte)f1.length()+"Bytes");
		in.close();
		}
}
