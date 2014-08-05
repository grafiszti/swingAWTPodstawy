package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.grafiszti.swingpodstawy.answers.zad41.Zad41Frame;
import pl.grafiszti.swingpodstawy.answers.zad42.Zad42Frame;
import pl.grafiszti.swingpodstawy.answers.zad43.Zad43Frame;
import pl.grafiszti.swingpodstawy.answers.zad44.Zad44Frame;

public class MainMenu extends JFrame {
	private static final long serialVersionUID = 7914062961526206490L;

	private JPanel mainButtonsPanel;

	public MainMenu() {
		init();
	}

	private void init() {
		this.setLocation(200, 300);
		this.setPreferredSize(new Dimension(300, 600));

		mainButtonsPanel = new JPanel();
		mainButtonsPanel.setLayout(new FlowLayout());

		this.addButtons();

		this.add(mainButtonsPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	private void addButtons() {
		mainButtonsPanel.add(new MenuButton("Zad 4.1", new Zad41Frame(
				new Point(300, 300)), 20, 20));
		mainButtonsPanel
				.add(new MenuButton("Zad 4.2", new Zad42Frame(), 30, 30));
		mainButtonsPanel
				.add(new MenuButton("Zad 4.3", new Zad43Frame(), 40, 40));
		mainButtonsPanel
				.add(new MenuButton("Zad 4.4", new Zad44Frame(), 50, 50));
		}
}
