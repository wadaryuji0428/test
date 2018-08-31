
public class Fool extends Character implements Human{
	public void attack(Matango m){
		System.out.println(this.getName()+"は、戦わず遊んでいる。");
		
	}
	public void talk()
	public void watch()
	public void hear()
	public void run()

}
if(c instanceof SuperHero){
	SuperHero h=(SuperHero) c;
	h.fly();
}
public class Main{
	public static void main (String[]args){
		Monster[]monsters=new Monster[3];
		monsters[0]=new Slime();
		monsters[1]=new DeathBat();
		for (Monster m: monsters){
			m.run();
		}
	}
}