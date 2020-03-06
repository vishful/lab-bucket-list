package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.TouristPlace;
import service.ListOperations;


@WebServlet(urlPatterns= {"/map"})
public class MapServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	Map<String,TouristPlace> hash = new HashMap<String,TouristPlace>();
	Map<String,TouristPlace> linkedhash = new LinkedHashMap<String,TouristPlace>();
	Map<String,TouristPlace> tree = new TreeMap<String,TouristPlace>();
	Map<String,TouristPlace> hash1 = new HashMap<String,TouristPlace>();
	Map<String,TouristPlace> linkedhash1 = new LinkedHashMap<String,TouristPlace>();
	Map<String,TouristPlace> tree1 = new TreeMap<String,TouristPlace>();
	//List<String> studentList2 = new ArrayList<String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");
		
		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");
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

		if(remove!=null) {
			bucketList = placeList.remove(places);
			request.setAttribute("bucketListremove", bucketList);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		
		if(sortbydestination!=null) {
			System.out.println(bucketList);
			request.setAttribute("bucketList", placeList.sortByDestination(bucketList));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(sortbyrank!=null) {
			System.out.println(bucketList);
			request.setAttribute("bucketList", placeList.sortByRank(bucketList));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(reset!=null) {	
			request.setAttribute("bucketList", placeList.clear(bucketList));
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

