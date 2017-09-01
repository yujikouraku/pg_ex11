package ex1005;

public class Student {
	String name; //
	int[] tens; //
	public Student (String name, int x, int y, int z){
		this.name = name;
		this.tens = new int[3];
		this.tens[0] = x;
		this.tens[0] = y;
		this.tens[0] = z;

	}
	@Override
	public String toString() {
		String s = "[" + name;
		for (int i = 0; i < tens.length ; i++) {
			s += "," + tens[i] ;
		}
		s += "]";
		return s;
	}
	public int total() {
		int sum = 0;
		for (int i = 0; i < tens.length ; i++){
			sum += tens[i];
		}
		return sum;
	}

}
