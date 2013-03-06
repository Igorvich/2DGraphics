import java.awt.*;
import java.awt.geom.GeneralPath;

import javax.swing.*;


public class Octagon extends JPanel
{
	
	public Octagon()
	{
		setPreferredSize(new Dimension(640,480));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200,200);
		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		path.moveTo(20, 20);
		path.lineTo(20, -20);
		path.lineTo(0, -40);
		path.lineTo(-40, -40);
		path.lineTo(-60, -20);
		path.lineTo(-60, 20);
		path.lineTo(-40, 40);
		path.lineTo(0, 40);
		path.closePath();
		
		g2.draw(path);
	}
}
