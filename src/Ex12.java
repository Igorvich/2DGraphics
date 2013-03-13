


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class Ex12 extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new Ex12();
    applet.init();
    frame.getContentPane().add(applet);
    frame.pack();
    frame.setVisible(true);
  }
  
  public void init() {
    JPanel panel = new Ex12Panel();
    getContentPane().add(panel);
  }
}

class Ex12Panel extends JPanel{          
  public Ex12Panel() {
    setPreferredSize(new Dimension(400, 400));
    setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    int w = this.getWidth();
    int h = this.getHeight();
    int r = Math.min(w, h);
    Area a = new Area(new Rectangle(r, r));
    a.subtract(new Area(new Ellipse2D.Double(r/4, r/4, r/2, r/2)));
    AffineTransform tx = new AffineTransform();
    tx.translate((w-r)/2, (h-r)/2);
    g2.setClip(tx.createTransformedShape(a));
    g2.setFont(new Font("SanSerif", Font.BOLD,  r/3));
    g2.drawString("Java 2D", (w-r)/2-r/8, (h-r)/2+3*r/5);
  }
}
