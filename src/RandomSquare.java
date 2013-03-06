import java.awt.*;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;


public class RandomSquare extends JPanel implements ActionListener
{
	
	public RandomSquare()
	{
		setBackground(Color.white);
		Timer timer = new Timer(1000/1000, this);
		timer.start();
		
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Random random = new Random();
		
		
		for(int x = 0; x < 800; x += 5)
		{
			for(int y = 0; y < 800; y += 5)
			{
				Rectangle2D rect = new Rectangle2D.Double(x,y,5,5);
				float red = random.nextFloat();
				float green = random.nextFloat();
				float blue = random.nextFloat();
				Color randomColor = new Color(red, green, blue);
				g2.setColor(randomColor);
				g2.fill(rect);
				g2.draw(rect);
			}
		}
	}
}
