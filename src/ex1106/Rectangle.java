package ex1106;

public class Rectangle {
	final int INITIAL_WIDTH = 0;
	final int INITIAL_HEIGHT = 0;
	int width;
	int height;
	Rectangle() {
		setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
	}
	Rectangle(int w, int h){
		setSize(w, h);
		int x = 0;
		int y = 0;
	}
	Rectangle(int x, int y, int w, int h){
		
	}
	void setSize(int w, int h){
		if (w < 0){
			width = 0;
		}else {
			width = w;
		}		
		if (h < 0){
			height = 0;
		}else{
			height = h;
		}
	}
	void setLoaction(int x, int y){
		
	}
	int getArea(){
		return width * height;
	}
	@Override
	public String toString(){
		return "Rectangle(" + width + ", " + height + ")";
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("r1.width = " + r1.width);
		System.out.println("r1.height = " + r1.height);
		System.out.println("r1.getArea() = " + r1.getArea());
		Rectangle r2 = new Rectangle(123, 45);
		System.out.println("r2.width = " + r2.width);
		System.out.println("r2.height = " + r2.height);
		System.out.println("r2.getArea() = " + r2.getArea());
		System.out.println(r1);

	}
	// ２つのRectangleを比較して、等しかったらrue,
	// 等しくなかったらfalseを返す
	boolean areSame(Rectangle a,Rectangle b) {
		if (a == null || b == null) {
			return false;
		}else if(a.width == b.width && a.height == b.height){
			return true;
		}else {
			return false;
		}
	}

	boolean equals(Rectangle a) {
		if (a == null){
			return false;
		}else if (width == a.width && height == a.height) {
			return true;
		}else {
			return false;
		}
	}


}
