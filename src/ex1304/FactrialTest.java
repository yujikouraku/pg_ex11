package ex1304;

public class FactrialTest {

	public static void main(String[] args) {
		System.out.println(factorial(11));
	}
	public static int factorial(int n){
		if (n <= 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

}
