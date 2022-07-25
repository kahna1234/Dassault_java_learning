
public class Sports {
	public static void main(String[] args) {
		SportsName newObj1 = new SportsName();
		newObj1.benefits();
		System.out.println("----------------------------------");
		
		OutDoor newObj2 = new OutDoor("OutDoor Sports",6);
		newObj2.outDoorBenefits();
		System.out.println("----------------------------------");
		
		Cricket1 newObj3 = new Cricket1("OutDoor Sports",6,"Cricket",11);
		newObj3.cricketBenefits();
		
	}
}
class SportsName
{
	void benefits()
	{
		System.out.println("It requires Physical activity which helps in improvement in knowledge and fintess");
	}
}
class OutDoor extends SportsName
{
	String outDoor;
	int members;
	public OutDoor(String outDoor, int members) {
		super();
		this.outDoor = outDoor;
		this.members = members;
	}
	void outDoorBenefits()
	{
		super.benefits();
		
		System.out.println("The sports type is "+outDoor+ " The members required here is more than "+members);
		System.out.println("Outdoor sports generally focuses on the physical activity. Hence its effects fitness more compared to brain development");
	}
	
}
class Cricket1 extends OutDoor
{
	String sportsName;
	int players;
	public Cricket1(String outDoor, int members, String sportsName, int players) {
		super(outDoor, members);
		this.sportsName = sportsName;
		this.players = players;
	}
	void cricketBenefits()
	{
		super.outDoorBenefits();
		System.out.println("This sports name is "+sportsName+" The number of players required for this sports is "+players);
		System.out.println("this is the most popular sports in India");
	}
}