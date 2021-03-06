import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class New_Player {

	private JFrame frmNew;
	private JTextField textField;
	public static String name = "";

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final New_Player window = new New_Player();
					window.frmNew.setVisible(true);
					window.frmNew.setLocationRelativeTo(null);
					
					window.textField = new JTextField();
					window.textField.setBounds(113, 92, 311, 15);
					window.frmNew.getContentPane().add(window.textField);
					window.textField.setColumns(10);
					
					JButton btnCarceer = new JButton("劍士");
					btnCarceer.setBounds(10, 180, 87, 23);
					btnCarceer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							name = window.textField.getText();
							window.frmNew.setVisible(false);
							劍士 charctor = new 劍士(name);
							MainWindows.main("歡迎來到 Word War!好好享受一下吧!\r\n");
							window.frmNew.setResizable(false);
						}
					});
					window.frmNew.getContentPane().add(btnCarceer);
					
					JButton btnCarceer_1 = new JButton("弓箭手");
					btnCarceer_1.setBounds(176, 180, 87, 23);
					btnCarceer_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							name = window.textField.getText();
							window.frmNew.setVisible(false);
							弓箭手 charctor = new 弓箭手(name);
							MainWindows.main("歡迎來到 Word War!好好享受一下吧!\r\n");
							window.frmNew.setResizable(false);
						}
					});
					window.frmNew.getContentPane().add(btnCarceer_1);
					
					JButton btnCarceer_2 = new JButton("盜賊");
					btnCarceer_2.setBounds(337, 180, 87, 23);
					btnCarceer_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							name = window.textField.getText();
							window.frmNew.setVisible(false);
							盜賊 charctor = new 盜賊(name);
							MainWindows.main("歡迎來到 Word War!好好享受一下吧!\r\n");
							window.frmNew.setResizable(false);
						}
					});
					window.frmNew.getContentPane().add(btnCarceer_2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public New_Player() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNew = new JFrame();
		frmNew.getContentPane().setBackground(Color.BLACK);
		frmNew.setTitle("New");
		frmNew.setBounds(100, 100, 450, 300);
		frmNew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNew.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8ACB\u8F38\u5165\u89D2\u8272\u540D\u7A31\uFF1A");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 83, 150, 32);
		frmNew.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u8ACB\u9078\u64C7\u8077\u696D");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(10, 145, 73, 15);
		frmNew.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u89D2\u8272\u5275\u5EFA");
		label_2.setFont(new Font("標楷體", Font.PLAIN, 22));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(157, 10, 121, 32);
		frmNew.getContentPane().add(label_2);
	}
}
