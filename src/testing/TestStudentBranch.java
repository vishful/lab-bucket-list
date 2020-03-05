package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.junit.Test;
import static org.junit.Assert.*;
import model.StudentBranch;

public class TestStudentBranch {
	
	List<String> temp = new ArrayList<String>();
	HashSet<String> hs = new HashSet<String>();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	TreeSet<String> ts = new TreeSet<String>();
	HashSet<String> hs1 = new HashSet<String>();
	LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
	TreeSet<String> ts1 = new TreeSet<String>();
	StudentBranch sb = new StudentBranch();
	
	@Test
	public void testAddMethod() {
		temp.add("ece");
		assertEquals(temp,sb.add("ece"));
		temp.add("civil");
		assertEquals(temp,sb.add("civil"));
		temp.add("");
		assertEquals(temp,sb.add(""));
		try {
			sb.add(null);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRemoveMethod() {
		temp.remove("ece");
		assertEquals(temp,sb.remove("ece"));
		temp.remove("eee");
		assertEquals(temp,sb.remove("eee"));
		try {
			sb.remove(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testHashSetMethod() {
		hs.addAll(temp);
		assertEquals(hs,sb.HashSet(temp));
		try {
			hs = null;
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLinkedHashSetMethod() {
		lhs.addAll(temp);
		assertEquals(lhs,sb.LinkedHashSet(temp));
		try {
			lhs = null;
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTreeSetMethod() {
		ts.addAll(temp);
		assertEquals(ts,sb.TreeSet(temp));
		try {
			ts = null;
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
