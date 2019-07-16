package Lab2;

public abstract class Item {
	public Item() {
		System.out.println("This is an Item");
	}

	private int id;
	private String title;
	private int noc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show() {
		// TODO Auto-generated method stub

	}

}
