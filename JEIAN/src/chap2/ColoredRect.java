package chap2;

import java.awt.*;

public class ColoredRect extends DrawableRect {
	protected Color border, fill;
	private int width, height;

	public ColoredRect(int x1, int y1, int x2, int y2, Color border, Color fill) {
		super(x1, y1, x2, y2);
		this.width = x2-x1;
		this.height = y2 - y1;
		this.border = border;
		this.fill = fill;
	}
	
	public void draw(Graphics g) {
		g.setColor(fill);
		g.fillRect(x1, y1, width, height);
		g.setColor(border);
		g.drawRect(x1, y1, width, height);
	}

}
