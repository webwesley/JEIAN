package chap2;

public class DrawableRect extends Rectangle {
	
	public DrawableRect(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}



	public void draw(java.awt.Graphics g) {
		g.drawRect(x1, y1, (x1-x2), (y1-y1));
	}
}
