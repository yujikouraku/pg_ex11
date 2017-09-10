package ex1109;
public class Rectangle2 {
	final int INITIAL_WIDTH = 10;
	final int INITIAL_HEIGHT = 20;
	int width;
	int height;
	int x;
	int y;
	Rectangle2() {
		setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
		setLocation(0, 0);
	}
	Rectangle2(int w, int h){
		setLocation(0, 0);
		setSize(w, h);
	}
	Rectangle2(int x, int y, int w, int h){
		setLocation(x, y);
		setSize(w, h);
	}
	void setSize(int w, int h){
		if (w < 0){
			width = 0;
		}
		if (h < 0){
			height = 0;
		}
		this.width = w;
		this.height = h;
	}
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	int getArea(){
		return width * height;
	}
	@Override
	public String toString(){
		return "[" + x + ", " + y + ", " + width + ", " + height + "]";
	}
	Rectangle2 intersect(Rectangle2 r){
		int sx = Math.max(this.x, r.x);
		int sy = Math.max(this.y, r.y);
		int ex = Math.min(this.x + this.width, r.x + r.width);
		int ey = Math.min(this.y + this.height, r.y + r.height);
		int new_width = ex - sx;
		int new_height = ey - sy;
		if (new_width >= 0 && new_height >= 0){
			return new Rectangle2(sx, sy, new_width, new_height);
		}else{
			return null;
		}
	}
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2();
		System.out.println("r1.width = " + r1.width);
		System.out.println("r1.height = " + r1.height);
		System.out.println("r1.getArea() = " + r1.getArea());
		Rectangle2 r2 = new Rectangle2(123, 45);
		System.out.println("r2.width = " + r2.width);
		System.out.println("r2.height = " + r2.height);
		System.out.println("r2.getArea() = " + r2.getArea());
		System.out.println(r1);
		System.out.println("r1とr2の重なり" + r1.intersect(r2));
	}
}
