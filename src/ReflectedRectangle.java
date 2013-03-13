import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class ReflectedRectangle extends JPanel
{

	public ReflectedRectangle()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(0,0,100,100);
		//g2.scale(1, 1);
		g2.drawLine(0, 0, 500, 500);
		
		AffineTransform tr = new AffineTransform();
		tr.translate(50,50);
	    tr.rotate(90);
		//tr.rotate(90);
		//tr.scale(3, 3);
		tr.translate(-50,-50);
		tr.scale(3, 3);
		
		
		g2.setTransform(tr);
		
		g2.setPaint(Color.blue);
		g2.fill(rect);
		g2.draw(rect);
	}
}
