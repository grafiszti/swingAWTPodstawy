package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import pl.grafiszti.swingpodstawy.templates.AbstractFrame;

public class MenuButton extends JButton implements ActionListener {

	protected AbstractFrame frame;

	public MenuButton(String text, AbstractFrame frame, int x, int y) {
		super(text);
		this.frame = frame;
		this.setSize(100, 200);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	public MenuButton(String text, AbstractFrame frame, int x, int y,
			int width, int height) {
		super(text);
		this.frame = frame;
		this.setSize(width, height);
		this.setLocation(x, y);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setVisible(true);
	}
}
