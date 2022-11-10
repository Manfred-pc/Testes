import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KSAJKKJS{
	
	public static void main(String[] args) throws MalformedURLException {

	    URL url = new URL("https://i.pinimg.com/originals/57/55/a8/5755a88523523c540731f6c59a78eb6f.gif");
	    Icon icon = new ImageIcon(url);
	    JLabel label = new JLabel(icon);

	    JFrame f = new JFrame("Animation");
	    f.getContentPane().add(label);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.pack();
	    f.setLocationRelativeTo(null);
	    f.setVisible(true);
	}

}
