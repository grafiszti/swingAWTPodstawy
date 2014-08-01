package pl.grafiszti.swingpodstawy.main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.util.ArrayList;

import pl.grafiszti.swingpodstawy.zad41.Zad41Frame;
import pl.grafiszti.swingpodstawy.zad41.Zad41Panel;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ArrayList<Component> componentList = new ArrayList<Component>();
				componentList.add(new Zad41Panel());
				new Zad41Frame("Zad 4.1", componentList, new Point(300, 300));
			}
		});
	}
}
