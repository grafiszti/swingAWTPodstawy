package pl.grafiszti.swingpodstawy.zad41;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import pl.grafiszti.swingpodstawy.templates.AbstractFrame;

public class Zad41Frame extends AbstractFrame {
	private static final long serialVersionUID = 1843585275605520548L;

	public Zad41Frame() {
		super();
	}

	public Zad41Frame(String frameTitle, ArrayList<Component> componentList) {
		super(frameTitle, componentList);
	}

	public Zad41Frame(String frameTitle, ArrayList<Component> componentList,
			Point location) {
		super(frameTitle, componentList, location);
	}

	public Zad41Frame(String frameTitle, ArrayList<Component> componentList,
			Point location, Dimension dimension) {
		super(frameTitle, componentList, location, dimension);
	}
}
