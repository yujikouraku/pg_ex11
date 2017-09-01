package ex1002;

public class Rectangle {
	int width;		 //長方形の幅
	int height;		//長方形の高さ

	// コンストラクタ
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 文字列表現
	@Override
	public String toString() {
		return "[ " + width + ", " + height + " ]";
	}

}

