package ex1603;

class LabelPrinter extends Thread{
	String label = "no label";
	LabelPrinter(String label) {
		this.label = label;
	}
	@Override
	public void run() {
		while (true) {
			System.out.println(label);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class PrintHello3 {
	public static void main (String[] args) {
		new LabelPrinter("おはよう！").start();
		new LabelPrinter("こんにちは！").start();
		new LabelPrinter("こんばんは！").start();
	}
}
