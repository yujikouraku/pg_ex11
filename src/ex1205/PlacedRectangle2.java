package ex1205;

public class PlacedRectangle2{
	Rectangle r;
	int x = 0;
	int y = 0;
	PlacedRectangle2(){
		r = new Rectangle();
		setLocation(0, 0);
	}
	PlacedRectangle2(int x, int y){
		r = new Rectangle();
		setLocation(x, y);
	}
	PlacedRectangle2(int x, int y, int width, int height){
		r = new Rectangle(width, height);
		setLocation(x, y);
	}
	@Override
	public String toString(){
		return "[ (" + x + ", " + y + ") [" + r.width + ", " + r.height + "] ]";
	}
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}

	public static void main (String[] args) {
		PlacedRectangle2 a = new PlacedRectangle2();
		PlacedRectangle2 b = new PlacedRectangle2(10, 20);
		PlacedRectangle2 c = new PlacedRectangle2(10, 10, 100, 50);
		PlacedRectangle2 d = new PlacedRectangle2(5, 20, 800, 5);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}

}
