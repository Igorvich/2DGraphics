import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;


public class RoundText extends JPanel
{

	public RoundText()
	{
		setBackground(Color.white);
	}
	
	/*
	 * De opdracht zoals ik die zelf gemaakt heb.
	 * 
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Font font = new Font("Serif", Font.BOLD, 144);
		
		g2.setFont(font);
		g2.setColor(Color.black);
		g2.translate(300,300);
		
		g2.rotate(Math.PI/0.718);
		
		String text = "Graphics Java";
		String texts[] = text.split("");
		
		int x = -200;
		int y = 400;
		
		for(int i = 0; i <= text.length(); i++)
		{
			x += 125;
			y += 0;
			String letter = texts[i];
			//g2.scale(-1, 1);
			g2.rotate(75, x, y);
			//g2.rotate(Math.PI/10);
			g2.drawString(letter, x,y);
			//System.out.println(letter);
		}
		
		
		
	}
	
	/*
	 * Het antwoord zoals het uit het boek komt.
	 */
	
	/*
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Font font = new Font("Serif", Font.BOLD, 100);
		g2.setFont(font);
		AffineTransform tr = new AffineTransform();
		tr.translate(300,300);
		tr.rotate(-Math.PI / 7);
		tr.translate(-300,-300);
		int x = 280;
		int y = 500;
		String s = "Java Graphics";
		for(int i = 0; i<s.length(); i++)
		{
			g2.drawString(s.substring(i, i+1),x,y);
			g2.transform(tr);
		}
	}*/
	
}
