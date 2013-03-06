import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class FilledShape extends JPanel
{
	int red = 100;
	int green = 100;
	int blue = 100;
	
	public FilledShape()
	{
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		/*super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200, 200);
		Rectangle2D rect = new Rectangle2D.Double(0,0,200,200);
		g2.setColor(Color.green);
		g2.fill(rect);
		double x = rect.getCenterX();
		double y = rect.getCenterY();
		Ellipse2D circle = new Ellipse2D.Double(x - 40,y - 40,80,80);
		g2.setColor(Color.white);
		g2.fill(circle);
		g2.draw(rect);
		g2.draw(circle);*/
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(200,200,200,200);
		g2.setColor(new Color(red,green,blue));
		g2.fill(rect);
		g2.draw(rect);
		
	}
}
