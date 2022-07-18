package threadingDemo;

public class KronometreThread implements Runnable {

	private Thread thread;
	private String threadName;

	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Olu�turuluyor. " + threadName);
	}

	@Override
	public void run() {
		System.out.println("�al��t�r�l�yor. " + threadName);

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException exception) {
			System.out.println("Kesildi : " + threadName);
			exception.printStackTrace();
		}
		
		System.out.println("Thread bitti : "  + threadName);
		
	}
	
	public void start() {
		System.out.println("Thread nesnesi olu�uyor.");
		if(thread==null) {
			thread= new Thread(this,threadName);
			thread.start();
		}
	}
}