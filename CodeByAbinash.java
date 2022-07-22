
public class CodeByAbinash {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket cri = new Cricket();
		cri.name();
		cri.scoreCollege(8.51, 9.47);
		double myMark = cri.collegeMarks(87.96);
		System.out.println("mark scored is "+myMark);
		int goal=cri.football();
		System.out.println("goal scored is "+goal+" in a match");

	}
}
class Cricket
{
	void name()
	{
		String name = "Krish";
		System.out.println("the name of the person is " +name);
	}
	void scoreCollege(double sem1,double sem2)
	{
		System.out.println("score in semester 1 is "+sem1+ " score in semester 2 is "+sem2);
	}
	double collegeMarks(double marks)
	{
		return marks;
	}
	int football()
	{
		return 2;
	}
}