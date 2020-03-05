package modelForListAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDetailList {
	StudentDetail studentdetail;
	static List<StudentDetail> list = new ArrayList<StudentDetail>();
//	static List<StudentDetail> list2 = new ArrayList<StudentDetail>();

	public List<StudentDetail> addDetails(StudentDetail studentdetail) {
		list.add(studentdetail);
		for (StudentDetail st : list) {
			System.out.println(st.getStudentName());
		}
		return list;
	}

	public List<StudentDetail> sortName(List<StudentDetail> studentDetailList) {
		Comparator<StudentDetail> cm1 = Comparator.comparing(StudentDetail::getStudentName);
		// System.out.println();
		Collections.sort(list, cm1);
		// System.out.println(list);
		/*
		 * for(StudentDetail st:list) { //System.out.println(st.getStudentName()); }
		 */
		return list;
	}

	public List<StudentDetail> sortId(List<StudentDetail> studentDetailList) {
		Comparator<StudentDetail> cm1 = Comparator.comparing(StudentDetail::getStudentId);
		Collections.sort(list, cm1);
		return list;
	}

	public List<StudentDetail> sortGrade(List<StudentDetail> studentDetailList) {
		Comparator<StudentDetail> cm1 = Comparator.comparing(StudentDetail::getGrade);
		Collections.sort(list, cm1);
		return list;
	}
}
