public class ISE2_CMS_program2{

	public static void main(String args[])
	{
		RegularStudent rpm=new RegularStudent("R P Mathwale","IT","2003-08-12",95.5);
		DSYStudent amf=new DSYStudent("A M Fajge","CSE","2003-05-12",95.5);
		System.out.println("Total Number of Students: " +Student.count);
		System.out.println("Total Number of Regular Students: " +RegularStudent.count);
		System.out.println("Total Number of DSY Students: " +DSYStudent.count);
		
		RegularStudent bss=new RegularStudent("B S Shetty","IT","2003-11-03",99.5);
		System.out.println("Total Number of Students: " +Student.count);
		System.out.println("Total Number of Regular Students: " +RegularStudent.count);
		System.out.println("Total Number of DSY Students: " +DSYStudent.count);
		
		System.out.println(amf);
		System.out.println("------------------------------");
		System.out.println(bss);
		
	
	}
}


class Student{
	public String Name;
	public String Branch;
	public String dob;
	public double diplomaScore;
	public double mhtcetScore;
	static int count=0;
	Student()
	{
		count++;
	}
}


class RegularStudent extends Student{
	static int count=0;
	RegularStudent(String Name, String Branch,String dob,double mhtcetScore)
	{
		this.Name=Name;
		this.Branch=Branch;
		this.dob=dob;
		this.mhtcetScore=(double)mhtcetScore;
		count++;
		
	}
	public String toString()
	{
		return "Name: "+Name+"\nBranch: "+Branch+"\nDOB: "+dob+"\nMHTCET Score: "+mhtcetScore;	
	}

}
	
	
class DSYStudent extends Student{
	static int count=0;
	DSYStudent(String Name, String Branch,String dob, double diplomaScore)
	{
		this.Name=Name;
		this.Branch=Branch;
		this.dob=dob;
		this.diplomaScore=(double)diplomaScore;
		count++;	
	}
	public String toString()
	{
		return "Name: "+Name+"\nBranch: "+Branch+"\nDOB: "+dob+"\nDiploma Score: "+diplomaScore;	
	}
 }
