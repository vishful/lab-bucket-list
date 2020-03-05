package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelForListAdvance.StudentDetail;
import modelForListAdvance.StudentDetailList;

@WebServlet(urlPatterns = { "/listadvance" })
public class ListAdvanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDetailList studentdetaillist = new StudentDetailList();

	List<StudentDetail> studentDetailList = new ArrayList<StudentDetail>();
	List<StudentDetail> byName = new ArrayList<StudentDetail>();
	List<StudentDetail> byId = new ArrayList<StudentDetail>();
	List<StudentDetail> byGrade = new ArrayList<StudentDetail>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("Entering list advance do get");

		String studentName = request.getParameter("name");
		String studentId = request.getParameter("id");
		String department = request.getParameter("dept");
		String grade = request.getParameter("grade");
		String add = request.getParameter("add");
		String sortByName = request.getParameter("sortname");
		String sortById = request.getParameter("sortid");
		String sortByGrade = request.getParameter("sortgrade");
		String next = request.getParameter("next");

		StudentDetail studentdetail = new StudentDetail(studentName, studentId, department, grade);
		studentdetail.setStudentName(studentName);
		studentdetail.setStudentId(studentId);
		studentdetail.setDepartment(department);
		studentdetail.setGrade(grade);

		if (add != null) {
			studentDetailList = studentdetaillist.addDetails(studentdetail);
			System.out.println(studentDetailList);
			request.setAttribute("added", studentdetail);
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
			rd.forward(request, response);
		}

		if (sortByName != null) {
			// System.out.println(studentDetailList);
			byName = studentdetaillist.sortName(studentDetailList);
			// System.out.println(byName);
			request.setAttribute("studentDetail", byName);
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
			rd.forward(request, response);
		}

		if (sortById != null) {
			byId = studentdetaillist.sortId(studentDetailList);
			request.setAttribute("studentDetail", byId);
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
			rd.forward(request, response);
		}

		if (sortByGrade != null) {
			byGrade = studentdetaillist.sortGrade(studentDetailList);
			request.setAttribute("studentDetail", byGrade);
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
			rd.forward(request, response);
		}

		if (next != null) {
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}