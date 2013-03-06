import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;


public class Chess extends JPanel
{
	
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public Chess()
	{
		setPreferredSize(new Dimension(800,800));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(300, 300);
		//Rectangle rect1 = new Rectangle();
		GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		path.moveTo(200,200);
		path.lineTo(-200, 200);
		path.lineTo(-200, -200);
		path.lineTo(200, -200);
		path.closePath();
		
		int height = 0;
		int bottom = 0;
		int top = 0;
		for(int i = 0; i <200; i += 50)
		{
			bottom = (height - i);
			path.moveTo(200, bottom);
			path.lineTo(-200, bottom);
			path.closePath();
			top = (height + i);
			path.moveTo(200, top);
			path.lineTo(-200, top);
			path.closePath();
		}
		
		for(int i = 0; i < 200; i += 50)
		{
			bottom = (height - i);
			top = (height + i);
			path.moveTo(bottom, 200);
			path.lineTo(bottom, -200);
			path.closePath();
			path.moveTo(top, 200);
			path.lineTo(top, -200);
			path.closePath();
		}
		
		Rectangle2D rectBlack = new Rectangle2D.Double(0,0,80,80);
		//for(int x = 0; x <)
		
		g2.draw(path);
	}
}
