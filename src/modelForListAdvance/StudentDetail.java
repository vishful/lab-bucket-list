package modelForListAdvance;

public class StudentDetail {
	private String studentName;
	private String studentId;
	private String department;
	private String grade;

	

	public StudentDetail(String studentName, String studentId, String department, String grade) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
		this.grade = grade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
