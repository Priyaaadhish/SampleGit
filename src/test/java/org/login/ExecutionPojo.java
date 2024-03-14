package org.login;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExecutionPojo {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	FileReader fr = new  FileReader(new File("D:\\New Eclipse\\Workspace1\\SampleJSON\\src\\test\\resources\\Sample.json"));
    ObjectMapper objectMapper = new ObjectMapper();
    Root readValue = objectMapper.readValue(fr, Root.class);
    System.out.println(readValue.getName());
    System.out.println(readValue.getAge());
    System.out.println(readValue.isStatus());
    System.out.println(readValue.getName());
    
    Address address = readValue.getAddress();
    System.out.println(address.getCity());
    System.out.println(address.getState());
    System.out.println(address.getPincode());
    
    ArrayList<String> courses = readValue.getCourses();
    for(int i=0;i<courses.size();i++) {
    	 System.out.println(courses.get(i));
    }

}
}
