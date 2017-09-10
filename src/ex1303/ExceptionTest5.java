package ex1303;

public class ExceptionTest5 {
	public static void main(String[] args){
		try {
			method1(2);
			method2(0);
			method3(0);
		} catch (Exception e) {
			System.out.println("例外：" + e);
			e.printStackTrace();
		}
	}
	static void method1(int x) throws Exception{
		if (x < 0){
			throw new Exception();
		}

	}
	static void method2(int x) throws Exception{
		if (x == 0){
			throw new Exception();
		}
	}
	static void method3(int x) throws Exception{
		if (x > 0){
			throw new Exception();
		}
	}

}
