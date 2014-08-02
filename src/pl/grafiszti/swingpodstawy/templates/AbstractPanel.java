package pl.grafiszti.swingpodstawy.templates;

import java.awt.Dimension;

import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel {
	protected Dimension panelDimension;

	public AbstractPanel() {
		super();
		panelDimension = new Dimension(640, 480);
	}
	
	public AbstractPanel(Dimension dimension){
		super();
		this.panelDimension = dimension;
	}
}
