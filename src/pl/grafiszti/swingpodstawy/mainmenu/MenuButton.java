package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import pl.grafiszti.swingpodstawy.utils.CloneableFrame;

public class MenuButton extends JButton implements ActionListener {

	protected CloneableFrame newStateFrame;
	private JFrame frame;

	public MenuButton(String text, CloneableFrame frame, int x, int y) {
		super(text);
		this.newStateFrame = frame;
		this.setSize(100, 200);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	public MenuButton(String text, CloneableFrame frame, int x, int y,
			int width, int height) {
		super(text);
		this.newStateFrame = frame;
		this.setSize(width, height);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			frame = (JFrame)newStateFrame.clone();
			frame.repaint();
		} catch (CloneNotSupportedException exception) {
			exception.printStackTrace();
		}
		frame.setVisible(true);
	}
}
