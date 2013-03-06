import java.awt.*;
import java.awt.geom.GeneralPath;

import javax.swing.*;

public class Moon extends JPanel
{
	
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public Moon()
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
		for(int x = 0; x >-100; x--)
		{
			for(int y = -100; y < 0; y++)
			{
				if(x == 0)
				{
					path.moveTo(0, -100);	
				}
				else
				{
					path.lineTo(x, y);
				}
			}
		}
		
		for(int x = -100; x <0; x++)
		{
			for(int y = 0; y > -100; y--)
			{
				if(x == -100)
				{
					path.moveTo(-100,0);
				}
				else
				{
					path.lineTo(x, y);
				}
			}
		}
		path.closePath();
		Color color = new Color(0f,0.5f,0.125f);
		g2.setColor(color);
		g2.draw(path);
		
	}
	
}
