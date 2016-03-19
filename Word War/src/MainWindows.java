import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.*;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.border.BevelBorder;


public class MainWindows extends JFrame {

	private JPanel contentPane;

	static boolean in = false;
	/**
	 * Launch the application.
	 */
	public static void main(final String a) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final MainWindows frame = new MainWindows(a+"\r\n");
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindows(String a) {
		String[] s = {"",""};
		
		//ImageIcon ic= new ImageIcon("War.gif");
		//setIconImage(ic.getImage());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		setTitle("Word War");
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblWordWar = new JLabel("Word War");
		lblWordWar.setHorizontalAlignment(SwingConstants.CENTER);
		lblWordWar.setFont(new Font("�رd������", Font.PLAIN, 34));
		lblWordWar.setForeground(Color.white);
		lblWordWar.setBounds(371, 0, 155, 43);
		layeredPane.add(lblWordWar);
		
/*------------------------------------------------------------------------------------------------*/
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.setLayer(panel, 0);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 42, 429, 158);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel label = new JLabel("���a��T");
		label.setBounds(10, 10, 60, 15);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);
		
		JLabel label1_1 = new JLabel("����W�١G");
		label1_1.setBounds(30, 35, 65, 15);
		panel.add(label1_1);
		
		JLabel label1_1A = new JLabel(Charc.name);
		label1_1A.setBounds(100, 35, 300, 15);
		panel.add(label1_1A);
		
		JLabel label1_2_1 = new JLabel("����¾�~�G");
		label1_2_1.setBounds(30, 55, 65, 15);
		panel.add(label1_2_1);
		
		JLabel label1_2_1A = new JLabel(Charc.carceer);
		label1_2_1A.setBounds(100, 55, 65, 15);
		panel.add(label1_2_1A);
		
		JLabel label1_2_2 = new JLabel("���šG");
		label1_2_2.setBounds(30, 75, 65, 15);
		panel.add(label1_2_2);
		
		JLabel label1_2_2A = new JLabel(""+Charc.level);
		label1_2_2A.setBounds(70, 75, 65, 15);
		panel.add(label1_2_2A);
		
		JLabel label1_2_3 = new JLabel("�g��ȡG");
		label1_2_3.setBounds(190, 75, 65, 15);
		panel.add(label1_2_3);
		
		JLabel label1_2_3A = new JLabel(""+Charc.exp+" / "+Level_up.exp[Charc.level+1]);
		label1_2_3A.setBounds(240, 75, 179, 15);
		panel.add(label1_2_3A);
		
		JLabel label1_2_4 = new JLabel("�����G");
		label1_2_4.setBounds(30, 95, 65, 15);
		panel.add(label1_2_4);
		
		JLabel label1_2_4A = new JLabel(""+Charc.money);
		label1_2_4A.setBounds(70, 95, 65, 15);
		panel.add(label1_2_4A);
		
		JLabel label1_3_1 = new JLabel("�O�q�G");
		label1_3_1.setBounds(30, 115, 60, 15);
		panel.add(label1_3_1);
		
		JLabel label1_3_1A = new JLabel(""+Charc.strength);
		label1_3_1A.setBounds(70, 115, 60, 15);
		panel.add(label1_3_1A);
		
		JLabel label1_3_2 = new JLabel("���B�G");
		label1_3_2.setBounds(190, 115, 60, 15);
		panel.add(label1_3_2);
		
		JLabel label1_3_2A = new JLabel(""+Charc.lucky);
		label1_3_2A.setBounds(230, 115, 60, 15);
		panel.add(label1_3_2A);
		
		JLabel label1_4_1 = new JLabel("�ӱ��G");
		label1_4_1.setBounds(30, 135, 60, 15);
		panel.add(label1_4_1);
		
		JLabel label1_4_1A = new JLabel(""+Charc.alacrity);
		label1_4_1A.setBounds(70, 135, 60, 15);
		panel.add(label1_4_1A);
		
		JLabel label1_4_2 = new JLabel("�ͩR�G");
		label1_4_2.setBounds(190, 135, 60, 15);
		panel.add(label1_4_2);
		
		JLabel label1_4_2A = new JLabel(""+Charc.life);
		label1_4_2A.setBounds(230, 135, 60, 15);
		panel.add(label1_4_2A);
		
/*------------------------------------------------------------------------------------------------*/

		JLabel label_2 = new JLabel("�t�θ�T");
		label_2.setForeground(Color.white);
		label_2.setBounds(10, 410, 60, 15);
		layeredPane.add(label_2);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane g = new JScrollPane(textArea);
		g.setBounds(10, 435, 854, 190);
		layeredPane.add(g);
		
		JButton button_1 = new JButton("�����C��");
		button_1.setBounds(777, 635, 87, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("�s��");
		button_2.setBounds(680, 635, 87, 23);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textArea.append("�����x�s��...\r\n");
					All_data.mess.add("�����x�s��...\r\n");
					Save.main();
					new Thread(new Runnable(){
						@Override
						public void run() {
							try {
								Thread.sleep(2000); 
							} catch (InterruptedException e) {
							}
							textArea.append("�����x�s�����I\r\n");
						}
					}).start();
					All_data.mess.add("�����x�s�����I\r\n");
					Save.main();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					textArea.append("�����x�s���ѡI\r\n");
					textArea.append("�Э��s�s�ɡI\r\n");
					All_data.mess.add("�����x�s���ѡI\r\n");
					All_data.mess.add("�Э��s�s�ɡI\r\n");
					final JFrame er=new JFrame("�x�s����");
					er.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					er.setLocationRelativeTo(null); 
					er.setSize(250,100);
					er.setVisible(true);
					er.setResizable(false);
					JButton BEnd2 = new JButton("�Э��s�s��\r\n�T�w");
					BEnd2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							er.dispose();
						}
					});
					er.getContentPane().add(BEnd2);
				}
			}
		});
		layeredPane.add(button_2);
		
/*------------------------------------------------------------------------------------------------*/
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 226, 429, 158);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel label2 = new JLabel("�˳���");
		label2.setBounds(10, 10, 60, 15);
		panel_1.add(label2);
		
		JLabel label2_1 = new JLabel("�Ĥ@�˳���G");
		label2_1.setBounds(30, 35, 80, 15);
		panel_1.add(label2_1);
		
		JLabel label2_1A = new JLabel(Equipment2.Name.get(Charc.bag[0]));
		label2_1A.setBounds(110, 35, 175, 15);
		panel_1.add(label2_1A);
		
		JLabel label2_2 = new JLabel("�ĤG�˳���G");
		label2_2.setBounds(30, 55, 80, 15);
		panel_1.add(label2_2);
		
		JLabel label2_2A = new JLabel(Equipment2.Name.get(Charc.bag[1]));
		label2_2A.setBounds(110, 55, 175, 15);
		panel_1.add(label2_2A);
		
		JLabel label2_3 = new JLabel("�ĤT�˳���G");
		label2_3.setBounds(30, 75, 80, 15);
		panel_1.add(label2_3);
		
		JLabel label2_3A = new JLabel(Equipment2.Name.get(Charc.bag[2]));
		label2_3A.setBounds(110, 75, 175, 15);
		panel_1.add(label2_3A);
		
		JLabel label2_4 = new JLabel("�ĥ|�˳���G");
		label2_4.setBounds(30, 95, 80, 15);
		panel_1.add(label2_4);
		
		JLabel label2_4A = new JLabel(Equipment2.Name.get(Charc.bag[3]));
		label2_4A.setBounds(110, 95, 175, 15);
		panel_1.add(label2_4A);
		
		JLabel label2_5 = new JLabel("�Ĥ��˳���G");
		label2_5.setBounds(30, 115, 80, 15);
		panel_1.add(label2_5);
		
		JLabel label2_5A = new JLabel(Equipment2.Name.get(Charc.bag[4]));
		label2_5A.setBounds(110, 115, 175, 15);
		panel_1.add(label2_5A);
		
		JButton button2_1 = new JButton("�ө�");
		button2_1.setBounds(332, 125, 87, 23);
		button2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sshop.main();
				dispose();
			}
		});
		panel_1.add(button2_1);
		
		JButton button2_1A = new JButton("\u4E1F\u68C4");
		button2_1A.setBounds(255, 35, 60, 20);
		button2_1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Charc.bag[0]!=0)
				{
					textArea.append("�A���F "+Equipment2.Name.get(Charc.bag[0])+"\r\n");
					All_data.mess.add("�A���F "+Equipment2.Name.get(Charc.bag[0])+"\r\n");
					Charc.strength = Charc.strength-Equipment2.Power.get(Charc.bag[0]);
					Charc.alacrity = Charc.alacrity-Equipment2.Agility.get(Charc.bag[0]);
					Charc.lucky = Charc.lucky-Equipment2.Lucky.get(Charc.bag[0]);
					Charc.life = Charc.life-Equipment2.Life.get(Charc.bag[0]);
					if(Charc.carceer.compareTo("�C�h")==0)
					{
						�C�h charctor = new �C�h(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�}�b��")==0)
					{
						�}�b�� charctor = new �}�b��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�s��")==0)
					{
						�s�� charctor = new �s��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					Charc.bag[0]=0;
					dispose();
					main("");
				}
				else
				{
					textArea.append("�˳���S�F��O�n��ƻ��!\r\n");
					All_data.mess.add("�˳���S�F��O�n��ƻ��!\r\n");
				}
			}
		});
		panel_1.add(button2_1A);
		
		JButton button2_2A = new JButton("\u4E1F\u68C4");
		button2_2A.setBounds(255, 55, 60, 20);
		button2_2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Charc.bag[1]!=0)
				{
					textArea.append("�A���F "+Equipment2.Name.get(Charc.bag[1])+"\r\n");
					All_data.mess.add("�A���F "+Equipment2.Name.get(Charc.bag[1])+"\r\n");
					Charc.strength = Charc.strength-Equipment2.Power.get(Charc.bag[1]);
					Charc.alacrity = Charc.alacrity-Equipment2.Agility.get(Charc.bag[1]);
					Charc.lucky = Charc.lucky-Equipment2.Lucky.get(Charc.bag[1]);
					Charc.life = Charc.life-Equipment2.Life.get(Charc.bag[1]);
					if(Charc.carceer.compareTo("�C�h")==0)
					{
						�C�h charctor = new �C�h(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�}�b��")==0)
					{
						�}�b�� charctor = new �}�b��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�s��")==0)
					{
						�s�� charctor = new �s��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					Charc.bag[1]=0;
					dispose();
					main("");
				}
				else
				{
					textArea.append("�˳���S�F��O�n��ƻ��!\r\n");
					All_data.mess.add("�˳���S�F��O�n��ƻ��!\r\n");
				}
			}
		});
		panel_1.add(button2_2A);
		
		JButton button2_3A = new JButton("\u4E1F\u68C4");
		button2_3A.setBounds(255, 75, 60, 20);
		button2_3A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Charc.bag[2]!=0)
				{
					textArea.append("�A���F "+Equipment2.Name.get(Charc.bag[2])+"\r\n");
					All_data.mess.add("�A���F "+Equipment2.Name.get(Charc.bag[2])+"\r\n");
					Charc.strength = Charc.strength-Equipment2.Power.get(Charc.bag[2]);
					Charc.alacrity = Charc.alacrity-Equipment2.Agility.get(Charc.bag[2]);
					Charc.lucky = Charc.lucky-Equipment2.Lucky.get(Charc.bag[2]);
					Charc.life = Charc.life-Equipment2.Life.get(Charc.bag[2]);
					if(Charc.carceer.compareTo("�C�h")==0)
					{
						�C�h charctor = new �C�h(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�}�b��")==0)
					{
						�}�b�� charctor = new �}�b��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�s��")==0)
					{
						�s�� charctor = new �s��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					Charc.bag[2]=0;
					dispose();
					main("");
				}
				else
				{
					textArea.append("�˳���S�F��O�n��ƻ��!\r\n");
					All_data.mess.add("�˳���S�F��O�n��ƻ��!\r\n");
				}
			}
		});
		panel_1.add(button2_3A);
		
		JButton button2_4A = new JButton("\u4E1F\u68C4");
		button2_4A.setBounds(255, 95, 60, 20);
		button2_4A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Charc.bag[3]!=0)
				{
					textArea.append("�A���F "+Equipment2.Name.get(Charc.bag[3])+"\r\n");
					All_data.mess.add("�A���F "+Equipment2.Name.get(Charc.bag[3])+"\r\n");
					Charc.strength = Charc.strength-Equipment2.Power.get(Charc.bag[3]);
					Charc.alacrity = Charc.alacrity-Equipment2.Agility.get(Charc.bag[3]);
					Charc.lucky = Charc.lucky-Equipment2.Lucky.get(Charc.bag[3]);
					Charc.life = Charc.life-Equipment2.Life.get(Charc.bag[3]);
					if(Charc.carceer.compareTo("�C�h")==0)
					{
						�C�h charctor = new �C�h(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�}�b��")==0)
					{
						�}�b�� charctor = new �}�b��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�s��")==0)
					{
						�s�� charctor = new �s��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					Charc.bag[3]=0;
					dispose();
					main("");
				}
				else
				{
					textArea.append("�˳���S�F��O�n��ƻ��!\r\n");
					All_data.mess.add("�˳���S�F��O�n��ƻ��!\r\n");
				}
			}
		});
		panel_1.add(button2_4A);
		
		JButton button2_5A = new JButton("\u4E1F\u68C4");
		button2_5A.setBounds(255, 115, 60, 20);
		button2_5A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Charc.bag[4]!=0)
				{
					textArea.append("�A���F "+Equipment2.Name.get(Charc.bag[4])+"\r\n");
					All_data.mess.add("�A���F "+Equipment2.Name.get(Charc.bag[4])+"\r\n");
					Charc.strength = Charc.strength-Equipment2.Power.get(Charc.bag[4]);
					Charc.alacrity = Charc.alacrity-Equipment2.Agility.get(Charc.bag[4]);
					Charc.lucky = Charc.lucky-Equipment2.Lucky.get(Charc.bag[4]);
					Charc.life = Charc.life-Equipment2.Life.get(Charc.bag[4]);
					if(Charc.carceer.compareTo("�C�h")==0)
					{
						�C�h charctor = new �C�h(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�}�b��")==0)
					{
						�}�b�� charctor = new �}�b��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					else if(Charc.carceer.compareTo("�s��")==0)
					{
						�s�� charctor = new �s��(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
					}
					Charc.bag[4]=0;
					dispose();
					main("");
				}
				else
				{
					textArea.append("�˳���S�F��O�n��ƻ��!\r\n");
					All_data.mess.add("�˳���S�F��O�n��ƻ��!\r\n");
				}
			}
		});
		panel_1.add(button2_5A);
		
/*------------------------------------------------------------------------------------------------*/
				
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(463, 42, 401, 342);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label3_1 = new JLabel("�a��");
		label3_1.setBounds(10, 10, 46, 15);
		panel_2.add(label3_1);
		
		JButton button3_1 = new JButton("�_���˪L");
		button3_1.setBounds(146, 35, 110, 23);
		button3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.jungle1.getMonster().get((int)(1000*Math.random())%Initialize.jungle1.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<3)
		{
			button3_1.setEnabled(false);
		}
		panel_2.add(button3_1);
		panel_2.add(button3_1);
		
		JButton button3_2 = new JButton("�賡�˪L");
		button3_2.setBounds(10, 65, 110, 23);
		button3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.jungle2.getMonster().get((int)(1000*Math.random())%Initialize.jungle2.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<3)
		{
			button3_2.setEnabled(false);
		}
		panel_2.add(button3_2);
		panel_2.add(button3_2);
		
		JButton button3_3 = new JButton("�n���˪L");
		button3_3.setBounds(146, 65, 110, 23);
		button3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.jungle4.getMonster().get((int)(1000*Math.random())%Initialize.jungle4.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<3)
		{
			button3_3.setEnabled(false);
		}
		panel_2.add(button3_3);
		panel_2.add(button3_3);
		
		JButton button3_4 = new JButton("�F���˪L");
		button3_4.setBounds(281, 65, 110, 23);
		button3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.jungle3.getMonster().get((int)(1000*Math.random())%Initialize.jungle3.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<3)
		{
			button3_4.setEnabled(false);
		}
		panel_2.add(button3_4);
		panel_2.add(button3_4);
		
		JButton button3_5 = new JButton("�������q���Ы�");
		button3_5.setBounds(10, 120, 125, 23);
		button3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.classroom1.getMonster().get((int)(1000*Math.random())%Initialize.classroom1.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<10)
		{
			button3_5.setEnabled(false);
		}
		panel_2.add(button3_5);
		
		JButton button3_6 = new JButton("��u�t��");
		button3_6.setBounds(146, 120, 110, 23);
		button3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.classroom3.getMonster().get((int)(1000*Math.random())%Initialize.classroom3.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<15)
		{
			button3_6.setEnabled(false);
		}
		panel_2.add(button3_6);
		
		JButton button3_7 = new JButton("�]�Ƶw������");
		button3_7.setBounds(266, 120, 125, 23);
		button3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.classroom2.getMonster().get((int)(1000*Math.random())%Initialize.classroom2.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<10)
		{
			button3_7.setEnabled(false);
		}
		panel_2.add(button3_7);
		
		JButton button3_8 = new JButton("�Q��Ѫ��q��������");
		button3_8.setBounds(125, 150, 151, 23);
		button3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.classroom4.getMonster().get((int)(1000*Math.random())%Initialize.classroom4.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<10)
		{
			button3_8.setEnabled(false);
		}
		panel_2.add(button3_8);
		
		JButton button3_9 = new JButton("�کg�����_�ۥ@��");
		button3_9.setBounds(10, 205, 140, 23);
		button3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.studio1.getMonster().get((int)(1000*Math.random())%Initialize.studio1.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<25)
		{
			button3_9.setEnabled(false);
		}
		panel_2.add(button3_9);
		
		JButton button3_10 = new JButton("�����ܺA�ж�");
		button3_10.setBounds(251, 205, 140, 23);
		button3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.studio2.getMonster().get((int)(1000*Math.random())%Initialize.studio2.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<25)
		{
			button3_10.setEnabled(false);
		}
		panel_2.add(button3_10);
		
		JButton button3_11 = new JButton("�a������");
		button3_11.setBounds(146, 235, 110, 23);
		button3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.classroom5.getMonster().get((int)(1000*Math.random())%Initialize.classroom5.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<40)
		{
			button3_11.setEnabled(false);
		}
		panel_2.add(button3_11);
		
		JButton button3_12 = new JButton("�@�ɪ����Y");
		button3_12.setBounds(144, 290, 112, 23);
		button3_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.studio3.getMonster().get((int)(1000*Math.random())%Initialize.studio3.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		if(Charc.level<60)
		{
			button3_12.setEnabled(false);
		}
		panel_2.add(button3_12);
		
		JButton button3_13 = new JButton("���椧�a");
		button3_13.setBounds(281, 290, 87, 23);
		button3_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sure.main(null);
				dispose();
			}
		});
		panel_2.add(button3_13);
		
		JButton button3_14 = new JButton("�s���");
		button3_14.setBounds(33, 35, 87, 23);
		button3_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monster mo = Initialize.newuser.getMonster().get((int)(1000*Math.random())%Initialize.newuser.getMonster().size());
				ArrayList<String> re = Initialize.battle_string(mo);
				dispose();
				Show_War.do_show_war(re,mo);
			}
		});
		panel_2.add(button3_14);
		
		JButton button = new JButton("\u8AAA\u660E");
		button.setBounds(583, 635, 87, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				final JFrame About=new JFrame("About");
				About.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				About.setUndecorated(true);
				About.setSize(800,750);
				About.setVisible(true);
				About.setLocationRelativeTo(null);
				About.setResizable(false);
				About.getContentPane().setBackground(Color.BLACK);
				About.getContentPane().setLayout(null);
				
				JLabel JB = new JLabel("");
				JB.setHorizontalAlignment(SwingConstants.CENTER);
				JB.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�C������"
						+ "<br>1.�C������<br>&nbsp;&nbsp;&nbsp;&nbsp;�ӤH��T����ܦ������a���Ҧ���T<br>&nbsp;&nbsp;&nbsp;&nbsp;�˳�����ܫ����˳Ƥΰө��i�J�I<br>&nbsp;&nbsp;&nbsp;&nbsp;�a�ϰ���ܩҦ��i�i�J�԰����I<br>&nbsp;&nbsp;&nbsp;&nbsp;�t�θ�T��ܦ������a���ާ@�ʧ@<br>" +
						"	2.�a��<br>&nbsp;&nbsp;&nbsp;&nbsp;�a�Ϸ|�̷ӵ��Ŷ}��A���ŶV���A�}��a�϶V�h�A�߿W�y���椧�a�z���]���A���O�гƨ���O�A�i�J<br>3.�ө�<br>&nbsp;&nbsp;&nbsp;&nbsp;�I��y�ө��z���s�i�H�i�J���ʸ˳ơA�C�Ӫ��a�̦h��������˳ơA�p�G�ݭn" +
						"	��s�˳ƻݥ���󤣭n���˳ƫ�A�ʶR�A�ʶR�ɿ�J�ݭn���˳ƽs���Y�i�ʶR<br>4.�԰��a�I<br>&nbsp;&nbsp;&nbsp;&nbsp;��w�԰��a�I��N�q�a�Ϥ��H����X�԰����~�A�̷ӯ�O�Ȳ��͹L�{�P���G�A��ӷ|�o��g��ȤΪ����A���`�]�|�۹�˦�" +
						"	�A���ԷV��԰��a��<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;���D�Զ��Q�A�C���}��!!</html>");
				JB.setBounds(60, 5, 700, 700);
				JB.setForeground(Color.white);
				JB.setFont(new Font("�رd������", Font.BOLD, 26));
				About.getContentPane().add(JB);	
				
				JButton BBack = new JButton("Back");
				BBack.setBounds(687, 670, 87, 23);
				BBack.setBackground(Color.black);
				BBack.setForeground(Color.white);
				BBack.setFont(new Font("�رd������", Font.BOLD, 20));
				BBack.setBorder(new LineBorder(Color.black, 0));
				About.getContentPane().add(BBack);	
				BBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						About.dispose();
					}
				});
			}
		});
		layeredPane.add(button);
		
		JButton button_3 = new JButton("\u84CB\u4E9E");
		button_3.setBounds(486, 635, 87, 23);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				final JFrame About=new JFrame("About");
				About.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				About.setUndecorated(true);
				About.setSize(400,400);
				About.setVisible(true);
				About.setLocationRelativeTo(null);
				About.setResizable(false);
				About.getContentPane().setBackground(Color.BLACK);
				About.getContentPane().setLayout(null);
				
				JLabel JB = new JLabel("");
				JB.setHorizontalAlignment(SwingConstants.CENTER);
				JB.setText("<html>�\�ȬO�@�Ӷǻ����s�b<br><br>"
							   + "��Գӻ\�ȴN�ҦV����<br><br>"
							   + "����ԱѤ]�|�ۭP����</html>");
				JB.setBounds(50, 30, 300, 300);
				JB.setForeground(Color.white);
				JB.setFont(new Font("�رd������", Font.BOLD, 26));
				About.getContentPane().add(JB);	
				
				JButton BBack = new JButton("Back");
				BBack.setBounds(300, 350, 87, 23);
				BBack.setBackground(Color.black);
				BBack.setForeground(Color.white);
				BBack.setFont(new Font("�رd������", Font.BOLD, 20));
				BBack.setBorder(new LineBorder(Color.black, 0));
				About.getContentPane().add(BBack);	
				BBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						About.dispose();
					}
				});
			}
		});
		layeredPane.add(button_3);
		
/*------------------------------------------------------------------------------------------------*/
		
		for(String str:All_data.mess)
		{
			textArea.append(str);
		}
		
		textArea.append("\r\n");
		textArea.append(a);
		All_data.mess.add(a);
	}
}
