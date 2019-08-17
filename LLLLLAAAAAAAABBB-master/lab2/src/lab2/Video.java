package lab2;

public class Video extends MediaItem {
	public Video(){
		System.out.println("This is a Video");
		setRuntime(2.30);
		setId(3);
		setTitle("Avengers");
		setNoc(5);
		setDirector("Russo Brothers");
		setGenre("SuperHero");
		setYear(2012);
		show();
	}
	private String director;
	private String genre;
	private int year;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void show(){
		System.out.println("Video Name="+getTitle());
		System.out.println("Video ID="+getId());
		System.out.println("Video Copies Available="+getNoc());
		System.out.println("Runtime="+getRuntime()+"hrs");
		System.out.println("Director="+getDirector());
		System.out.println("Genre="+getGenre());
		System.out.println("Year of Release="+getYear());
	}

}
