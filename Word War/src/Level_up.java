import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Level_up {
	
	        public static int exp[]={0,0,20,40,70,110,160,220,290,370,460,660,880,1120,1380,1660,1960,2280,2620,2980,3360,3960,4610,5310,6060,6860,7710,8610,9560,10560,11610,13010,14490,16050,17690,19410,21210,23090,25050,27090,29210,31860,34630,37520,40530,43660,46910,50280,53770,57380,61110,65560,70170,74940,79870,84960,90210,95620,101190,106920,112810,119660,126730,134020,141530,149260,157210,165380,173770,182380,191210,201510,212110,223010,234210,245710,257510,269610,282010,294710,307710,323010,338760,354960,371610,388710,406260,424260,442710,461610,480960,503260,526560,550860,576160,602460,629760,658060,687360,717660,748960};
						
			public static void Level(int lv,int ex,final int r)
			{
				if (exp[lv+1]<ex)
				{
					Charc.level=lv+1;
					if(Charc.carceer.compareTo("劍士")==0)
					{
						Charc.strength = Charc.strength+3;
						Charc.alacrity = Charc.alacrity+1;
						Charc.lucky = Charc.lucky+1;
						Charc.life = Charc.life+10;
						劍士 charctor = new 劍士(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("恭喜你升級了!\r\n");
					}
					if(Charc.carceer.compareTo("弓箭手")==0)
					{
						Charc.strength = Charc.strength+1;
						Charc.alacrity = Charc.alacrity+2;
						Charc.lucky = Charc.lucky+2;
						Charc.life = Charc.life+8;
						弓箭手 charctor = new 弓箭手(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("恭喜你升級了!\r\n");
					}
					if(Charc.carceer.compareTo("盜賊")==0)
					{
						Charc.strength = Charc.strength+1;
						Charc.alacrity = Charc.alacrity+3;
						Charc.lucky = Charc.lucky+1;
						Charc.life = Charc.life+10;
						盜賊 charctor = new 盜賊(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("恭喜你升級了!\r\n");
					}
				}	
				else if(exp[lv]>ex)
				{
					Charc.level=lv-1;
					if(Charc.carceer.compareTo("劍士")==0)
					{
						Charc.strength = Charc.strength-3;
						Charc.alacrity = Charc.alacrity-1;
						Charc.lucky = Charc.lucky-1;
						Charc.life = Charc.life-10;
						劍士 charctor = new 劍士(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("再亂打就會再被降等><\r\n");
					}
					if(Charc.carceer.compareTo("弓箭手")==0)
					{
						Charc.strength = Charc.strength-1;
						Charc.alacrity = Charc.alacrity-2;
						Charc.lucky = Charc.lucky-2;
						Charc.life = Charc.life-8;
						弓箭手 charctor = new 弓箭手(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("再亂打就會再被降等><\r\n");
					}
					if(Charc.carceer.compareTo("盜賊")==0)
					{
						Charc.strength = Charc.strength-1;
						Charc.alacrity = Charc.alacrity-3;
						Charc.lucky = Charc.lucky-1;
						Charc.life = Charc.life-10;
						盜賊 charctor = new 盜賊(Charc.name,Charc.carceer ,Charc.strength,Charc.alacrity,Charc.lucky,Charc.life,Charc.exp,Charc.level,Charc.money);
						All_data.mess.add("再亂打就會再被降等><\r\n");
					}
				}
				if(Charc.level == 3 || Charc.level == 10 || Charc.level == 15 || Charc.level == 25 || Charc.level == 40 || Charc.level == 60)
				{
					new Thread(new Runnable(){
						@Override
						public void run() {
							try {
								Thread.sleep(2000*r); 
							} catch (InterruptedException e) {
							}
							final JFrame er=new JFrame("新地圖解鎖");
							er.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							er.setLocationRelativeTo(null); 
							er.setSize(250,100);
							er.setVisible(true);
							er.setResizable(false);
							JButton BEnd2 = new JButton("<html>恭喜解鎖新地圖<br>點擊繼續</html>");
							BEnd2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									er.dispose();
								}
							});
							er.getContentPane().add(BEnd2);
						}
					}).start();
				}
			}

}
