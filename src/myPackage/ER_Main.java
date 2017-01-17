package myPackage;

import java.util.ArrayList;

public class ER_Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Node> er1=new ER_Maker().getER();
		for(int i=0;i<er1.size();i++)
		{
			System.out.println(er1.get(i).getName());
		}
	}

}
