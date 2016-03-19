//package Word_war;
class Equipment
{
	private String Name;
	private int Price;
	private int Power;
	private int Lucky;
	private int Agility;
	private int Life;	
	
	public Equipment(String Name,int Price,int Power,int Lucky,int Agility,int Life)
	{
		this.Name=Name;
		this.Price=Price;
		this.Power=Power;
		this.Lucky=Lucky;
		this.Agility=Agility;
		this.Life=Life;		
	}
	
	public String ShowName()
	{
		return Name;
	}
	public int ShowPrice()
	{
		return Price;
	}
	public int ShowPower()
	{
		return Power;
	}
	public int ShowLucky()
	{
		return Lucky;
	}
	public int ShowAgility()
	{
		return Agility;
	}
	public int ShowLife()
	{
		return Life;
	}
	public void Show()
	{
		System.out.println(Name+" 嚙踝�嚙踝�蕭"+Price+" 嚙踝蕭謜蕭�鳴蕭嚙�"+Power+" ��嚙踝嚙踝蕭"+Lucky+" 嚙踝蕭�莎�蕭"+Agility+" 嚙踝蕭賹��蕭"+Life);
	}
}