package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuButton extends JButton implements ActionListener {

	private JFrame frame;

	public MenuButton(String text, JFrame frame, int x, int y) {
		super(text);
		this.frame = frame;
		this.setSize(100, 200);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	public MenuButton(String text, JFrame frame, int x, int y, int width,
			int height) {
		super(text);
		this.frame = frame;
		this.setSize(width, height);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (frame.isVisible()) {
			frame.repaint();
		} else {
			frame.setVisible(true);
		}
	}
}
