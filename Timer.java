package lab10;

public class Timer implements Runnable {

	@Override
	public void run() {
		long start_time = System.currentTimeMillis();
		while (true) {
			long current_time = System.currentTimeMillis() - start_time;

			long seconds = (current_time / 1000) % 60;
			long minutes = (current_time / 1000) / 60;
			System.out.println(seconds + " seconds , " + minutes + " minutes.");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ex) {
				System.out.println("Timer interrupted");
			}
		}
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		Thread thread = new Thread(timer);
		System.out.println("Timer:");
		thread.start();
	}

}
