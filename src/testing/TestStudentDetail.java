package testing;

import org.junit.Test;
import static org.junit.Assert.*;
import modelForListAdvance.StudentDetail;

public class TestStudentDetail {

	StudentDetail sd = new StudentDetail("","","","");

	@Test
	public void testSetDetailMethods() {
		sd.setStudentName("AAA");
		sd.setStudentId("11");
		sd.setDepartment("XXX");
		sd.setGrade("8");
		assertEquals("AAA", sd.getStudentName());
		assertEquals("11", sd.getStudentId());
		assertEquals("XXX", sd.getDepartment());
		assertEquals("8", sd.getGrade());
		try {
			sd.setStudentName(null);
			sd.setStudentId(null);
			sd.setDepartment(null);
			sd.setGrade(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
