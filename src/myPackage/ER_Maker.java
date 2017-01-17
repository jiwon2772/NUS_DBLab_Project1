
package myPackage;

import java.util.ArrayList;

public class ER_Maker {
	
	public ArrayList<Node> ER1=new ArrayList<Node>();
	
	public ArrayList<Node> getER() {
		Entity employee = new Entity("Employee");
		Entity department = new Entity("Department");
		Entity project = new Entity("Project");
		Entity supplier = new Entity("Supplier");
		Entity part = new Entity("Part");
		
		Relationship join = new Relationship("Join");
		Relationship workFor = new Relationship("WorkFor");
		Relationship sp = new Relationship("SP");
		Relationship spj = new Relationship("SPJ");
		
		employee.addList(0,new Attribute("E#",true,false));//name,key,multi;
		employee.addList(1,new Attribute("Name",false,false));
		employee.addList(2,new Attribute("Salary",false,false));
		employee.addList(3,new Attribute("Hobby",false,true));
		//Employee Entity ����
		
		department.addList(0,new Attribute("D#",true,false));
		department.addList(1,new Attribute("Dname",false,false));
		//Department Entity ����
		
		project.addList(0,new Attribute("J#",true,false));
		project.addList(1,new Attribute("Title",false,false));
		project.addList(2, new Attribute("Budget",false,false));
		//Project Entity ����

		supplier.addList(0,new Attribute("S#",true,false));
		supplier.addList(1,new Attribute("Sname",false,false));
		supplier.addList(2, new Attribute("Address",false,false));
		//Supplier Entity ����
		
		part.addList(0,new Attribute("P#",true,false));
		part.addList(1,new Attribute("Pname",false,false));
		//Part Entity ����
		
		join.addList(0,employee);
		join.addList(1,department);
		join.addList(2,new Attribute("Position",false,false));
		//attribute�� entity�� �߰�(Join)
		
		join.addList_Multi(0, true);//true�� ��Ƽ
		join.addList_Multi(1, false);
		//Join Relationship ����
		
		join.addList(0,employee);
		join.addList(1,project);
		//attribute�� entity�� �߰�(WorkFor)
		
		join.addList_Multi(0, true);//true�� ��Ƽ
		join.addList_Multi(1, true);
		//WorkFor Relationship ����
		
		spj.addList(0,project);
		spj.addList(1,sp);
		spj.addList(2, new Attribute("Quantity",false,false));
		//attribute�� entity�� �߰�(spj)
		
		spj.addList_Multi(0, true);//true�� ��Ƽ
		spj.addList_Multi(1, true);
		//SPJ Relationship ����
		
		sp.addList(0,spj);
		sp.addList(1,supplier);
		sp.addList(2,part);
		sp.addList(3, new Attribute("Price",false,false));
		//attribute�� entity�� �߰�(sp)
		
		sp.addList_Multi(0, true);//true�� ��Ƽ
		sp.addList_Multi(1, true);
		sp.addList_Multi(2, true);
		//SPJ Relationship ����
		
		ER1.add(employee);
		ER1.add(department);
		ER1.add(project);
		ER1.add(supplier);
		ER1.add(part);
		
		ER1.add(join);
		ER1.add(workFor);
		ER1.add(sp);
		ER1.add(spj);
		
		return ER1;
	}
}

