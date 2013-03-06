import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Panel extends JPanel
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	int nPoints = 20;
	double r1 = 6;
	double r2 = 5;
	double p = 70;

	
	public Panel()
	{
		setPreferredSize(new Dimension(1000,1000));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(400,400);
		int x1 = 0;
		//int x1 = (int)(r1+r2-p);
		int y1 = 0;
		int x2;
		int y2;
		for(int i = 0; i < nPoints; i++)
		{
			double t = i;
			//x2 = (int)((r1+r2)*Math.cos(t)-p*Math.cos((r1+r2)*t/r2));
			//y2 = (int)((r1+r2)*Math.sin(t)-p*Math.sin((r1+r2)*t/r2));
			x2 = (int)((20*t)*(Math.cos(t)));
			y2 = (int)((20*t)*(Math.sin(t)));
			g2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
		}
	}
}
