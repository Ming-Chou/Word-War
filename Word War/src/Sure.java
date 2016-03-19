import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Sure {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sure window = new Sure();
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
	public Sure() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Sure.class.getResource("/org/eclipse/jface/dialogs/images/message_warning.gif")));
		frame.setTitle("\u78BA\u5B9A\u9032\u5165?!");
		frame.setBounds(100, 100, 370, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(50, 190, 87, 23);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.Mt_86;
				ArrayList<String> re = Initialize.battle_string(mo);
				frame.dispose();
				Show_War.do_show_war(re,mo);
				
			}
		});
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(227, 190, 87, 23);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainWindows.main("");
			}
		});
		frame.getContentPane().add(btnNo);
		
		JLabel label = new JLabel("\u4F60\u78BA\u5B9A\u9032\u5165\u6B64\u5730\u5716?!");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("微軟正黑體", Font.BOLD, 24));
		label.setBounds(50, 45, 245, 40);
		frame.getContentPane().add(label);
		
		JLabel lblrn = new JLabel("\u82E5\u4E0D\u5E78\u5728\u6B64\u6230\u9B25\u4E2D\u6B7B\u4EA1");
		lblrn.setForeground(Color.RED);
		lblrn.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblrn.setBounds(50, 102, 303, 40);
		frame.getContentPane().add(lblrn);
		
		JLabel label_1 = new JLabel("\u4E00\u5207\u5C07\u91CD\u65B0\u958B\u59CB\u3001\u6C38\u4E0D\u8D74\u53CD");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		label_1.setBounds(50, 128, 245, 35);
		frame.getContentPane().add(label_1);
	}
}
