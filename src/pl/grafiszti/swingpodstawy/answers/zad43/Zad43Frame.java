package pl.grafiszti.swingpodstawy.answers.zad43;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Zad43Frame extends JFrame implements KeyListener {

	private int counter = 0;
	private String userInput = "";
	private final String secret = "secret";

	public Zad43Frame() {
		super("Zad 4.3");
		setPreferredSize(new Dimension(300, 100));
		this.setLocation(300, 400);
		addKeyListener(this);
		pack();
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		char c = evt.getKeyChar();
		if (counter < secret.length())
			checkSecret(c);
	}

	@Override
	public void keyReleased(KeyEvent evt) {
	}

	@Override
	public void keyTyped(KeyEvent evt) {
	}

	private void checkSecret(char c) {
		if (c == secret.charAt(counter)) {
			counter++;
			userInput = userInput + c;
		} else {
			counter = 0;
			userInput = "";
		}
		if (userInput.equals(secret))
			setTitle("Sekretne hasło");
	}
}
