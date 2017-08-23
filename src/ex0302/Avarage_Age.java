package ex0302;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avarage_Age {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。 \n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name1 = reader.readLine();
			System.out.println(name1 + "さん、こんにちは。\n");
			System.out.println(name1 + "さん、年齢を入力してください。\n");
			String line = reader.readLine();
			int age1 = Integer.parseInt(line);

			System.out.println("次の方、あなたの名前を入力してください。\n");
			String name2 = reader.readLine();
			System.out.println(name2 + "さん、こんにちは。\n");
			System.out.println(name2 + "さん、年齢を入力してください。\n");
			line = reader.readLine();

			int age2 = Integer.parseInt(line);

			System.out.println(name1 + "さんと" + name2 + "さんの年齢の平均は" +  (age1 + age2)/2 + "歳です。\n");

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e){
			System.out.println("年齢が正しくありません。\n");
		}

	}

}
