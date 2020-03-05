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

import model.TouristPlace;
import service.ListOperations;


@WebServlet(urlPatterns= {"/list"})
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<TouristPlace> bucketList = new ArrayList<TouristPlace>();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		
		String add = request.getParameter("add");
/*		String remove = request.getParameter("remove");
		String view = request.getParameter("view");
		String ascending = request.getParameter("ascending");
		String descending = request.getParameter("descending");
		String clear = request.getParameter("clear");
		String next = request.getParameter("next");*/
		System.out.println("Entering into list");
		TouristPlace places = new TouristPlace(name,destination,rank);
		ListOperations placeList = new ListOperations();
		
		if(add!=null) {
			System.out.println("add not equals to null");
			bucketList = placeList.add(places);
			System.out.println(bucketList);
			request.setAttribute("bucketListadd", bucketList);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
//
//		if(remove!=null) {
//			studentList1 = student.remove(studentName);
//			request.setAttribute("studentListremove", studentName);
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
//			rd.forward(request, response);
//		}
//
//		if(view!=null) {
//			System.out.println(studentList1);
//			request.setAttribute("studentList", studentList1);
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
//			rd.forward(request, response);
//		}
//
//		if(ascending!=null) {
//			System.out.println(studentList1);
//			request.setAttribute("studentList", student.ascending(studentList1));
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
//			rd.forward(request, response);
//		}
//
//		if(descending!=null) {
//			System.out.println(studentList1);
//			request.setAttribute("studentList", student.descending(studentList1));
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
//			rd.forward(request, response);
//		}
//
//		if(clear!=null) {	
//			request.setAttribute("studentListclear", student.clear(studentList1));
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
//			rd.forward(request, response);
//		}
//
//		if(next!=null) {
//			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/listadvance.jsp");
//			rd.forward(request, response);
//		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
