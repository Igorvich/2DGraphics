import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;


public class Pentagon extends JPanel
{

	public Pentagon()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		path.moveTo(200, 200);
		path.lineTo(245, 230);
		path.lineTo(225, 275);
		path.lineTo(175, 275);
		path.lineTo(155, 230);
		path.closePath();
		
		Stroke stroke = new BasicStroke(20,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(stroke);
		
		
		g2.draw(path);
	}
}
