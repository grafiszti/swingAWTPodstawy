package pl.grafiszti.swingpodstawy.main;

import java.awt.EventQueue;
import pl.grafiszti.swingpodstawy.mainmenu.MainMenu;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainMenu().setVisible(true);
			}
		});
	}
}
