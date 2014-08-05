package pl.grafiszti.swingpodstawy.answers.zad44;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Zad44Frame extends JFrame {
	public Zad44Frame() {
        super("MouseTest");
 
        this.setPreferredSize(new Dimension(400, 400));
		this.setLocation(600, 600);
 
		add(new Zad44Panel());
        pack();
    }
}
