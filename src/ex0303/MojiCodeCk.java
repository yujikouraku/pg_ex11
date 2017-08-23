package ex0303;

import java.io.*;

public class MojiCodeCk {

	public static void main(String[] args) {
		System.out.println("文字列を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
		String line = reader.readLine();
		int loop = line.length();
		for ( int i = 1; i <= loop; i++){
			char moji = line.charAt(i);
			System.out.println("'" + moji + "'の文字コードは" + (int)moji + "です。");
		}
		} catch (IOException e){
			System.out.println(e);
		}


	}

}
