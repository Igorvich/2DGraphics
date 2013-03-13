import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class ClipString extends JPanel
{

	public ClipString()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D.Double rect = new Rectangle2D.Double(200,200,200,200);
		Ellipse2D.Double circle = new Ellipse2D.Double(250,250,100,100);
		
		g2.setClip(rect);
		
		//g2.clipRect(200, 200, 200, 200);
		g2.setColor(Color.gray);
		g2.fill(rect);
		g2.setColor(Color.black);
		g2.setFont(new Font("Serif", Font.BOLD, 60));
		
		
		drawString(g,"Diederich\nRules",200,200);
		//g2.drawString(text, 200, 300);
		g2.setColor(Color.white);
		g2.fill(circle);
		g2.draw(circle);
		//g2.draw(rect);
	}
	
	private void drawString(Graphics g, String text, int x, int y)
	{
		for(String line : text.split("\n")) g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}
}
