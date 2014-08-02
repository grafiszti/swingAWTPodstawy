package pl.grafiszti.swingpodstawy.utils;

import javax.swing.JFrame;

public class CloneableFrame extends JFrame implements Cloneable {
	
	public CloneableFrame(){
		super();
	}
	
	public CloneableFrame(String frameTitle){
		super(frameTitle);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
