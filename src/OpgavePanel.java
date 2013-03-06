import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.*;

import javax.swing.JPanel;


public class OpgavePanel extends JPanel
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public OpgavePanel()
	{
		setPreferredSize(new Dimension(640,480));
	}
	
	//public void paintComponent(Graphics g)
	//{
		//super.paintComponent(g);
		//Graphics2D g2 = (Graphics2D)g;
		//g2.setColor(Color.BLACK);
		//Arc2D e = new Arc2D.Float(0,0,100,200,0,45, 1);
		//AffineTransform tr = new AffineTransform();
		//tr.rotate(Math.PI / 6.0);
		//Shape shape = tr.createTransformedShape(e);
		//g2.translate(300, 200);
		//g2.scale(2, 2);
		//g2.draw(shape);
		//g2.drawString("CIRKEL", 2,2);
		
	//}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.yellow);
		int x2Points[] = {5,200,5,200};
		int y2Points[] = {7,100,100,7};
		GeneralPath polygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD, x2Points.length);
		polygon.moveTo(x2Points[0], y2Points[0]);
		
		for (int i = 1; i <x2Points.length; i++)
		{
			polygon.lineTo(x2Points[i], y2Points[i]);
		}
		polygon.closePath();
		
		g2.draw(polygon);
	}
}