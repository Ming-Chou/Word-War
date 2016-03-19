import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.IOException;

/**
 * 			戰鬥判斷delay輸出位子不知道要塞哪
 * 			希望由輸出端進行delay再將資料分批送出
 * */
public class Show_War extends JFrame {
	private static JPanel contentPane;
	private static String s="" ;
	static int u=0;
	
	public static void do_show_war(final ArrayList<String> re, final Monster mo) {
		EventQueue.invokeLater(new Runnable()
		{
			Scanner scn = new Scanner(System.in);
			public void run()
			{
					try
					{
						final Show_War frame = new Show_War(re,mo);
						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
						
						final JButton btnExit = new JButton("Exit");
						btnExit.setBounds(693, 555, 87, 23);
						btnExit.setEnabled(false);
						btnExit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								frame.dispose();
								MainWindows.main(re.get(re.size()-2));
							}
						});
						frame.getContentPane().add(btnExit);
						
						new Thread(new Runnable(){
							@Override
							public void run() {
								try {
									Thread.sleep(2000*re.size()); 
								} catch (InterruptedException e) {
								}
								btnExit.setEnabled(true);
							}
						}).start();
					} 
					catch (Exception e) 
					{	
						e.printStackTrace();
					}
			}
		});	
	}
	public Show_War(final ArrayList<String> re, final Monster mo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 825, 610);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextPane textPane_2 = new JTextPane();		//怪物資訊
		textPane_2.setEditable(false);
		textPane_2.setFont(new Font("標楷體", Font.PLAIN, 18));
		textPane_2.setText("名稱: "+mo.ShowName()+"\r\n"+"攻擊: "+mo.ShowAttack()+"\r\n"+"血量: "+mo.ShowLife());
		textPane_2.setBounds(510, 30, 270, 170);
		contentPane.add(textPane_2);
		
						
		JTextPane textPane_1 = new JTextPane();		// 人物資訊
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("標楷體", Font.PLAIN, 18));
		textPane_1.setText("名稱: "+Charc.name+"( "+Charc.carceer+" )"+"\r\n"+	
				"等級: "+Charc.level+"\r\n"+
				"力量: "+Charc.strength+"\r\n"+
				"敏捷: "+Charc.alacrity+"\r\n"+
				"幸運: "+Charc.lucky+"\r\n"+
				"生命: "+Charc.life+"\r\n");			
		textPane_1.setBounds(45, 30, 270, 170);		
		contentPane.add(textPane_1);
		
		if(re.get(re.size()-1).compareTo("你死亡了!!!")!=0)
		{
			Charc.money+=mo.ShowMoney();
			Charc.exp+=mo.ShowExp();
			while(Charc.exp>Level_up.exp[Charc.level+1])
				Level_up.Level(Charc.level,Charc.exp,re.size()+1);
		}
		else if(re.get(re.size()-1).compareTo("你死亡了!!!")==0)
		{
			if(mo.ShowName().compareTo("蓋亞")==0)
			{
				if(Charc.carceer.compareTo("劍士")==0)
				{
					劍士 charctor = new 劍士(Charc.name);
					try {
						All_data.mess.add(re.get(re.size()-2)+"\r\n"+"一切將重新開始\r\n");
						Save.main();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(Charc.carceer.compareTo("弓箭手")==0)
				{
					弓箭手 charctor = new 弓箭手(Charc.name);
					try {
						All_data.mess.add(re.get(re.size()-2)+"\r\n"+"一切將重新開始\r\n");
						Save.main();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				else if(Charc.carceer.compareTo("盜賊")==0)
				{
					盜賊 charctor = new 盜賊(Charc.name);
					try {
						All_data.mess.add(re.get(re.size()-2)+"\r\n"+"一切將重新開始\r\n");
						Save.main();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				for(int i=0;i<5;i++)
					Charc.bag[i] = 0;
			}
			else
			{
				if((Charc.money-(int)(Charc.money*0.01))>=0)
					Charc.money=Charc.money-(int)(Charc.money*0.01);
				if((Charc.exp-(int)(Charc.exp*0.01))>=0)
					Charc.exp=Charc.exp-(int)(Charc.exp*0.01);
				while(Charc.exp<Level_up.exp[Charc.level])
					Level_up.Level(Charc.level,Charc.exp,re.size()+1);
			}
		}
		
		JLabel lblVs = new JLabel("V.S.");
		lblVs.setFont(new Font("Miriam Fixed", Font.PLAIN, 73));
		lblVs.setForeground(Color.WHITE);
		lblVs.setBounds(332, 50, 200, 140);
		contentPane.add(lblVs);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		JScrollPane g = new JScrollPane(textArea);
		g.setBounds(45, 230, 735, 300);
		contentPane.add(g);
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(2000); 
				} catch (InterruptedException e) {
				}
				for(String temp : re) { 
					textArea.append(temp + "\n"); 
					try {
						Thread.sleep(2000); 
					} catch (InterruptedException e) {
					}
				}
			}
		}).start();
		
	}
	
	public static void main(String[] args)
	{
		
	}
}
