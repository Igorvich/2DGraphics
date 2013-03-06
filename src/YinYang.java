import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class YinYang extends JPanel
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public YinYang()
	{
		setPreferredSize(new Dimension(640,480));
		setBackground(Color.MAGENTA);	
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200, 200);
		Ellipse2D.Double circle = new Ellipse2D.Double(0 ,0 ,400 ,400);
		g2.setPaint(Color.white);
		g2.fill(circle);
		g2.draw(circle);
		Arc2D.Double rightHalf = new Arc2D.Double(0,0,400,400, 90, -180, Arc2D.OPEN);
		g2.setPaint(Color.black);
		g2.fill(rightHalf);
		g2.draw(rightHalf);
		Ellipse2D.Double bottomCircle = new Ellipse2D.Double(100,200,200,200);
		g2.setPaint(Color.black);
		g2.fill(bottomCircle);
		//g2.draw(bottomCircle);
		Ellipse2D.Double topCircle = new Ellipse2D.Double(100,0,200,200);
		g2.setPaint(Color.white);
		g2.fill(topCircle);
		//g2.draw(topCircle);
		//Ellipse2D.Double smallBottomCircle = new Ellipse2D.Double(middenOnderX,middenOnderY,50,50);
		Ellipse2D.Double smallBottomCircle = new Ellipse2D.Double(182.5,275,30,30);
		g2.setPaint(Color.white);
		g2.fill(smallBottomCircle);
		//g2.draw(smallBottomCircle);
		Ellipse2D.Double smallTopCircle = new Ellipse2D.Double(182.5,75,30,30);
		g2.setPaint(Color.black);
		g2.fill(smallTopCircle);
		g2.draw(smallTopCircle);
		
	}
	
}
