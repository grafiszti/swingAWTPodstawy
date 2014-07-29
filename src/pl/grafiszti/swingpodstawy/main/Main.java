package pl.grafiszti.swingpodstawy.main;

import java.awt.EventQueue;

import pl.grafiszti.swingpodstawy.zad41.MyFrame;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
	}
}
