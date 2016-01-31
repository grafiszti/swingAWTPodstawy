package pl.grafiszti.swingpodstawy.answers.zad41;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Zad41Frame extends JFrame {
	private static final long serialVersionUID = 1843585275605520548L;

	private JPanel mainPanel;

	public Zad41Frame() {
		init("Zad 4.1", new Point(200, 200));
	}
	
	public Zad41Frame(Point location) {
		init("Zad 4.1", location);
	}

	public Zad41Frame(String frameTitle) {
		init(frameTitle, new Point(200, 200));
	}

	public Zad41Frame(String frameTitle, Point location) {
		init(frameTitle, location);
	}

	private void init(String frameTitle, Point location) {
		this.setLocation(location);

		mainPanel = new Zad41Panel();
		
		this.add(mainPanel);

		this.pack();
	}
}
