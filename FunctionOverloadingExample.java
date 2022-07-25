
public class FunctionOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel newObj = new Hotel();
		newObj.room(702);
		newObj.room(3112.45f, 702);
		newObj.room(702, "Nikhil");
		newObj.room(true,702);

	}

}
class Hotel
{
	void room(int roomNumber)
	{
		System.out.println("The Room number is "+roomNumber);
	}
	void room(int roomNumber,String name)
	{
		System.out.println("The Room number is "+roomNumber+" The name of the person is "+name);
	}
	void room(float rent,int roomNumber)
	{
		System.out.println("The rent of the room is "+rent+" The Room number is "+roomNumber);
	}
	void room(boolean catering, int roomNumber)
	{
		System.out.println("The catering facility is available "+catering+ " The Room number is "+roomNumber);
	}
}