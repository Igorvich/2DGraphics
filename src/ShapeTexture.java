import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ShapeTexture extends JPanel
{
	private BufferedImage image;

	public ShapeTexture()
	{
		setBackground(Color.white);
		URL url = getClass().getClassLoader().getResource("images/DarkIce.jpg");
		try
		{
			image = ImageIO.read(url);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(200, 200);
		TexturePaint tp = new TexturePaint(image, new Rectangle2D.Double(100,100,image.getWidth(), image.getHeight()));
		Rectangle2D rect = new Rectangle2D.Double(100,100,200,200);
		g2.setPaint(tp);
		g2.fill(rect);
	}
}
