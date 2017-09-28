package ex1606;

public class PrintSymbol {
	public static void main(String[] args) {
		new PrintAsterisks().start();
		new PrintEquals().start();
	}
}
class PrintAsterisks extends Thread {
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
class PrintEquals extends Thread {
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