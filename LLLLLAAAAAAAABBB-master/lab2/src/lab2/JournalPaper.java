package lab2;

public class JournalPaper extends WrittenItem{
	private int year;
	public JournalPaper(){
		System.out.println("This is a JournalPaper");
		setAuthor("sankar");
		setId(2);
		setTitle("paper");
		setNoc(5);
		setYear(2019);
		show();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void show(){
		System.out.println("JournalPaper Name="+getTitle());
		System.out.println("JournalPaper ID="+getId());
		System.out.println("JournalPaper Copies Available="+getNoc());
		System.out.println("JournalPaper Author="+getAuthor());
		System.out.println("Year of Publication="+getYear());
	}
	
}
