import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Slider extends JApplet
{

	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new Slider();
		applet.init();
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}
	
	FilledShape panel;
	public void init()
	{
		panel = new FilledShape();
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(panel, BorderLayout.CENTER);
		JPanel p = new JPanel();
		cp.add(p, BorderLayout.EAST);
		p.setLayout(new GridLayout(1,3,30,10));
		JSlider slider = new JSlider(JSlider.VERTICAL,0,255,100);
		p.add(slider);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ev){
				panel.red = ((JSlider)(ev.getSource())).getValue();
				panel.repaint();
		}
	});
		
		slider = new JSlider(JSlider.VERTICAL,0,255,100);
		p.add(slider);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ev){
				panel.green = ((JSlider)(ev.getSource())).getValue();
				panel.repaint();
			}
		});
		slider = new JSlider(JSlider.VERTICAL,0,255,100);
		p.add(slider);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ev){
				panel.blue = ((JSlider)(ev.getSource())).getValue();
				panel.repaint();
			}
		});
		
	}
}
