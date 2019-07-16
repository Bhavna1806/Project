package Lab2;

public class MediaItem extends Item {
	public MediaItem() {
		System.out.println("This is a MediaItem");
	}

	private double runtime;

	public double getRuntime() {
		return runtime;
	}

	public void setRuntime(double d) {
		this.runtime = d;
	}

}
