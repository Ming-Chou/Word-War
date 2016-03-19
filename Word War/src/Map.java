//package Word_war;
import java.util.ArrayList;

class Map{
	private String name;
	private ArrayList<Monster> monster=new ArrayList<Monster>();
	public Map(String name){
		this.name=name;
	}
	public Map(String name,Monster[] monster){
		this.name=name;
		for (int i=0;i<monster.length;i++)
			this.monster.add(monster[i]);
	}
	public Map(String name,Monster[] monster,Monster[] monster1){
		this.name=name;
		for (int i=0;i<monster.length;i++)
			this.monster.add(monster[i]);
		for (int i=0;i<monster1.length;i++)
			this.monster.add(monster1[i]);
	}
	public Map(String name,Monster[] monster,Monster[] monster1,Monster[] monster2){
		this.name=name;
		for (int i=0;i<monster.length;i++)
			this.monster.add(monster[i]);
		for (int i=0;i<monster1.length;i++)
			this.monster.add(monster1[i]);
		for (int i=0;i<monster2.length;i++)
			this.monster.add(monster2[i]);
	}
	public void show(){
		System.out.print(name);
	}
	public ArrayList<Monster> getMonster(){
		return monster;
	}
}
