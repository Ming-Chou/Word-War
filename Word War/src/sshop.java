import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;

import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JTextPane;

import java.awt.ScrollPane;
import java.util.Scanner;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.util.*;


public class sshop extends JFrame {

	public static JPanel 背景;
	private JTable table;
	private JTable 武器列表;
	private JTextField 操作方式;
	private JTextField 擁有金錢;
	private static int s;
	private static String str = "購買成功";
	/**
	 * Launch the application.
	 */
	public static void main() {
		
		Scanner scn = new Scanner(System.in);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final sshop frame = new sshop();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
					JButton Exit = new JButton("離開商店");
					Exit.setBounds(398, 269, 87, 23);
					Exit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							frame.setVisible(false);
							MainWindows.main("你離開了商店...");
						}
					});
					frame.add(Exit);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public sshop() {
		final Scanner scn = new Scanner(System.in);
		setUndecorated(true);
		setBounds(100, 100, 630, 420);
		背景 = new JPanel();
		背景.setBackground(Color.BLACK);
		背景.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(背景);
		背景.setLayout(null);
		
		JScrollPane 滾動列表 = new JScrollPane();
		滾動列表.setBounds(10, 10, 339, 242);
		背景.add(滾動列表);
		武器列表 = new JTable();
		武器列表.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		武器列表.setModel(new DefaultTableModel(
				/*建立二維武器陣列，因商店部分是用arraylist，故更新的話兩邊都要同時更新*/
				/*武器列表改用二維矩陣即可 同步資料更新*/	
				
			new Object[][] {     					
					{new Integer(1), "\u6728\u528D", new Integer(100*10), new Integer(5), new Integer(0), new Integer(0), new Integer(0)},
					{new Integer(2), "\u6728\u5F13", new Integer(100*10), new Integer(2), new Integer(0), new Integer(4), new Integer(0)},
					{new Integer(3), "\u65B0\u624B\u77ED\u528D", new Integer(100*10), new Integer(0), new Integer(5), new Integer(2), new Integer(0)},
					{new Integer(4), "\u9577\u528D", new Integer(400*10), new Integer(10), new Integer(0), new Integer(0), new Integer(0)},
					{new Integer(5), "\u9435\u5F13", new Integer(400*10), new Integer(5), new Integer(0), new Integer(10), new Integer(0)},
					{new Integer(6), "\u4E09\u89D2\u5203", new Integer(400*10), new Integer(0), new Integer(10), new Integer(5), new Integer(0)},
					{new Integer(7), "\u9577\u5F13", new Integer(600*10), new Integer(8), new Integer(0), new Integer(15), new Integer(50)},
					{new Integer(8), "\u5927\u5730\u4E4B\u528D", new Integer(800*10), new Integer(15), new Integer(0), new Integer(0), new Integer(50)},
					{new Integer(9), "\u98A8\u5200", new Integer(800*10), new Integer(10), new Integer(0), new Integer(10), new Integer(0)},
					{new Integer(10), "\u6230\u9B25\u5F13", new Integer(800*10), new Integer(10), new Integer(0), new Integer(10), new Integer(0)},
					{new Integer(11), "\u6C34\u6676\u5203", new Integer(800*10), new Integer(0), new Integer(12), new Integer(10), new Integer(0)},
					{new Integer(12), "\u96D9\u679D\u77ED\u5200", new Integer(1000*15), new Integer(0), new Integer(20), new Integer(10), new Integer(0)},
					{new Integer(13), "\u7DA0\u8272\u540A\u5E36\u8932", new Integer(1200*15), new Integer(10), new Integer(10), new Integer(10), new Integer(100)},
					{new Integer(14), "\u66B4\u98A8\u4E4B\u528D", new Integer(1500*15), new Integer(40), new Integer(0), new Integer(20), new Integer(0)},
					{new Integer(15), "\u6D77\u795E\u4E4B\u65A7", new Integer(1500*15), new Integer(40), new Integer(0), new Integer(0), new Integer(200)},
					{new Integer(16), "\u706B\u7130\u4E4B\u5F13", new Integer(1500*15), new Integer(15), new Integer(0), new Integer(25), new Integer(0)},
					{new Integer(17), "\u843D\u8449\u795E\u5F13", new Integer(1500*15), new Integer(0), new Integer(0), new Integer(40), new Integer(0)},
					{new Integer(18), "\u8FC5\u731B\u76DC\u8CCA\u5315\u9996", new Integer(1500*15), new Integer(0), new Integer(30), new Integer(20), new Integer(0)},
					{new Integer(19), "\u5973\u7687\u96D9\u7FFC\u5203", new Integer(1500*15), new Integer(0), new Integer(30), new Integer(15), new Integer(200)},
					{new Integer(20), "\u6109\u6085\u4E4B\u5203", new Integer(2000*15), new Integer(40), new Integer(40), new Integer(0), new Integer(0)},
					{new Integer(21), "\u5996\u5922\u9B3C\u5200", new Integer(2000*15), new Integer(40), new Integer(40), new Integer(0), new Integer(0)},
					{new Integer(22), "\u6953\u8449\u7389\u52AA", new Integer(2000*15), new Integer(30), new Integer(0), new Integer(40), new Integer(0)},
					{new Integer(23), "\u9644\u9B54\u5C60\u9F8D\u5315\u9996", new Integer(2000*15), new Integer(0), new Integer(45), new Integer(30), new Integer(0)},
					{new Integer(24), "\u8D85\u5F37\u5E79\u54E1\u5957\u88DD", new Integer(2000*15), new Integer(15), new Integer(15), new Integer(15), new Integer(200)},
					{new Integer(25), "\u5361\u5E15\u840A\u7279\u62AB\u98A8", new Integer(2200*15), new Integer(30), new Integer(10), new Integer(20), new Integer(200)},
					{new Integer(26), "\u9ED1\u8272\u5B88\u8B77\u62AB\u98A8", new Integer(2200*15), new Integer(20), new Integer(10), new Integer(30), new Integer(200)},
					{new Integer(27), "\u9B3C\u602A\u62AB\u98A8", new Integer(2200*15), new Integer(10), new Integer(30), new Integer(20), new Integer(200)},
					{new Integer(28), "\u6DF7\u6C8C\u9CF3\u51F0\u4E4B\u5F13", new Integer(2300*15), new Integer(30), new Integer(0), new Integer(50), new Integer(0)},
					{new Integer(29), "\u7121\u96D9\u65B7\u9996\u5203", new Integer(2300*15), new Integer(0), new Integer(50), new Integer(30), new Integer(0)},
					{new Integer(30), "\u6DF7\u6C8C\u9EC3\u91D1\u5F29", new Integer(2800*15), new Integer(35), new Integer(0), new Integer(60), new Integer(0)},
					{new Integer(31), "\u6B9E\u843D\u738B\u8005\u4E4B\u528D", new Integer(3000*15), new Integer(80), new Integer(0), new Integer(50), new Integer(0)},
					{new Integer(32), "\u897F\u98A8\u5315\u9996", new Integer(3200*15), new Integer(80), new Integer(50), new Integer(0), new Integer(50)},
					{new Integer(33), "\u963F\u723E\u8840\u8165\u9577\u5F13", new Integer(3200*15), new Integer(40), new Integer(0), new Integer(70), new Integer(0)},
					{new Integer(34), "\u8D64\u738B\u77ED\u5200", new Integer(3200*15), new Integer(0), new Integer(65), new Integer(40), new Integer(0)},
					{new Integer(35), "\u9752\u9F8D\u5043\u6708\u5200", new Integer(3400*15), new Integer(0), new Integer(70), new Integer(30), new Integer(0)},
					{new Integer(36), "\u5C0F\u4E18\u904B\u52D5\u670D", new Integer(3600*15), new Integer(30), new Integer(30), new Integer(30), new Integer(300)},
					{new Integer(37), "\u7121\u76E1\u4E4B\u5203", new Integer(3800*15), new Integer(120), new Integer(0), new Integer(0), new Integer(0)},
					{new Integer(38), "\u53EF\u85A9\u4E4B\u5F29", new Integer(3800*15), new Integer(60), new Integer(0), new Integer(80), new Integer(0)},
					{new Integer(39), "\u5E1D\u738B\u96D9\u5200", new Integer(3800*15), new Integer(0), new Integer(90), new Integer(50), new Integer(0)},
					{new Integer(40), "\u70C8\u7130\u5F4E\u5200", new Integer(4200*15), new Integer(150), new Integer(50), new Integer(100), new Integer(0)},
					{new Integer(41), "\u6D77\u562F\u4E4B\u5203", new Integer(4200*15), new Integer(150), new Integer(100), new Integer(50), new Integer(0)},
					{new Integer(42), "\u6C38\u6046\u51A5\u96F7\u5F29", new Integer(4200*15), new Integer(80), new Integer(0), new Integer(120), new Integer(0)},
					{new Integer(43), "\u72C2\u66B4\u7684\u96F7\u672C\u5F13", new Integer(4200*15), new Integer(60), new Integer(0), new Integer(150), new Integer(0)},
					{new Integer(44), "\u7D2B\u7FFC\u9006\u5203", new Integer(4200*15), new Integer(0), new Integer(120), new Integer(80), new Integer(0)},
					{new Integer(45), "\u6708\u8B80\u547D\u65AC\u6BBA\u5200", new Integer(4500*15), new Integer(0), new Integer(150), new Integer(50), new Integer(0)},
					{new Integer(46), "\u7D2B\u8272\u84CB\u4E9E\u62AB\u98A8", new Integer(4600*15), new Integer(60), new Integer(20), new Integer(40), new Integer(500)},
					{new Integer(47), "\u7C43\u9F8D\u7D0B\u62AB\u98A8", new Integer(4600*15), new Integer(40), new Integer(20), new Integer(60), new Integer(500)},
					{new Integer(48), "\u5E0C\u8389\u7D72\u6597\u7BF7", new Integer(4600*15), new Integer(20), new Integer(60), new Integer(40), new Integer(500)},
					{new Integer(49), "\u9ED1\u6697\u51B0\u5782", new Integer(4800*15), new Integer(150), new Integer(0), new Integer(0), new Integer(500)},
					{new Integer(50), "\u5E15\u65AF\u51E1\u96F7\u6069\u5F13", new Integer(4800*15), new Integer(100), new Integer(0), new Integer(180), new Integer(0)},
					{new Integer(51), "\u7834\u640D\u66B4\u98A8\u5F4E\u5200", new Integer(4800*15), new Integer(0), new Integer(220), new Integer(0), new Integer(0)},
					{new Integer(52), "\u5996\u7CBE\u96FB\u64CA\u5957\u88DD", new Integer(4800*15), new Integer(40), new Integer(40), new Integer(40), new Integer(500)},
					{new Integer(53), "\u6975\u51CD\u6230\u9318", new Integer(5200*15), new Integer(180), new Integer(0), new Integer(50), new Integer(800)},
					{new Integer(54), "\u859B\u897F\u65AF\u7834\u5929\u5F29", new Integer(5200*15), new Integer(100), new Integer(0), new Integer(200), new Integer(0)},
					{new Integer(55), "\u9B42\u5DF4\u585E\u62C9\u5FB7", new Integer(5200*15), new Integer(0), new Integer(200), new Integer(120), new Integer(0)},
					{new Integer(56), "\u7D50\u5A5A\u79AE\u670D", new Integer(5500*15), new Integer(50), new Integer(50), new Integer(50), new Integer(800)},
					{new Integer(57), "\u52C7\u8005\u4E4B\u528D", new Integer(5800*15), new Integer(250), new Integer(0), new Integer(100), new Integer(500)},
					{new Integer(58), "\u51F1\u8389\u4E4B\u528D", new Integer(5800*15), new Integer(250), new Integer(100), new Integer(0), new Integer(500)},
					{new Integer(59), "\u5149\u5BBF\u795E\u5F29", new Integer(5800*15), new Integer(120), new Integer(0), new Integer(300), new Integer(0)},
					{new Integer(60), "\u963F\u5E15\u5951\u5F29\u5F13", new Integer(5800*15), new Integer(100), new Integer(0), new Integer(320), new Integer(0)},
					{new Integer(61), "\u6975\u96FB\u5C0F\u5996\u7CBE\u5200", new Integer(5800*15), new Integer(0), new Integer(250), new Integer(200), new Integer(0)},
					{new Integer(62), "\u61A4\u6012\u76DC\u8CCA\u5315\u9996", new Integer(6200*15), new Integer(0), new Integer(300), new Integer(150), new Integer(0)},
					{new Integer(63), "\u56E0\u6CE2\u65AF\u4E4B\u5F29", new Integer(6600*15), new Integer(120), new Integer(0), new Integer(500), new Integer(0)},
					{new Integer(64), "\u7345\u5B50\u7149\u7344\u93A7\u7532", new Integer(6800*15), new Integer(100), new Integer(0), new Integer(0), new Integer(1500)},
					{new Integer(65), "\u7D05\u8272\u7375\u4EBA\u670D", new Integer(6800*15), new Integer(0), new Integer(0), new Integer(120), new Integer(1000)},
					{new Integer(66), "\u8FF7\u9727\u884C\u8005\u93A7\u7532", new Integer(6800*15), new Integer(0), new Integer(150), new Integer(0), new Integer(800)},
					{new Integer(67), "\u4E0D\u901F\u4E4B\u5BA2\u77ED\u528D", new Integer(7500*15), new Integer(0), new Integer(400), new Integer(300), new Integer(0)},
					{new Integer(68), "\u51F1\u723E\u4E4B\u5203", new Integer(7600*15), new Integer(450), new Integer(100), new Integer(0), new Integer(800)},
					{new Integer(69), "\u6BC0\u6EC5\u4E4B\u528D", new Integer(8500*15), new Integer(1000), new Integer(0), new Integer(0), new Integer(0)},
					{new Integer(70), "\u6BC0\u6EC5\u4E4B\u5F29", new Integer(8500*15), new Integer(100), new Integer(0), new Integer(1000), new Integer(0)},
					{new Integer(71), "\u50B3\u8AAA\u70C8\u98A8\u77ED\u5203", new Integer(8500*15), new Integer(0), new Integer(1000), new Integer(0), new Integer(0)},
					{new Integer(72), "\u83AB\u65AF\u96F7\u6069\u5957\u88DD", new Integer(8800*15), new Integer(200), new Integer(0), new Integer(0), new Integer(3000)},
					{new Integer(73), "\u5927\u5C71\u7A4D\u795E\u93A7\u7532", new Integer(8800*15), new Integer(0), new Integer(0), new Integer(250), new Integer(2000)},
					{new Integer(74), "\u6C38\u6046\u8FF7\u8E64\u670D", new Integer(8800*15), new Integer(0), new Integer(300), new Integer(20), new Integer(1000)},
					{new Integer(75), "\u795E\u9F8D\u62AB\u98A8", new Integer(8800*15), new Integer(150), new Integer(50), new Integer(80), new Integer(800)},
					{new Integer(76), "\u6D77\u8ECD\u8266\u9577\u62AB\u98A8", new Integer(8800*15), new Integer(80), new Integer(50), new Integer(150), new Integer(800)},
					{new Integer(77), "\u84CB\u4E16\u96D9\u6708\u62AB\u98A8", new Integer(8800*15), new Integer(50), new Integer(150), new Integer(80), new Integer(800)},
					{new Integer(78), "\u5B88\u8B77\u4E4B\u528D", new Integer(9200*15), new Integer(800), new Integer(200), new Integer(200), new Integer(2000)},
					{new Integer(79), "\u66B4\u98A8\u795E\u5C04\u4E4B\u5F13", new Integer(9200*15), new Integer(150), new Integer(0), new Integer(1200), new Integer(2000)},
					{new Integer(80), "\u89BA\u9192\u5DF4\u585E\u62C9\u5FB7", new Integer(9200*15), new Integer(0), new Integer(1200), new Integer(1000), new Integer(2000)},
					{new Integer(81), "\u5929\u72FC\u661F\u62AB\u98A8", new Integer(9600*15), new Integer(150), new Integer(150), new Integer(150), new Integer(1500)},
					{new Integer(82), "\u5E1D\u570B\u82F1\u96C4\u93A7\u7532", new Integer(10200*20), new Integer(500), new Integer(0), new Integer(0), new Integer(5000)},
					{new Integer(83), "\u5E1D\u570B\u92B3\u5229\u93A7\u7532", new Integer(10200*20), new Integer(0), new Integer(0), new Integer(600), new Integer(4500)},
					{new Integer(84), "\u6F22\u5E15\u8840\u8165\u76D4\u7532", new Integer(10200*20), new Integer(0), new Integer(650), new Integer(0), new Integer(3000)},
					{new Integer(85), "\u7121\u540D\u8863", new Integer(16800*20), new Integer(800), new Integer(800), new Integer(800), new Integer(8000)},
				},
			new String[] {
				"\u7DE8\u865F", "\u6B66\u5668\u540D\u7A31", "\u50F9\u683C", "\u529B\u91CF", "\u5E78\u904B", "\u654F\u6377", "\u751F\u547D"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		武器列表.getColumnModel().getColumn(0).setPreferredWidth(60);
		武器列表.getColumnModel().getColumn(1).setPreferredWidth(160);
		武器列表.getColumnModel().getColumn(2).setPreferredWidth(100);
		滾動列表.setViewportView(武器列表);
		
		操作方式 = new JTextField();
		操作方式.setForeground(Color.WHITE);
		操作方式.setText(" \u8F38\u5165\u7DE8\u865F\uFF1A\r\n( \u4F8B\u5982\uFF1A1~85 )");
		操作方式.setBackground(Color.BLACK);
		操作方式.setBounds(359, 121, 157, 41);
		背景.add(操作方式);
		操作方式.setColumns(10);
		
		擁有金錢 = new JTextField();
		擁有金錢.setForeground(Color.WHITE);
		擁有金錢.setText("擁有金錢："+Charc.money);
		擁有金錢.setBackground(Color.BLACK);
		擁有金錢.setBounds(359, 81, 157, 41);
		背景.add(擁有金錢);
		擁有金錢.setColumns(10);
		
		JLabel l1 = new JLabel("This is a \nJText\nField:");
		l1.setBounds(398, 181, 87, 23);
	 
	    final JTextField t1 = new JTextField(10);
	     
	     
	    JButton 購買按鈕 = new JButton("\u8CFC\u8CB7");
	    購買按鈕.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	}
	    });
		購買按鈕.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//  將s return給Shop_Armament_systems_w2 作購買判斷
				s = Integer.parseInt(t1.getText().toString());		//測試輸入資料
				
				if(s<=0 || s>85)
				{
					new Thread(new Runnable(){
						@Override
						public void run() {
							final JFrame er=new JFrame("輸入超過範圍!!");
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
					}).start();
				}
				else if(Charc.money<Equipment2.Price.get(s))
				{
					MainWindows.main("經額不足!!\r\n");
					dispose();
				}
				else
				{
					for(int i=0;i<Charc.bag.length;i++)
					{
						if(Charc.bag[i]==0)
						{
							Charc.bag[i]=s;
							Charc.money = Charc.money-Equipment2.Price.get(s);
							Charc.strength = Charc.strength+Equipment2.Power.get(s);
							Charc.alacrity = Charc.alacrity+Equipment2.Agility.get(s);
							Charc.lucky = Charc.lucky+Equipment2.Lucky.get(s);
							Charc.life = Charc.life+Equipment2.Life.get(s);
							if(Charc.carceer.compareTo("劍士")==0)
							{
								劍士 charctor = new 劍士(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
							}
							else if(Charc.carceer.compareTo("弓箭手")==0)
							{
								弓箭手 charctor = new 弓箭手(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
							}
							else if(Charc.carceer.compareTo("盜賊")==0)
							{
								盜賊 charctor = new 盜賊(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
							}
							MainWindows.main("購買 "+Equipment2.Name.get(s)+"\r\n");
							dispose();
							break;
						}
						if(i==4)
						{
							MainWindows.main("裝備欄已滿!!\r\n請先丟棄裝備後再購買...\r\n");
							dispose();
							break;
						}
					}
				}
				//System.out.println("購買編號: "+s);	//確認資料是否傳遞正確
				/* 可增加一跳出視窗在購買成功或失敗時 */ 
			}
		});
		購買按鈕.setBounds(398, 229, 87, 23);
		
		
		
		背景.add(購買按鈕);
		t1.setBounds(398, 181, 87, 23);
	    t1.setEditable(true);
	    背景.add(l1);
	    背景.add(t1);
	    背景.setVisible(true);		
	        
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
