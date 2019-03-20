package br.org.lasalle.semana2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OlaMundoSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoSwing window = new OlaMundoSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OlaMundoSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblOlMundo = new JLabel("Ol\u00E1 Mundo!!!!");
		lblOlMundo.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblOlMundo.setBackground(Color.YELLOW);
		frame.getContentPane().add(lblOlMundo, BorderLayout.NORTH);
		
		JButton btnCliqueme = new JButton("Clique-me");
		btnCliqueme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblOlMundo.setText("Clicou!!!");
			}
		});
		frame.getContentPane().add(btnCliqueme, BorderLayout.WEST);
	}

}
