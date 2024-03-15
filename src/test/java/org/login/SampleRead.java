package org.login;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleRead {
public static void main(String[] args) throws IOException, ParseException {
	FileReader fr=new FileReader(new File("D:\\New Eclipse\\Workspace1\\SampleJSON\\src\\test\\resources\\Sample.json"));
    JSONParser j=new JSONParser();
    Object parse = j.parse(fr);
    JSONObject jsonObject=(JSONObject)parse;
    System.out.println(jsonObject.get("name"));
    System.out.println(jsonObject.get("age"));
    System.out.println(jsonObject.get("status"));
    System.out.println(jsonObject.get("address"));
    System.out.println(jsonObject.get("courses"));
    
    System.out.println("dev changed the codeline 23");
    System.out.println("updated code ");
}
}
