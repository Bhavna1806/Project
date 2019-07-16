package Lab2;

public class CD extends MediaItem {
	public CD() {
		System.out.println("This is a CD");
		setRuntime(5);
		setId(4);
		setTitle("Sunflower");
		setNoc(5);
		setArtist("Post Malone");
		setGenre("Love");
		show();
	}

	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void show() {
		System.out.println("CD Name=" + getTitle());
		System.out.println("CD ID=" + getId());
		System.out.println("CD Copies Available=" + getNoc());
		System.out.println("Runtime=" + getRuntime() + "mins");
		System.out.println("Artist=" + getArtist());
		System.out.println("Genre=" + getGenre());
	}
}
