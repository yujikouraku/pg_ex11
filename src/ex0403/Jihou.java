package ex0403;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jihou {

	public static void main(String[] args) {
		System.out.println("現在の時刻（時のみ）を数字で入力してください。");
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int time = Integer.parseInt(line);
			if ( 0 <= time && time<= 11 ){
				System.out.println("おはようございます");
			}else if ( time == 12) {
				System.out.println("お昼です");
			}else if ( 13 <= time && time <= 18) {
				System.out.println("こんにちは");
			}else if ( 19 <= time && time <= 23) {
				System.out.println("こんばんは");
			}else {
				System.out.println("時刻の範囲を超えています");
			}

		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
