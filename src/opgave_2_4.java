import java.awt.Color;

import javax.swing.*;





public class opgave_2_4 extends JApplet
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public static void main(String s[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("Crikeltje jonguh!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new opgave_2_4();
		applet.init();
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBackground(Color.BLACK);
		frame.setForeground(Color.BLACK);
		
	}
	
	public void init()
	{
		JPanel panel = new OpgavePanel();
		getContentPane().add(panel);
	}
	
}


