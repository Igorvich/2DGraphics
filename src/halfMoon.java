import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class halfMoon extends JPanel
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public halfMoon()
	{
		setPreferredSize(new Dimension(640,480));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200, 200);
		Arc2D.Double bottomCircle = new Arc2D.Double(0,0,400,400,90,180, Arc2D.OPEN);
		g2.setPaint(Color.gray);
		g2.fill(bottomCircle);
		g2.draw(bottomCircle);
		Arc2D.Double halfMoon = new Arc2D.Double(100,-50,400,500,90,180,Arc2D.CHORD);
		g2.setPaint(Color.white);
		g2.fill(halfMoon);
		g2.draw(halfMoon);
		
	}
}
