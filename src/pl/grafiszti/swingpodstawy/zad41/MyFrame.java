package pl.grafiszti.swingpodstawy.zad41;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1843585275605520548L;
	
	public MyFrame(){
		super("Zad 4.1");
		init();
	}
	
	public MyFrame(String frameTitle){
		super(frameTitle);
		init();
	}
	
	private void init(){
		MyPanel mainPanel = new MyPanel();
		
		this.add(mainPanel);
		this.pack();
		this.setVisible(true);
	}
}
