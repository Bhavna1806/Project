package Lab2;

@SuppressWarnings("all") // using to suppress the warnings
public class ClientProgram {
	public static void main(String[] args) {
		System.out.println("creating a book");
		Item book = new Book();
		System.out.println("Creating a JournalPaper");
		Item paper = new JournalPaper();
		System.out.println("Creating a Video");
		Item video = new Video();
		System.out.println("Creating a CD");
		Item cd = new CD();
	}
}