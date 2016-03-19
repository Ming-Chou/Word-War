import java.io.FileWriter;
import java.io.IOException;
public class Save {

	public static void main() throws IOException {
		
		String Save = "";		//儲存資料字串
		FileWriter fw = new FileWriter("c:\\proverb.txt"); //存檔路徑
		
		String name = null;
		int strength = 0;
		int alacrity = 0;
		int lucky = 0;
		int life = 0;
		int level = 0;
		int exp = 0;
		int Equipment[] = {1,2,3,4,5};		//裝備陣列
		Save += Charc.name;
		Save += ",";
		Save += Charc.carceer;
		Save += ",";
		Save += Charc.strength;
		Save += ",";
		Save += Charc.alacrity;
		Save += ",";
		Save += Charc.lucky;
		Save += ",";
		Save += Charc.life;
		Save += ",";
		Save += Charc.level;
		Save += ",";
		Save += Charc.exp;
		Save += ",";
		Save += Charc.money;
		for(int i=0;i<Equipment.length;i++)
		{
			Save += ",";
			Save += Charc.bag[i];
		}
		for(int i=1;i<=All_data.mess.size();i++)
		{
			Save = Save+","+All_data.mess.get(All_data.mess.size()-i);
		}
		Save = Save+","+"\r\n";
		fw.write(Save);
		fw.close();
	}
}
