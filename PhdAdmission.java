import java.util.Scanner;

public class PhdAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your 10th marks");
		Scanner sc1 = new Scanner(System.in);
		float a= sc1.nextFloat();
		System.out.println("Enter your 12th marks");
		Scanner sc2 = new Scanner(System.in);
		float b= sc2.nextFloat();
		System.out.println("Enter your B.Tech CGPA");
		Scanner sc3 = new Scanner(System.in);
		float c= sc3.nextFloat();
		System.out.println("Enter your M.Tech CGPA");
		Scanner sc4 = new Scanner(System.in);
		float d= sc4.nextFloat();
		Phd newPh = new Phd(a,b,c,d);
		try
		{
			newPh.cvUpload();
			newPh.documentVarificationStarted();
			newPh.varifying();
			newPh.documentVarificationCompleted();
//			System.out.println("---------Start of Interview Round---------");
			newPh.technicalInterview();
			newPh.hrInterview();
		}
		catch(BseException e)
		{
			System.out.println("Problem: "+e.getLocalizedMessage());
		}
		catch(HseException f)
		{
			System.out.println("Problem: "+f.getLocalizedMessage());
		}
		catch(BTechException g)
		{
			System.out.println("Problem: "+g.getMessage());
		}
		catch(MTechException h)
		{
			System.out.println("Problem: "+h.getMessage());
		}
		catch(TechnicalInterviewTest i)
		{
			System.out.println("Problem: "+i.getMessage());
		}
		catch(HRInterviewException j)
		{
			System.out.println("Problem: "+j.getMessage());
		}
		
		
	}	

}

class BseException extends Exception
{
	BseException(String msg)
	{
		super(msg);
	}
}
class HseException extends Exception
{
	HseException(String msg)
	{
		super(msg);
	}
}
class BTechException extends Exception
{
	BTechException(String msg)
	{
		super(msg);
	}
}
class MTechException extends Exception
{
	MTechException(String msg)
	{
		super(msg);
	}
}
class Phd
{
	double score1;
	double score2;
	double score3;
	double score4;
	
	 public Phd(double score1, double score2, double score3, double score4) {
		super();
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
	}
	void cvUpload()
	{
		System.out.println("CV is uploaded.....");
	}
	 void documentVarificationStarted()
	 {
		 System.out.println("The document varification Started......");
	 }
	 void varifying() throws BseException,HseException,BTechException,MTechException
	 {
		 if(score1<65)
		 {
			 BseException newBse = new BseException("BSE mark is not sufficient for qualification");
			 throw newBse;
		 }
		 if(score2<65)
		 {
			 HseException newHse = new HseException("HSE marks is not sufficient");
			 throw newHse;
		 }
		 if(score3<7.5)
		 {
			 BTechException newBTech = new BTechException("B.Tech CGPA is not sufficient");
			 throw newBTech;
		 }
		 if(score4<7.5)
		 {
			 MTechException newMTech = new MTechException("M.Tech CGPA is not sufficient");
			 throw newMTech;
		 }
	 }
		 void technicalInterview()
		 {
			 int ans = (int)(10*Math.random());
			 System.out.println("Number of questions answered in Technical round "+ans);
					 if(ans<6)
					 {
						 TechnicalInterviewTest newTech = new TechnicalInterviewTest("You have not successed the interview for technical");
						 throw newTech;
					 }
		 }
		 
		 void hrInterview()
		 {
			 int ans1 = (int)(10*Math.random());
			 System.out.println("Number of questions answered HR round is "+ans1);
					 if(ans1<6)
					 {
						 HRInterviewException newTech1 = new HRInterviewException("You have not successed the interview for HR");
						 throw newTech1;
					 }
		 }
	 
	 void documentVarificationCompleted()
	 {
		 System.out.println("Congratulaton for varifying document");
	 }
	 
	
}