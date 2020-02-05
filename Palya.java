import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Palya extends JFrame{
	private JTextArea[][] mezok;
	private JPanel p1, p2;
	private JButton butt;
	Palya() {
		this.setTitle("Sakk");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mezok = new JTextArea[8][8];
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(8, 8));
		this.add(p1, BorderLayout.NORTH);
		//this.setResizable(false);
		p1.setSize(640, 640);
		this.setSize(640, 700);
		
		Border b = BorderFactory.createLineBorder(Color.BLACK, 1);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				JTextArea field = new JTextArea();
				mezok[i][j] = field;
				mezok[i][j].setBorder(b);
				mezok[i][j].setPreferredSize(new Dimension(80, 80));
				mezok[i][j].setFont(new Font("Serif", Font.BOLD, 4));
				p1.add(mezok[i][j]);

			}
		}
		
		p2 = new JPanel();
		this.add(p2, BorderLayout.SOUTH);
		butt = new JButton("Betölt");
		butt.addActionListener(new BetoltActionListener());
		p2.add(butt);
	}
	
	// Sudokuk betöltése------------------------------------
		private class BetoltActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 8; ++i) {
					for (int j = 0; j < 8; ++j) {
						mezok[i][j].setText(
								"                                \n"+
					            "                                \n"+
					            "             .::.               \n"+
					            "             _::_               \n"+
					            "           _/____\\_            \n"+
					            "           \\      /            \n"+
					            "            \\____/             \n"+
					            "            (____)              \n"+
					            "             |  |               \n"+
					            "             |__|               \n"+
					            "            /    \\             \n"+
					            "           (______)             \n"+
					            "          (________)            \n"+
					            "          /________\\           \n"+
					            "                                \n"
						);
					}
				}
			}
		}
}
