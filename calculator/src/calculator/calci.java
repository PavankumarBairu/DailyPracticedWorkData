package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 436, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnC.setBounds(10, 175, 100, 100);
		frame.getContentPane().add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(10, 275, 100, 100);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 375, 100, 100);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 475, 100, 100);
		frame.getContentPane().add(btn1);
		
		JButton btnModulus = new JButton("%");
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnModulus.setBounds(110, 175, 100, 100);
		frame.getContentPane().add(btnModulus);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn8.setBounds(110, 275, 100, 100);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(110, 375, 100, 100);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(110, 475, 100, 100);
		frame.getContentPane().add(btn2);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackSpace.setBounds(210, 175, 100, 100);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.setBounds(210, 275, 100, 100);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(210, 375, 100, 100);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(210, 475, 100, 100);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDiv.setBounds(310, 175, 100, 100);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("x");
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMul.setBounds(310, 275, 100, 100);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSub.setBounds(310, 375, 100, 100);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAdd.setBounds(310, 475, 100, 100);
		frame.getContentPane().add(btnAdd);
		
		JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn00.setBounds(10, 575, 100, 100);
		frame.getContentPane().add(btn00);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(110, 575, 100, 100);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDot.setBounds(210, 575, 100, 100);
		frame.getContentPane().add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEquals.setBounds(310, 575, 100, 100);
		frame.getContentPane().add(btnEquals);
		
		JTextArea btnClear = new JTextArea();
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(20, 10, 380, 160);
		frame.getContentPane().add(btnClear);
	}
}
