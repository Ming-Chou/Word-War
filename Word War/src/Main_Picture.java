import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Main_Picture
{
	private static JTextField TF;
	public static String dir="";
	public static void main(String[] args)
	{		
		Equipment2.Name();
		Equipment2.Price();
		Equipment2.Power();
		Equipment2.Agility();
		Equipment2.Lucky();
		Equipment2.Life();
		
		final JFrame MP=new JFrame("Word War");
		MP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MP.setSize(800,600);
		MP.setVisible(true);
		MP.setLocationRelativeTo(null);
		MP.setResizable(false);
		MP.getContentPane().setBackground(Color.BLACK);
		MP.getContentPane().setLayout(null);
		
		JButton BNew = new JButton("New");
		BNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MP.setVisible(false);
				New_Player.main();
				MP.setResizable(false);
			}
		});
		BNew.setFont(new Font("華康娃娃體", Font.BOLD, 20));
		BNew.setBounds(10, 529, 87, 23);
		BNew.setBackground(Color.black);
		BNew.setForeground(Color.white);
		BNew.setBorder(new LineBorder(Color.black, 0));		
		MP.getContentPane().add(BNew);
		
		
		
		JButton BLoad = new JButton("Load");
		BLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Load.main();
					MainWindows.main("歡迎回來 Word War!\r\n");
					MP.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					final JFrame er=new JFrame("記錄檔不存在");
					er.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					er.setLocationRelativeTo(null); 
					er.setSize(250,100);
					er.setVisible(true);
					er.setResizable(false);
					JButton BEnd2 = new JButton("確定");
					BEnd2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							er.dispose();
						}
					});
					er.getContentPane().add(BEnd2);
				}				
			}
		});		
		BLoad.setBounds(107, 529, 87, 23);
		BLoad.setBackground(Color.black);
		BLoad.setForeground(Color.white);
		BLoad.setFont(new Font("華康娃娃體", Font.BOLD, 20));
		BLoad.setBorder(new LineBorder(Color.black, 0));
		MP.getContentPane().add(BLoad);
		
		
		JButton BAbout = new JButton("About");
		BAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				MP.setVisible(false);
				final JFrame About=new JFrame("About");
				About.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				About.setSize(800,750);
				About.setVisible(true);
				About.setLocationRelativeTo(null);
				About.setResizable(false);
				About.getContentPane().setBackground(Color.BLACK);
				About.getContentPane().setLayout(null);
				
				JLabel JB = new JLabel("");
				JB.setHorizontalAlignment(SwingConstants.CENTER);
				JB.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;遊戲說明"
						+ "<br>1.遊戲介面<br>&nbsp;&nbsp;&nbsp;&nbsp;個人資訊區顯示有關玩家的所有資訊<br>&nbsp;&nbsp;&nbsp;&nbsp;裝備欄顯示持有裝備及商店進入點<br>&nbsp;&nbsp;&nbsp;&nbsp;地圖區顯示所有可進入戰鬥的點<br>&nbsp;&nbsp;&nbsp;&nbsp;系統資訊顯示有關玩家的操作動作<br>" +
						"	2.地圖<br>&nbsp;&nbsp;&nbsp;&nbsp;地圖會依照等級開放，等級越高，開放地圖越多，唯獨『絕望之地』不設限，但是請備足實力再進入<br>3.商店<br>&nbsp;&nbsp;&nbsp;&nbsp;點選『商店』按鈕可以進入選購裝備，每個玩家最多持有五件裝備，如果需要" +
						"	更新裝備需先丟棄不要的裝備後再購買，購買時輸入需要的裝備編號即可購買<br>4.戰鬥地點<br>&nbsp;&nbsp;&nbsp;&nbsp;選定戰鬥地點後將從地圖中隨機抽出戰鬥怪獸，依照能力值產生過程與結果，獲勝會得到經驗值及金錢，死亡也會相對倒扣" +
						"	，請謹慎選戰鬥地圖<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;祝挑戰順利，遊玩開心!!</html>");
				JB.setBounds(60, 5, 700, 700);
				JB.setForeground(Color.white);
				JB.setFont(new Font("華康娃娃體", Font.BOLD, 26));
				About.getContentPane().add(JB);	
				
				JButton BBack = new JButton("Back");
				BBack.setBounds(687, 670, 87, 23);
				BBack.setBackground(Color.black);
				BBack.setForeground(Color.white);
				BBack.setFont(new Font("華康娃娃體", Font.BOLD, 20));
				BBack.setBorder(new LineBorder(Color.black, 0));
				About.getContentPane().add(BBack);	
				BBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						About.dispose();
						MP.setVisible(true);
					}
				});
			}
		});
		BAbout.setBounds(204, 529, 87, 23);
		BAbout.setBackground(Color.black);
		BAbout.setForeground(Color.white);
		BAbout.setFont(new Font("華康娃娃體", Font.BOLD, 20));
		BAbout.setBorder(new LineBorder(Color.black, 0));
		MP.getContentPane().add(BAbout);
		
		
		JButton BTeam = new JButton("Team");
		BTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MP.setVisible(false);
				final JFrame Team=new JFrame("Team");
				Team.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Team.setSize(800,600);
				Team.setVisible(true);
				Team.setLocationRelativeTo(null);
				Team.setResizable(false);
				Team.getContentPane().setBackground(Color.BLACK);
				Team.getContentPane().setLayout(null);
				
				JLabel JB1 = new JLabel("");
				JB1.setHorizontalAlignment(SwingConstants.CENTER);
				JB1.setText("製作團隊");
				JB1.setBounds(10, 10, 764, 200);
				JB1.setForeground(Color.white);
				JB1.setFont(new Font("華康娃娃體", Font.BOLD, 35));
				Team.getContentPane().add(JB1);
				
				JLabel JB = new JLabel("");
				JB.setHorizontalAlignment(SwingConstants.CENTER);
				JB.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
							   + "台東大學&nbsp;&nbsp;&nbsp;&nbsp;資工系<br><br>"
							   + "10111217 周鴻明&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10104126 王俊凱<br><br>"
							   + "10111105 盧韋良&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10111111 王永羽<br><br>"
							   + "10111126 洪禮超&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10111131 陳柏廷</html>");
				JB.setBounds(10, 10, 764, 509);
				JB.setForeground(Color.white);
				JB.setFont(new Font("華康娃娃體", Font.BOLD | Font.ITALIC, 25));
				Team.getContentPane().add(JB);	
				
				JButton BBack = new JButton("Back");
				BBack.setBounds(687, 531, 87, 23);
				BBack.setBackground(Color.black);
				BBack.setForeground(Color.white);
				BBack.setFont(new Font("華康娃娃體", Font.BOLD, 20));
				BBack.setBorder(new LineBorder(Color.black, 0));
				Team.getContentPane().add(BBack);	
				BBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Team.dispose();
						MP.setVisible(true);
					}
				});
			}
		});
		BTeam.setBounds(301, 529, 87, 23);
		BTeam.setBackground(Color.black);
		BTeam.setForeground(Color.white);
		BTeam.setFont(new Font("華康娃娃體", Font.BOLD, 20));
		BTeam.setBorder(new LineBorder(Color.black, 0));
		MP.getContentPane().add(BTeam);
		
		
		JButton BEnd = new JButton("End");
		BEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MP.dispose();
			}
		});
		BEnd.setBounds(398, 529, 87, 23);
		BEnd.setBackground(Color.black);
		BEnd.setForeground(Color.white);
		BEnd.setFont(new Font("華康娃娃體", Font.BOLD, 20));
		BEnd.setBorder(new LineBorder(Color.black, 0));
		MP.getContentPane().add(BEnd);
		
		
		JLabel JB = new JLabel("Word War");
		JB.setHorizontalAlignment(SwingConstants.CENTER);
		JB.setBounds(10, 10, 764, 509);
		JB.setForeground(Color.white);
		JB.setFont(new Font("華康娃娃體", Font.BOLD | Font.ITALIC, 99));
		MP.getContentPane().add(JB);
		
		//ImageIcon ic= new ImageIcon("War.gif");
		//MP.setIconImage(ic.getImage());
	}	
	
	public static String JFC()
	{
		String dir = "";
		File file=null;
		JFileChooser chooser = new JFileChooser();
		int confirm = chooser.showOpenDialog(null);
        if (confirm == chooser.APPROVE_OPTION)
        {
        	file=chooser.getSelectedFile();
        }
        dir=chooser.getSelectedFile()+"";
        String[] DIR=dir.split("");
		dir="";
		for(int i=0;i<DIR.length;i++)
		{
			if(DIR[i]=="\\")
				dir+="/";
			else
				dir+=DIR[i];
		}		        
        return dir;
	}
	
	
}