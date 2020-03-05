package testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;
import org.junit.Test;

import model.StudentBasicDetail;

public class TestStudentBasicDetail {
	Map<String,String> hm = new HashMap<String,String>();
	Map<String,String> lhm = new LinkedHashMap<String,String>();
	Map<String,String> tm = new TreeMap<String,String>();
	Map<String,String> hm1 = new HashMap<String,String>();
	Map<String,String> lhm1 = new LinkedHashMap<String,String>();
	Map<String,String> tm1 = new TreeMap<String,String>();
	StudentBasicDetail sbd = new StudentBasicDetail();
	
	@Test
	public void testSetDetailMethods() {
		sbd.setId("12");
		sbd.setName("Rahul");
		assertEquals("12",sbd.getId());
		assertEquals("Rahul",sbd.getName());
		try {
			sbd.setId(null);
			sbd.setName(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddMethod() {
		hm.put("12","Rahul");
		lhm.put("12","Rahul");
		tm.put("12","Rahul");
		assertEquals(hm,sbd.add("12", "Rahul"));
		hm.put("09", "Keerthi");
		lhm.put("09", "Keerthi");
		tm.put("09", "Keerthi");
		assertEquals(hm,sbd.add("09", "Keerthi"));
		hm.put("", "");
		lhm.put("", "");
		tm.put("", "");
		assertEquals(hm,sbd.add("", ""));
		try {
			sbd.add("", "");
			sbd.add("11", "");
			sbd.add("", "Priya");
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testHashMapMethod() {
		hm1 = hm;
		assertEquals(hm1,sbd.HashMap(hm));
		try {
			sbd.HashMap(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLinkedHashMap() {
		lhm1 = lhm;
		assertEquals(lhm1,sbd.LinkedHashMap(lhm));
		try {
			sbd.LinkedHashMap(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTreeMap() {
		tm1 = tm;
		assertEquals(tm1,sbd.TreeMap(tm));
		try {
			sbd.TreeMap(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testClearMethod() {
		hm1 = hm;
		lhm1 = lhm;
		tm1 = tm;
		hm1.clear();
		tm1.clear();
		lhm1.clear();
		assertEquals(hm1,sbd.clear(hm));
		assertEquals(lhm1,sbd.clear(lhm));
		assertEquals(tm1,sbd.clear(tm));
		try {
			sbd.clear(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
