package colleges;

import java.util.Objects;
public class Department implements Comparable
{
	String Sname;
	int Sid;
	String Dept;
	
	public Department(String Sname, int Sid, String Dept)
	{
		this.Sname=Sname;
		this.Sid=Sid;
		this.Dept=Dept;
	}
	
	public String toString()
	{
		return " Student Name: "+Sname+"\n Roll no.: "+Sid+"\n Student Department: "+Dept+"\n";
	}
	
	public boolean equals(Object o)
	{
		Department d1=(Department) o;
		return this.Sname.equals(d1.Sname) || this.Sid==d1.Sid;
	}
	
	public int hashCode()
	{
		return Objects.hash(Sname,Sid);
	}
	
	public int compareTo(Object o)
	{
		Department d1=(Department) o;
		return this.Sname.compareTo(d1.Sname);
	}

}
