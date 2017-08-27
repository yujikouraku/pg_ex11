package ex0506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrinkIf {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("あ＝オレンジジュース");
			System.out.println("い＝コーヒー");
			System.out.println("う＝どちらでもない");
			System.out.println("あ、い、うのどれかを選んでください。");
			String line = reader.readLine();
			switch(line){
			case "あ":
				System.out.println("オレンジジュースです。");
				break;
			case "い":
				System.out.println("コーヒーです。");
				break;
			default:
				System.out.println("どちらでもありません。");
				break;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
