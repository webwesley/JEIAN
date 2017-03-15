package chap2;

public class Circle {
	private int x, y;
	double radius;

	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle(double radius) {
		this((int) (radius/2), (int) (radius/2), radius);
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public boolean isInside(int x1, int y1) {
		double distance = Math.sqrt((Math.pow((x - x1), 2) + Math.pow((y - y1), 2)));
		if(distance < radius) {
			return true;
		}
		return false;
	}
	
	public Rectangle boundingBox() {
		int half = (int) radius/2;
		return new Rectangle(x- half, y - half, x + half, y + half);
	}
	
	public static class Test {
		public static void main(String[] args) {
			Circle a = new Circle(5,5,3);
			System.out.println(a.isInside(6, 6));
			System.out.println(a.isInside(10, 10));
			
		}
	}
}
