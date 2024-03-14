package org.login;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fr=new FileReader(new File("D:\\New Eclipse\\Workspace1\\SampleJSON\\src\\test\\resources\\Sample1.json"));
	    JSONParser j=new JSONParser();
	    Object parse = j.parse(fr);
	    JSONObject jsonObject=(JSONObject)parse;
	    System.out.println(jsonObject.get("id"));
	    System.out.println(jsonObject.get("type"));
	    System.out.println(jsonObject.get("name"));
	    System.out.println(jsonObject.get("ppu"));
	    Object object = jsonObject.get("batters");
	    JSONObject jsonObject2=(JSONObject)object;
	    //batter
	    Object object2 = jsonObject2.get("batter");
	    JSONArray jsonArray = (JSONArray)object2;
	    for(int i=0;i<jsonArray.size();i++) {
	    	Object object3 = jsonArray.get(i);
	    	JSONObject jsonObject3 = (JSONObject)object3;
	    	System.out.println(jsonObject3.get("id")+" " + jsonObject3.get("type"));
	    	
	    }
	    
	    //topping
	    Object object4 = jsonObject.get("topping");
	    JSONArray jsonArray2 = (JSONArray)object4;
	    for(int i=0;i<jsonArray2.size();i++) {
	    	Object object5 = jsonArray2.get(i);
	    	JSONObject jsonObject4 = (JSONObject)object5;
	    	System.out.println(jsonObject4.get("id")+" " + jsonObject4.get("type"));
	    }
	    
}
}
