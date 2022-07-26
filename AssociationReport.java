
public class AssociationReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Tractor newTra = new Tractor("Mahindra",4,"Diesel");
		Farming newObj = new Farming("rice","Punjhab","rainy",25f);
		newObj.printFarming();
		Canal cc = new Canal("Indrabati",200);
		Pipeline pp = new Pipeline("Govt",20);
        Watering newObj1 = newObj.water(cc, pp);
        newObj1.getPrintWatering();
        
	}

}

class Farming
{
	String corps;
	String location;
	String season;
	float area;
	
	public Farming(String corps, String location, String season, float area) {
		super();
		this.corps = corps;
		this.location = location;
		this.season = season;
		this.area = area;
	}
	
	void printFarming()
	{
		System.out.println("-----The most traditional way of growing foods-------");
		System.out.println("The crop "+corps+" is going to be cultivated");
		System.out.println("in the location "+location);
		System.out.println("during the Season "+season);
		System.out.println("the total area of farming is "+area+" acres");
	}

	Watering water(Canal c, Pipeline p)
	{
		System.out.println("The canal which is proving the water is :"+c.name+" and the length of the canal line is "+c.lenght+" The provider of the Water supply from the canal is "+p.supplierName+ " and The total length of water suppy facily from the canal is "+p.lengthOfPipe);
		Watering objWat = new Watering();
		return objWat;
	}
	
}
class AutomatedFarming extends Farming
{
	String machines;
	String pesticites;
	String techniques;
	Tractor tb;
	public AutomatedFarming(String corps, String location, String season, float area, String machines,
			String pesticites, String techniques, Tractor tb) {
		super(corps, location, season, area);
		this.machines = machines;
		this.pesticites = pesticites;
		this.techniques = techniques;
		this.tb = tb;
	}
}
class ManualFarming extends Farming
{
	String equipments;
	String labours;
	int days;
	public ManualFarming(String corps, String location, String season, float area, String equipments, String labours,
			int days) {
		super(corps, location, season, area);
		this.equipments = equipments;
		this.labours = labours;
		this.days = days;
	    }
}

class Watering
{
	void getPrintWatering()
	{
		System.out.println("Due to everyone's effort watering activity is completely done");
	}
}

class Canal
{
	String name;
	float lenght;
	public Canal(String name, float lenght) {
		super();
		this.name = name;
		this.lenght = lenght;
	}
}

class Pipeline
{
	String supplierName;
	int lengthOfPipe;
	public Pipeline(String supplierName, int lengthOfPipe) {
		super();
		this.supplierName = supplierName;
		this.lengthOfPipe = lengthOfPipe;
	}	
}
class Tractor
{
	String name;
	int wheel;
	String fuel;
	public Tractor(String name, int wheel, String fuel) {
		super();
		this.name = name;
		this.wheel = wheel;
		this.fuel = fuel;
	}
	void specification()
	{
		System.out.println("The name of the tractor is: "+name);
		System.out.println("The number of Wheels are  : "+wheel);
		System.out.println("The fuel used here is     : "+fuel);
	}
}




