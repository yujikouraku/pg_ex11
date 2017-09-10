package ex1204		;

public class PlacedRectangle extends Rectangle{
	int x = 0;
	int y = 0;
	PlacedRectangle(){
		setLocation(0, 0);
	}
	PlacedRectangle(int x, int y){
		setLocation(x, y);
	}
	PlacedRectangle(int x, int y, int width, int height){
		super(width, height);
		setLocation(x, y);
	}
	@Override
	public String toString(){
		return "[ (" + x + ", " + y + ") [" + width + ", " + height + "] ]";
	}
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}

	public static void main (String[] args) {
		PlacedRectangle a = new PlacedRectangle();
		PlacedRectangle b = new PlacedRectangle(10, 20);
		PlacedRectangle c = new PlacedRectangle(10, 10, 100, 50);
		PlacedRectangle d = new PlacedRectangle(5, 20, 800, 5);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}

}
