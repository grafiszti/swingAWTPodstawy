package pl.grafiszti.swingpodstawy.answers.zad42;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pl.grafiszti.swingpodstawy.utils.CloneableFrame;

public class Zad42Frame extends CloneableFrame {
	public static final int BUTTON_WIDTH = 400;
	public static final int BUTTON_HEIGHT = 300;

	private JPanel mainPanel;
	private List<JButton> buttonsList;

	public Zad42Frame() {
		this.mainPanel = new JPanel();
		this.buttonsList = new ArrayList<JButton>();

		this.setLocation(200, 300);
		this.setPreferredSize(new Dimension(400, 300));

		mainPanel.setLayout(new FlowLayout());

		this.addButtons();

		this.add(mainPanel);

		this.pack();
	}

	public void addButtons() {
		mainPanel.add(new FirstButton());
		mainPanel.add(new SecondButton());
		mainPanel.add(new ThirdButton());
	}

	private class FirstButton extends JButton implements ActionListener {
		private Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

		private FirstButton() {
			super("First");
			addActionListener(this);
			this.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			mainPanel.setBackground(colors[new Random().nextInt(3)]);
		}
	}

	private class SecondButton extends JButton implements ActionListener {

		private SecondButton() {
			super("Second");
			addActionListener(this);
			this.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Random generator = new Random();
			this.setBackground(new Color(generator.nextFloat(), generator
					.nextFloat(), generator.nextFloat()));
		}
	}

	private class ThirdButton extends JButton implements ActionListener {

		private ThirdButton() {
			super("Third");
			addActionListener(this);
			this.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (this.getText().equals("wcisniety")) {
				this.setText("nie wcisniety");
			} else {
				this.setText("wcisniety");
			}
		}
	}
}
