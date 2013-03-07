import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Hello2D extends JPanel
{

	public Hello2D()
	{
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		String hello = "Hello 2D";
		g2.scale(-1, 1);
		g2.translate(-600, 200);
		g2.setColor(Color.red);
		Font font = new Font("Serif", Font.BOLD, 144);
		g2.setFont(font);
		g2.drawString(hello, 0, 0);
		
	}
}
