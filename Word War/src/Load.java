import java.io.*;
public class Load {

	public static void main() throws IOException {
		
		String name = null;
		int strength = 0;
		int alacrity = 0;
		int lucky = 0;
		int life = 0;
		int level = 0;
		int money = 0;
		int exp = 0;
		int Equipment[] = new int [6];		//裝備陣列
		
		char data[] = new char[500];
		FileReader fr = new FileReader("c:\\proverb.txt"); //存檔路徑
		int num = fr.read(data);
		String Load_sig = new String(data,0,num);		//儲存資料字串
		String Load[] = Load_sig.split(",");
		Charc.name = Load[0];
		Charc.carceer = Load[1];
		Charc.strength = Integer.parseInt(Load[2]);
		Charc.alacrity = Integer.parseInt(Load[3]);
		Charc.lucky = Integer.parseInt(Load[4]);
		Charc.life = Integer.parseInt(Load[5]);
		Charc.level = Integer.parseInt(Load[6]);
		Charc.exp = Integer.parseInt(Load[7]);
		Charc.money = Integer.parseInt(Load[8]);
		for(int i=0;i<5;i++)
			Charc.bag[i] = Integer.parseInt(""+Load[i+9]);
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
		for(int i=Load.length-1;i>13;i--)
			All_data.mess.add(Load[i]);
		fr.close();
		
	}
}