package ProjetoJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Events extends JFrame implements ActionListener{
	
	public Events() {
		super("My Events");
		
		JButton btn = new JButton("Clique");
		btn.addActionListener(this);
		
		getContentPane().add(btn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Events();

	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Você Clicou!!");
	}

}
