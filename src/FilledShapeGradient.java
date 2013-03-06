import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class FilledShapeGradient extends JPanel
{

	public FilledShapeGradient()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200, 200);
		GradientPaint gp = new GradientPaint(0,0,Color.black,0,200,Color.white);
		g2.setPaint(gp);
		g2.fillRect(0,0,200,200);
	}
}
