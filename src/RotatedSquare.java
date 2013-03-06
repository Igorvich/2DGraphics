import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class RotatedSquare extends JPanel implements MouseListener
{

	Shape drawShape = null;
	public RotatedSquare()
	{
		setBackground(Color.white);
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(100,100,200,200);
		g2.setColor(Color.gray);
		g2.fill(rect);
		g2.draw(rect);
		
	}

	@Override
	public void mouseClicked(MouseEvent ev)
	{

	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent ev)
	{
		Graphics g = getGraphics();
		Point p1 = ev.getPoint();
		AffineTransform tr = new AffineTransform();
		double a = Math.atan2(0,45);
		tr.setToRotation(a);
		drawShape = tr.createTransformedShape(drawShape);
		repaint();
	}
}
