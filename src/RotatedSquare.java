import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class RotatedSquare extends JPanel
{

	Shape drawShape = null;
	public RotatedSquare()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(100,100,200,200);
		
		AffineTransform tr = new AffineTransform();
		tr.setToRotation(Math.PI/4);
		tr.translate(100, -200);
		
		g2.setTransform(tr);
		
		g2.setColor(Color.gray);
		g2.fill(rect);
		g2.draw(rect);
		
	}

}
