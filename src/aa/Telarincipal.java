package aa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

public class Telarincipal extends JFrame {

	private JButton bt1, bt2, bt3;
	private Musica mu;
	Evento v = new Evento();

	public Telarincipal() {

		botao();
		setLayout(null);
		setSize(500, 400);
		setLocation(600, 300);
		setVisible(true);

	}

	public void botao() {

		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");

		add(bt1);
		add(bt2);
		add(bt3);

		bt1.setBounds(200, 200, 50, 50);
		bt2.setBounds(260, 200, 50, 50);
		bt3.setBounds(320, 200, 50, 50);
		bt1.addActionListener(v);
		bt2.addActionListener(v);
		bt3.addActionListener(v);

	}

	private class Evento implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (evento(bt1) == 1) {

				evento(bt1);

			} else if (evento(bt2) == 2) {

				evento(bt2);

			} else if (evento(bt3) == 3) {

				evento(bt3);

			}

		}

	}

	public int evento(JButton b) {

		int a;

		try {

			if (b == bt1) {

				mu.play("a");
				return 1;
			} else if (b == bt2) {

				mu.play("b");
				return 2;

			} else{

				mu.play("c");
				return 3;

			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "n pegou otario");
			e.printStackTrace();
			return 0;
		}

	}

	public static void main(String[] args) {

		new Telarincipal();

	}

}
