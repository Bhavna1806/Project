package lab2;

public  class Book extends WrittenItem {
	public Book()
	{
		System.out.println("This is a book");
		setAuthor("ravi");
		setId(1);
		setTitle("java");
		setNoc(5);
		show();
	}
	
	public void show(){
		System.out.println("Book Name="+getTitle());
		System.out.println("Book ID="+getId());
		System.out.println("Book Copies Available="+getNoc());
		System.out.println("book Author="+getAuthor());
	}
	
}
