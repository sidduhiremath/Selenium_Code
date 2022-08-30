package Java_Assessement;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;

public class Assessment_1 {
	static Scanner sc=new Scanner(System.in);
	Map<String, String> name=new java.util.HashMap<String, String>();
	Map<String, String> salary=new java.util.HashMap<String, String>();
	Map<String, String> exp=new java.util.HashMap<String, String>();
	
	public static void main(String args[])  throws Exception{		
		Assessment_1 as=new Assessment_1();
			while(true) {
			System.out.println("1.Add 2.View  3.Update  4.Delete 5.Export 6.Exit ");
			System.out.println();
		System.out.println("Enter your choice");
			int ch= sc.nextInt();
			switch(ch) {
			case 1: as.add();
			break;
			case 2: as.View();
			break;
			case 3: as.update();
			break;
			case 4: as.Delete();
			break;
			case 5:as.export();
			break;
			case 6: System.out.println("Thank you...."); 
				    System.exit(0);
			break;
			}		
			}
	}

void add() {
	System.out.println("Enter id");
	String id=sc.next();
	
		if(name.containsKey(id)) {
			System.out.println("Record already exist...");
}
		else {
			System.out.println("Enter name");
			String ename=sc.next();
			sc.nextLine();
			System.out.println("Enter Salary");
			String esal=sc.nextLine();
			System.out.println("Enter Experience");
			String eexp=sc.next();
			name.put(id, ename);
			salary.put(id, esal);
			exp.put(id, eexp);
			System.out.println("Record added successfully");
		}
}

	void View() {
		if(name.isEmpty()) {
			System.out.println("No records to display...");
		}
		for (String key:name.keySet()) {
			System.out.println("Id: "+key);
			System.out.println("Name: "+name.get(key));	
			System.out.println("Salary: "+salary.get(key));
			System.out.println("Experience: "+exp.get(key));
			System.out.println();			
		}
	}
	
	void update() {
		if(name.isEmpty()) {
			System.out.println("No records to display...");
		}
		System.out.println("Enter the id u want to update");
		String id=sc.next();
		if(name.containsKey(id) && salary.containsKey(id) && exp.containsKey(id)) {
		System.out.println("Enter new salary and Experience");
		String nsal=sc.next();
		String nexp=sc.next();
		salary.put(id,nsal);
		exp.put(id,nexp);
		System.out.println("Record Updated Successfully...!");
		}
		else {
			System.out.println("Record not Exist..!");
		}
	}
	
	void Delete() {
		System.out.println("Enter the Employes id to delete!");
		String id= sc.next();
		if(name.containsKey(id)) {
		name.remove(id);
		salary.remove(id);
		exp.remove(id);
		System.out.println("Record deleted successfully...!");
}
else{
	System.out.println("Record not Exist..!");
}
		}
	void export() throws Exception {
		File f=new File("C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Java Codes\\Data.txt");
		FileWriter fw=new FileWriter(f);
		for(String k:name.keySet()) {
			fw.write(k);
			fw.write(" ");
			fw.write(name.get(k));
			fw.write(" ");
			fw.write(salary.get(k));
			fw.write(" ");
			fw.write(exp.get(k));
			System.out.println();
}
		System.out.println("Data Exported Successfully");
	fw.close();	
	}
	
	
	}