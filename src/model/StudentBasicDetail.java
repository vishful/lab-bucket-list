package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentBasicDetail {
	private String id;
	private String name;

	Map<String,String> hash = new HashMap<String,String>();
	Map<String,String> linkedhash = new LinkedHashMap<String,String>();
	Map<String,String> tree = new TreeMap<String,String>();

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> add(String id, String name) {
		hash.put(id, name);
		linkedhash.put(id, name);
		tree.put(id, name);
		return hash; 
	}
	public Map<String, String> clear(Map<String, String> hash1) {
		hash.clear();
		linkedhash.clear();
		tree.clear();
		return hash; 
	}
	public Object HashMap(Map<String, String> hash2) {
		String key = null;
		String value = null;

		for (Map.Entry<String,String> entry : hash.entrySet()) //using map.entrySet() for iteration  
		{  
			key = entry.getKey();
			value = entry.getValue();
			System.out.println("Student Id: " + key + " Student Name: " + value);
			//System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}   
		return hash;
	}
	public Object LinkedHashMap(Map<String, String> linkedhash2) {
		String key = null;
		String value = null;

		for (Map.Entry<String,String> entry : linkedhash.entrySet()) //using map.entrySet() for iteration  
		{  
			key = entry.getKey();
			value = entry.getValue();
			System.out.println("Student Id: " + key + " Student Name: " + value);
			//System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}   
		return linkedhash;
	}
	public Object TreeMap(Map<String, String> tree2) {
		String key = null;
		String value = null;

		for (Map.Entry<String,String> entry : tree.entrySet()) //using map.entrySet() for iteration  
		{  
			key = entry.getKey();
			value = entry.getValue();
			System.out.println("Student Id: " + key + " Student Name: " + value);
			//System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}   
		return tree;
	}

}
