package ex0301;

public class Hikari_Kyori {

	public static void main(String[] args) {
		long c = 300000; // 光速：秒速30万km
		int sec = 60*60*24; //1日あたりの秒数
		System.out.println("光が1日に進む距離は" + (c * sec) + "kmです。");
	}

}
