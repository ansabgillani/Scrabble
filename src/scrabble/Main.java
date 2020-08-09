package scrabble;

import javax.swing.SwingUtilities;

import scrabble.gui.MainFrame;

/*

	@author Ansab Gillani


*/




public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame().go();
			}
		});
	}

}
