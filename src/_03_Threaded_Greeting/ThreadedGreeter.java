package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int idk = 0;

	public ThreadedGreeter(int x) {
		idk = x;
	}

	@Override
	public void run() {
		System.out.println("Hello from thread number: " + idk);
		Thread t = new Thread(new ThreadedGreeter(idk + 1));
		t.start();

	}

}
