package ex1605;

public class CountTen3 extends Thread {
	public static void main(String[] args) {
		//CountTenA ct = new CountTenA();
		//ct.start();
		new CountTen3().start();
		new CountTen3().start();
		new CountTen3().start();
		for (int i = 0; i < 10; i++){
			System.out.println(currentThread().getName() + ":i = " + i);
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++){
			System.out.println(getName() + ":i = " + i);
		}
	}


}
