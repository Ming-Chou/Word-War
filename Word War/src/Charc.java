//package Word_war;
import java.util.*;
public abstract class Charc {
	public static String name;
	public static String carceer;
	public static int strength;
	public static int alacrity;
	public static int lucky;
	public static int life;
	public static int exp;
	public static int level;
	public static int money;
	public static int ATK;
	
	public static int[] bag = new int[5];
	public Charc(String name,String carceer,int strength,int alacrity,int lucky,int life,int exp,int level,int money) 
	{	
		this.level=level;
		this.carceer=carceer;
		this.name=name;
		this.strength=strength;
		this.life=life;
		this.alacrity=alacrity;
		this.lucky=lucky;
		this.exp=exp;
		this.money=money;
	}
	abstract public int show_atk();
	abstract public void load(String name);
	abstract public String show_career();
}

class �C�h extends Charc
{		
	public �C�h(String name)
	{
		super(name,"�C�h" ,4, 2,2,150,0,1,1000);
		super.ATK = strength*5 + alacrity*1 + lucky*1;
	}
	public �C�h(String name,String carceer,int strength,int alacrity,int lucky,int life,int exp,int level,int money)
	{
		super(name,"�C�h" ,strength, alacrity,lucky,life,exp,level,money);
		super.ATK = strength*5 + alacrity*1 + lucky*1;
	}
	public void load(String name)
	{
		super.name=name;
		super.carceer = "�C�h";
		super.strength=4;
		super.alacrity=2;
		super.level=1;
		super.exp=0;
		super.life=150;
		super.lucky=2;
		super.money=1000;
	}
	public String show_career()
	{
		
		return "�C�h";
		
	}
	public int show_atk()
	{
		
		return super.ATK= strength*5 + alacrity*1 + lucky*1;
		
	}
}

class �}�b�� extends Charc
{
	public �}�b��(String name)
	{
		super(name,"�}�b��",2, 4, 4,100, 0,1,1000);
		super.ATK = strength*1 +(alacrity+lucky)/2*5;
	}
	public �}�b��(String name,String carceer,int strength,int alacrity,int lucky,int life,int exp,int level,int money)
	{
		super(name,"�}�b��" ,strength, alacrity,lucky,life,exp,level,money);
		super.ATK = strength*1 +(alacrity+lucky)/2*5;
	}
	public void load(String name)
	{
		super.name=name;
		super.carceer = "�}�b��";
		super.strength=2;
		super.alacrity=4;
		super.level=1;
		super.exp=0;
		super.life=100;
		super.lucky=4;
		super.money=1000;
	}
	
	
	public String show_career()
	{
		
		return "�}�b��";
		
	}
	public int show_atk()
	{
		
		return super.ATK=strength*1 +(alacrity+lucky)/2*5;
		
	}
	
}

class �s�� extends Charc{

	public �s��(String name) {
		super(name,"�s��", 2, 4, 2, 100, 0,1,1000);
		super.ATK = strength*1 + alacrity*5 + lucky*1;
		
	}
	public �s��(String name,String carceer,int strength,int alacrity,int lucky,int life,int exp,int level,int money)
	{
		super(name,"�s��" ,strength, alacrity,lucky,life,exp,level,money);
		super.ATK = strength*1 + alacrity*5 + lucky*1;
	}
	public void load(String name)
	{
		super.name=name;
		super.carceer = "�s��";
		super.strength=2;
		super.alacrity=4;
		super.level=1;
		super.exp=0;
		super.life=100;
		super.lucky=2;
		super.money=1000;
	}
	public String show_career()
	{
		
		return "�s��";
		
	}
	public int show_atk()
	{
		return super.ATK=strength*1 + alacrity*5 + lucky*1;
	}
}