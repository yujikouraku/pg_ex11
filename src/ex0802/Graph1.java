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
		for (int k = y; k <1 ; k--){
			printGraph(k*k);
		}
		System.out.println("");
		for (int j = 1 ; j <= y ; j++ ){
			printGraph(j*j);
		}
	}

	public static void printGraph(int x){
		for (int i =0 ;i<x ; i++){
			System.out.print("*");
		}
		System.out.println("");
	}

}
