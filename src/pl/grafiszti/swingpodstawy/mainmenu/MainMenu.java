package pl.grafiszti.swingpodstawy.mainmenu;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.grafiszti.swingpodstawy.answers.zad41.Zad41Frame;

public class MainMenu extends JFrame {
	private static final long serialVersionUID = 7914062961526206490L;

	private JPanel mainButtonsPanel;
	private List<MenuButton> buttonsList;

	public MainMenu() {
		init();
	}

	private void init() {
		this.buttonsList = new ArrayList<MenuButton>();

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
		mainButtonsPanel.add(new MenuButton("Zad 4.1", build41Frame(), 20, 20));
	}

	private JFrame build41Frame() {
		return new Zad41Frame("Zad 4.1", new Point(300, 300));
	}
}
