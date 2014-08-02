package pl.grafiszti.swingpodstawy.zad41;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import pl.grafiszti.swingpodstawy.templates.AbstractPanel;

public class Zad41Panel extends AbstractPanel {
	private static final long serialVersionUID = 5707061818014557530L;

	private BufferedImage imageFromFile, imageFromURL;
	private int scale = 2;

	public Zad41Panel() {
		super();

		String imagePath = "../podstawySwingAWT/assets/images/cojapacze.jpg";
		String imageURL = "https://lh4.googleusercontent.com/-BkiBzEj5L0c/AAAAAAAAAAI/AAAAAAAAAH0/7X1U2-Ae-gU/photo.jpg";

		init(imagePath, imageURL);
	}

	public Zad41Panel(String imagePath, String imageURL) {
		super();
		init(imagePath, imageURL);
	}

	private void init(String imagePath, String imageURL) {
		try {
			imageFromFile = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			System.out.println("Blad wczytywania obrazu z podanej sciezki");
			e.printStackTrace();
		}

		try {
			imageFromURL = ImageIO.read(new URL(imageURL));
		} catch (IOException e) {
			System.out.println("Blad wczytywania obrazu z podanego URL");
		}

		this.panelDimension = new Dimension(imageFromFile.getWidth() / scale
				+ imageFromURL.getWidth() / scale, imageFromFile.getHeight()
				/ scale + imageFromURL.getHeight() / scale);

		this.setPreferredSize(panelDimension);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		draw(g2d);
	}

	private void draw(Graphics2D g2d) {
		g2d.drawImage(imageFromFile, 0, 0, imageFromFile.getWidth() / scale,
				imageFromFile.getHeight() / scale, this);
		g2d.drawImage(imageFromURL, imageFromFile.getWidth() / scale, 0,
				imageFromURL.getWidth() / scale, imageFromURL.getHeight()
						/ scale, this);
	}
}
