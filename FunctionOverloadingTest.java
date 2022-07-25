
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tigerObj = new Tiger();
		tigerObj.jump();
		tigerObj.jump(15);
		tigerObj.jump(17.5f);
		tigerObj.jump(18,5);
		

	}

}
/*
 We can define functions with same name but they should be differentiated.
 */

class Tiger
{
	void jump()
	{
		System.out.println("Tiger is jumping");
	}
	void jump(int length)
	{
		System.out.println("Tiger is jumping "+length+" feet");
	}
	void jump(float length)
	{
		System.out.println("Tiger is jumping "+length+ " feet");
	}
	void jump(int length, int height)
	{
		System.out.println("Tiger is jumping "+length+ " feet "+height+" height ");
	}
	void jump(int length, float height)
	{
		System.out.println("Tiger is jumping "+length+ " feet "+height+" height ");
	}
	void jump(float length, int height)
	{
		System.out.println("Tiger is jumping "+length+ " feet "+height+" height ");
	}
}