package myPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.*;
import org.json.simple.JSONObject;
public class ER_Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		JSONObject obj=null;
		
		try {
			obj = (JSONObject)parser.parse(new FileReader("C:/Users/Jayden/workspace/DBProject/src/myPackage/node.json"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Node> er1=new ER_Maker().getER();
		ArrayList<Node> er2=new ER_Maker().getER(obj);
	}

}
