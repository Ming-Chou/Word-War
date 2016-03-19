//package Word_war;
import java.util.*;
class Monster
{
	private String Name;
	private int Money;
	private int Attack;
	private int Life;
	private int Exp;	
	
	public Monster(String Name,int Money,int Attack,int Life,int Exp)
	{
		this.Name=Name;
		this.Money=Money;
		this.Attack=Attack;
		this.Exp=Exp;
		this.Life=Life;	
	}
	public String ShowName()
	{
		return Name;
	}
	public int ShowMoney()
	{
		return Money;
	}
	public int ShowAttack()
	{
		return Attack;
	}
	public int ShowLife()
	{
		return Life;
	}
	public int ShowExp()
	{
		return Exp;
	}
	public void Show()
	{
		System.out.println(Name+" 嚙踝�蕭"+Money+" 嚙踐�嚙踝蕭�蕭嚙�"+Attack+" 嚙踝蕭賹��蕭"+Life+" �秋嚙踐不嚙踝蕭"+Exp);
	}
}