package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import pl.grafiszti.swingpodstawy.answers.zad41.Zad41Frame;
import pl.grafiszti.swingpodstawy.answers.zad41.Zad41Panel;
import pl.grafiszti.swingpodstawy.templates.AbstractFrame;
import pl.grafiszti.swingpodstawy.templates.AbstractPanel;

public class MainMenu extends AbstractPanel {
	private static final long serialVersionUID = 7914062961526206490L;

	public MainMenu() {
		super();
		init();
	}

	private void init() {
		//this.componentsList.add(new MenuButton("Zad 4.1", build41Frame(), 20,
		//		20));
	}

	private AbstractFrame build41Frame() {
		List<Component> componentList = new ArrayList<Component>();
		componentList.add(new Zad41Panel());
		return new Zad41Frame("Zad 4.1", componentList, new Point(300, 300));
	}
}
