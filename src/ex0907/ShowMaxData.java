package ex0907;

public class ShowMaxData {

	public static void main(String[] args) {
		int [] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
		int max_data = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max_data){
				max_data = data[i];
			} else{

			}
		}
		System.out.println("最大値は" + max_data + "です。");

	}

}
