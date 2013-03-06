import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class CyclicObject extends JPanel
{

	public CyclicObject()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		//Rectangle2D rect = new Rectangle2D.Double(10,-100,100,100);
		GradientPaint gp = new GradientPaint(100,0,Color.yellow,800,600,Color.green);
		g2.setPaint(gp);
		g2.fillRect(100, 0, 700, 600);
	}
}
