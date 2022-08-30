package OOPs_Concepts;

public class Encapsulation {

	public static void main(String[] args) {
//encapsulation means hiding the data from unauthorized access 
//using Encapsulation we can give Read-only or Write-Only and both Read and Write access
		
		employee e=new employee();
		e.setEmpid(5103);
		e.setEmpname("Akshaya");
		System.out.println("Employee id is "+e.getEmpid()+" and name is "+e.getEmpname());	
	}
}

class employee{
	private int Empid;
	private String Empname;
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		this.Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		this.Empname = empname;
	}
}
