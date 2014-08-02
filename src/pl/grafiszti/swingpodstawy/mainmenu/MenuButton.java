package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MenuButton extends JButton implements ActionListener {

	protected JFrame frame;

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
			SwingUtilities.updateComponentTreeUI(frame);
			frame.invalidate();
			frame.validate();
			frame.repaint();
			frame.setVisible(true);
		}
	}
}
