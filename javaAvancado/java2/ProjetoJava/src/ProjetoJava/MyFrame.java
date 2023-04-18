package ProjetoJava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		super("My Frame");
		
		JButton btn = new JButton("Clique");
		
		getContentPane().add(btn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[]args) {
		new MyFrame();
	}

}
