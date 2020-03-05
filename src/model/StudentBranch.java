package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class StudentBranch {
	private String branch;

	List<String> studentList1 = new ArrayList<String>();
	HashSet<String> hs = new HashSet<String>();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	TreeSet<String> ts = new TreeSet<String>();
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public  Object HashSet(List<String> branch) {
		Iterator<String> itr = branch.iterator();
		while(itr.hasNext()){
			hs.add(itr.next());
		}
		return hs; 
	}

	public  Object LinkedHashSet(List<String> branch) {
		Iterator<String> itr = branch.iterator();
		while(itr.hasNext()){
			lhs.add(itr.next());
		}
		return lhs; 
	}

	public  Object TreeSet(List<String> branch) {
		Iterator<String> itr = branch.iterator();
		while(itr.hasNext()){
			ts.add(itr.next());
		}
		return ts; 
	}

	public  List<String> add(String branch) {
		studentList1.add(branch);
		return studentList1; 
	}

	public  List<String> remove(String branch) {
		studentList1.remove(branch);
		System.out.println(studentList1);
		return studentList1; 
	}

}
