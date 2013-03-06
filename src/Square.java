import java.awt.*;
import javax.swing.JPanel;


public class Square extends JPanel
{
	
	public Square()
	{
		setPreferredSize(new Dimension(400,400));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(100, 100);
		Rectangle rect = new Rectangle(10,10,100,100);
		
		
		g2.rotate(Math.toRadians(45));
		g2.setPaint(Color.BLUE);
		g2.draw(rect);
		g2.fill(rect);
		
	}
}
