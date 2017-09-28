package ex1607;

public class PrintSymbol2 {
	public static void main(String[] args) {
		//PrintAsterisks2 ct = new PrintAsterisks2();
		//Thread th = new Thread(ct);
		//th.start();
		new Thread(new PrintAsterisks2()).start();

		//PrintEquals ct = new PrintEquals();
		//Thread th = new Thread(ct);
		//th.start();
		new Thread(new PrintEquals()).start();
	}

}
class PrintAsterisks2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("***");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
class PrintEquals implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("=====");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}