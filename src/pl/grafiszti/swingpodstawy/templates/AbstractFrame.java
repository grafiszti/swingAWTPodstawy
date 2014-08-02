package pl.grafiszti.swingpodstawy.templates;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public abstract class AbstractFrame extends JFrame {

	protected Point location;
	protected Dimension dimension;
	protected List<Component> componentsList;

	public AbstractFrame() {
		super("");
		this.location = new Point(0, 0);
		this.dimension = new Dimension(480, 640);
		this.componentsList = new ArrayList<Component>();
		init();
	}

	public AbstractFrame(String frameTitle, List<Component> componentList) {
		super(frameTitle);
		this.location = new Point(0, 0);
		this.dimension = new Dimension(480, 640);
		this.componentsList = componentList;
		init();
	}

	public AbstractFrame(String frameTitle, List<Component> componentList,
			Point location) {
		super(frameTitle);
		this.location = location;
		this.dimension = new Dimension(480, 640);
		this.componentsList = componentList;
		init();
	}

	public AbstractFrame(String frameTitle, List<Component> componentList,
			Point location, Dimension dimension) {
		super(frameTitle);
		this.location = location;
		this.dimension = dimension;
		this.componentsList = componentList;
		init();
	}

	private void init() {
		this.setLocation(location);
		this.setSize(dimension);
		for (Component comp : this.componentsList) {
			this.add(comp);
		}
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
}
