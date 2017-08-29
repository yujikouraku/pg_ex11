package ex0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Graph1 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください。");
		try {
			String line = reader.readLine();
			int num = Integer.parseInt(line);
			DrawParabola(num);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void DrawParabola(int y){
		DrawParabolaBefore(y);

		System.out.println("");

		DrawParabolaAfter(y);

	}

	public static void DrawParabolaBefore(int a){
		for (int l = a; l < 0; l--){
			System.out.println(l);
			printGraph(l * l);

		}

	}

	public static void DrawParabolaAfter(int b){
		for (int m = 0; m < b ; m++){
			printGraph(m * m);
		}
	}

	public static void printGraph(int x){
		for (int i = 0; i < x; i++){
			System.out.print("*");
		}
		System.out.println("");
	}

}
