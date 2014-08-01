package pl.grafiszti.swingpodstawy.templates;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

public abstract class AbstractFrame extends JFrame {

	protected Point location;
	protected Dimension dimension;

	public AbstractFrame() {
		super("");
		this.location = new Point(0, 0);
		this.dimension = new Dimension(480, 640);
		init(new ArrayList<Component>());
	}

	public AbstractFrame(String frameTitle, ArrayList<Component> componentList) {
		super(frameTitle);
		this.location = new Point(0, 0);
		this.dimension = new Dimension(480, 640);
		init(componentList);
	}

	public AbstractFrame(String frameTitle, ArrayList<Component> componentList,
			Point location) {
		super(frameTitle);
		this.location = location;
		this.dimension = new Dimension(480, 640);
		init(componentList);
	}

	public AbstractFrame(String frameTitle, ArrayList<Component> componentList,
			Point location, Dimension dimension) {
		super(frameTitle);
		this.location = location;
		this.dimension = dimension;
		init(componentList);
	}

	private void init(ArrayList<Component> componentList) {
		this.setLocation(location);
		this.setSize(dimension);
		for (Component comp : componentList) {
			this.add(comp);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
