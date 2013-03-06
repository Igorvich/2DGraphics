import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

 
class ChessBoardPanel extends JPanel {
 
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public ChessBoardPanel() 
	{
		setBackground(Color.white);
		setPreferredSize(new Dimension(600, 400));
	}
 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		g2.setColor(Color.black);
 
		int w = this.getWidth();
		int h = this.getHeight();
		
		int x0 = w/10;
		int y0 = h/10;
		int y = y0;
		int x = x0;
 
		path.reset();
		for (int i = 0; i <= 8; i++) {
			path.moveTo(x, y0);
			path.lineTo(x, h - y0);
			x += x0;
		}
		for (int i = 0; i <= 8; i++) {
			path.moveTo(x0, y);
			path.lineTo(w - x0, y);
			y += y0;
		}
		
		for ( int i = 0; i < 8; i++ )
		{		     
			for ( int j = 0; j < 8; j++ )
			{         
				if ((i+j)%2==0);
				{
                     g2.fillRect(x ,y ,x0 ,y0);
		        }
				x += x0;
			}
		 
		}
		
		path.closePath();
		g2.draw(path);
	}
}