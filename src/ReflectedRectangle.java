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
		setBackground(Color.gray);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(100,100,100,50);
		
		double x = 2;
		double y = x*2;
		
		
		AffineTransform tr = new AffineTransform();
		tr.setTransform(-3/5,4/5,4/5,3/5,0,0);
		tr.translate(100, 100);
		
		g2.setTransform(tr);
		
		g2.setPaint(Color.blue);
		g2.fill(rect);
		g2.draw(rect);
	}
}
