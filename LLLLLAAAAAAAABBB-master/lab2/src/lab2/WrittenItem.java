package lab2;

public abstract class WrittenItem extends Item {
	private String author;
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public WrittenItem()
	{
		System.out.println("This is a written item");
	}
}
