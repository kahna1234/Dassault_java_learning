
public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWorld obj1 = new MyWorld();
		Continents obj2 = obj1.asia();
		Country obj3 = obj2.india();
		State obj4 = obj3.odisha();
		District obj5 = obj4.bhadrak(obj3);
		obj5.home();
	}

}
class MyWorld
{
	Continents asia()
	{
		System.out.println("The largest continent of the World");
		Continents newCont = new Continents("Asia");
		return newCont;
	}
}
class Continents
{
	String countinentName;
	
	public Continents(String countinentName) {
		super();
		this.countinentName = countinentName;
	}

	Country india()
	{
		System.out.println("The most beautiful country of the world in the continent "+countinentName);
		Country newcoun = new Country("India");
		return newcoun;
	}
}
class Country
{
	String countryName;
	
	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	State odisha()
	{
		System.out.println("This is my state in the country "+countryName);
		State newSta = new State("Odisha");
		return newSta;
	}
}
class State
{
	String stateName;
	public State(String stateName) {
		super();
		this.stateName = stateName;
	}

	District bhadrak(Country newObj1)
	{
		System.out.println("I live in this district which is situated in the State "+stateName+" And in the country"+newObj1.countryName);
		District newDist = new District();
		return newDist;
	}
}
class District
{
	void home()
	{
		System.out.println("I stay here");
	}
}
