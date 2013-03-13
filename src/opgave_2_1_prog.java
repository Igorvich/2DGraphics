import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class opgave_2_1_prog extends JApplet
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;


	public static void main(String s[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("don't know");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setPreferredSize(new Dimension(640, 480));
		JApplet applet = new opgave_2_1_prog();
		applet.init();
		//applet.setPreferredSize(new Dimension(640,480));
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public void init()
	{
		JPanel panel = new ClipString();
		panel.setPreferredSize(new Dimension(800,800));
		Container cp = getContentPane();
		cp.add(panel);
	}
}
