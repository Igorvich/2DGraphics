import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class RoundText extends JPanel
{

	public RoundText()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Font font = new Font("Serif", Font.BOLD, 144);
		
		g2.setFont(font);
		g2.setColor(Color.black);
		g2.translate(300,300);
		
		
		String text = "Graphics Java";
		String texts[] = text.split("");
		
		int x = -100;
		int y = 0;
		
		for(int i = 0; i <= text.length(); i++)
		{
			x += 10;
			y += 10;
			String letter = texts[i];
			g2.scale(-1, 1);
			g2.rotate(Math.PI);
			g2.drawString(letter, x,y);
			//System.out.println(letter);
		}
		
		
	}
}
