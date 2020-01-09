package ticket;

public class Pay extends Thread {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(" бс ");
			try {
				Pay.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
