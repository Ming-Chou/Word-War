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
		BNew.setFont(new Font("�رd������", Font.BOLD, 20));
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
					MainWindows.main("�w��^�� Word War!\r\n");
					MP.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					final JFrame er=new JFrame("�O���ɤ��s�b");
					er.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					er.setLocationRelativeTo(null); 
					er.setSize(250,100);
					er.setVisible(true);
					er.setResizable(false);
					JButton BEnd2 = new JButton("�T�w");
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
		BLoad.setFont(new Font("�رd������", Font.BOLD, 20));
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
						MP.setVisible(true);
					}
				});
			}
		});
		BAbout.setBounds(204, 529, 87, 23);
		BAbout.setBackground(Color.black);
		BAbout.setForeground(Color.white);
		BAbout.setFont(new Font("�رd������", Font.BOLD, 20));
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
				JB1.setText("�s�@�ζ�");
				JB1.setBounds(10, 10, 764, 200);
				JB1.setForeground(Color.white);
				JB1.setFont(new Font("�رd������", Font.BOLD, 35));
				Team.getContentPane().add(JB1);
				
				JLabel JB = new JLabel("");
				JB.setHorizontalAlignment(SwingConstants.CENTER);
				JB.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
							   + "�x�F�j��&nbsp;&nbsp;&nbsp;&nbsp;��u�t<br><br>"
							   + "10111217 �P�E��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10104126 ���T��<br><br>"
							   + "10111105 �c���}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10111111 ���æ�<br><br>"
							   + "10111126 �x§�W&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10111131 ���f��</html>");
				JB.setBounds(10, 10, 764, 509);
				JB.setForeground(Color.white);
				JB.setFont(new Font("�رd������", Font.BOLD | Font.ITALIC, 25));
				Team.getContentPane().add(JB);	
				
				JButton BBack = new JButton("Back");
				BBack.setBounds(687, 531, 87, 23);
				BBack.setBackground(Color.black);
				BBack.setForeground(Color.white);
				BBack.setFont(new Font("�رd������", Font.BOLD, 20));
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
		BTeam.setFont(new Font("�رd������", Font.BOLD, 20));
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
		BEnd.setFont(new Font("�رd������", Font.BOLD, 20));
		BEnd.setBorder(new LineBorder(Color.black, 0));
		MP.getContentPane().add(BEnd);
		
		
		JLabel JB = new JLabel("Word War");
		JB.setHorizontalAlignment(SwingConstants.CENTER);
		JB.setBounds(10, 10, 764, 509);
		JB.setForeground(Color.white);
		JB.setFont(new Font("�رd������", Font.BOLD | Font.ITALIC, 99));
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