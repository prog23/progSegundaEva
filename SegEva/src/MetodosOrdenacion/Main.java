package MetodosOrdenacion;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	
	public Main() {
		setTitle("M�todos de ordenaci�n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new Lienzo());
		pack();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				new Runnable() {
					@Override
					public void run() {
						new Main().setVisible(true);
					}
				}
		);
	}
	
}