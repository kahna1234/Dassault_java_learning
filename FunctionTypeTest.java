
public class FunctionTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalci;
		myCalci = new Calculator();
		
		myCalci.fun1();
		myCalci.fun2(15, 15.2f, 18.96);
		
		double output1 = myCalci.fun3('b', 12.56f,18.230);
		System.out.println("output "+output1);
		
		double distanceBetweenTheEarthAndSun = myCalci.fun4();
		System.out.println("The distance between sun and Earth is "+distanceBetweenTheEarthAndSun);
	}

}
class Calculator
{
	void fun1()
	{
		System.out.println("fun is doing some activity");
		System.out.println("---------------");
	}
	void fun2(int x, float y, double z)
	{
		System.out.println("fun2 is doing some activity");
		System.out.println("x "+x+"y "+y+"z+ "+z);
		System.out.println("---------------");
	}
	double fun3(char x, float y, double z)
	{
		System.out.println("fun2 is doing some activity");
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("z "+z);
		System.out.println("---------------");
		return 56.689;
		
	}
	double fun4()
	{
		System.out.println("calculating the distance between the Earth and Sun");
		System.out.println("---------------");
		return 186000.519*480;
	}
}
/*
 1.function without taking arguments
            without returning value
 2.function taking argument
            without returning value
 3.function taking argument 
            returning value
 4.function without taking value
            returning value
            
*/