package pl.grafiszti.swingpodstawy.answers.zad44;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Zad44Panel extends JPanel implements MouseListener,
		MouseMotionListener {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	private int x, y;

	private ArrayList<Point> points = new ArrayList<Point>();
	private Point movingPoint;

	public Zad44Panel() {
		addMouseListener(this);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		if (SwingUtilities.isLeftMouseButton(e)) {
			for (Point point : points) {
				if (x >= point.x - 5 && x <= point.x + 5 && y >= point.y - 5
						&& y <= point.y + 5) {
					movingPoint = point;
				}
			}
			if (movingPoint == null) {
				points.add(new Point(x, y));
			}
		}
		if (SwingUtilities.isRightMouseButton(e)) {
			List<Point> pointsToRemove = new ArrayList();
			for (Point point : points) {
				if (x >= point.x - 5 && x <= point.x + 5 && y >= point.y - 5
						&& y <= point.y + 5) {
					pointsToRemove.add(point);
				}
			}

			points.removeAll(pointsToRemove);
		}

		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (movingPoint != null) {
			movingPoint.x += e.getX();
			movingPoint.y += e.getY();
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.BLACK);
		drawRectangles(g2d);
	}

	private void drawRectangles(Graphics2D g2d) {
		int x, y;
		for (Point p : points) {
			x = (int) p.getX();
			y = (int) p.getY();
			g2d.fillRect(x - 5, y - 5, 10, 10);
		}
	}
}
