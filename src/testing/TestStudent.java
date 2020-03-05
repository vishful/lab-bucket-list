//package testing;
//
//import model.Student;
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import org.junit.Test;
//
//public class TestStudent {
//	List<String> temp = new ArrayList<String>();
//	List<String> temp1 = new ArrayList<String>();
//	Student student = new Student();
//
//	@Test
//	public void testSetStudentName() {
//		student.setStudentName("Kavya");
//		assertEquals("Kavya", student.getStudentName());
//		try {
//			student.setStudentName(null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testAddMethod() {
//		temp.add("Java");
//		assertEquals(temp, student.add("Java"));
//		temp.add("Program");
//		assertEquals(temp, student.add("Program"));
//		temp.add("");
//		assertEquals(temp, student.add(""));
//		try {
//			// temp.add(null);
//			student.add(null);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testRemoveMethod() {
//		temp.remove("Java");
//		assertEquals(temp, student.remove("Java"));
//		temp.remove("");
//		assertEquals(temp, student.remove(""));
//		try {
//			// temp.remove(null);
//			student.remove(null);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testAscendingMethod() {
//		temp1 = temp;
//		System.out.println(temp1);
//		Collections.sort(temp1);
//		assertEquals(temp1, student.ascending(temp));
//		try {
//			temp = null;
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testDescendingMethod() {
//		temp1 = temp;
//		System.out.println(temp1);
//		Collections.sort(temp1);
//		Collections.reverse(temp1);
//		assertEquals(temp1, student.descending(temp));
//		try {
//			temp = null;
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testClearMethod() {
//		temp.clear();
//		temp1.clear();
//		assertEquals(temp1, student.clear(temp));
//		try {
//			temp = null;
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//}
