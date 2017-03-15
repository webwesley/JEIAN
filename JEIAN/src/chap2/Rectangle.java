package chap2;

public class Rectangle {
	
	public int x1, y1, x2, y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Rectangle() {
		this(0,0,0,0);
	}
	
	public void move(int deltax, int deltay) {
		x1 += deltax; x2 += deltax;
		y1 += deltay; y2 += deltay;
	} 
	
}
