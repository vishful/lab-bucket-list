package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import modelForListAdvance.StudentDetail;
import modelForListAdvance.StudentDetailList;

public class TestStudentDetailList {
	List<StudentDetail> list = new ArrayList<StudentDetail>();
	List<StudentDetail> list1 = new ArrayList<StudentDetail>();
	StudentDetail studentdetail;
	StudentDetailList sdl = new StudentDetailList();

	@Test
	public void testAddDetailMethod() {
		StudentDetail studentdetail = new StudentDetail("AAA", "12", "XXX", "8");
		list.add(studentdetail);
		assertEquals(list, sdl.addDetails(studentdetail));
		StudentDetail studentdetail1 = new StudentDetail("AAA", "12", "XXX", "8");
		list.add(studentdetail1);
		assertEquals(list, sdl.addDetails(studentdetail1));
		try {
			StudentDetail sd1 = new StudentDetail(null, "12", "XXX", "8");
			sdl.addDetails(sd1);
			StudentDetail sd2 = new StudentDetail("AAA", null, "XXX", "8");
			sdl.addDetails(sd2);
			StudentDetail sd3 = new StudentDetail("AAA", "12", null, "8");
			sdl.addDetails(sd3);
			StudentDetail sd4 = new StudentDetail("AAA", "12", "XXX", null);
			sdl.addDetails(sd4);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSortNameMethod() {
		StudentDetail studentdetail = new StudentDetail("AAA", "12", "XXX", "8");
		list.add(studentdetail);
		list1.add(studentdetail);
		StudentDetail studentdetail1 = new StudentDetail("AAA", "12", "XXX", "8");
		list.add(studentdetail1);
		list1.add(studentdetail1);
		Comparator<StudentDetail> cm1 = Comparator.comparing(StudentDetail::getStudentName);
		Collections.sort(list, cm1);
		assertEquals(list, sdl.sortName(list1));
	}
}
