package com.xworkz.house.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.house.dao.HouseDAO;
import com.xworkz.house.dao.HouseDAOImpl;
import com.xworkz.house.dto.HouseDTO;

/**
 * Servlet implementation class HouseServlet
 */
@WebServlet("/registration")
public class HouseSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HouseDAOImpl houseDAOImpl;


	public void init() {
		houseDAOImpl=new HouseDAOImpl();
	}


	/**
	 * Default constructor. 
	 */
	public HouseSevlet() { 
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("House.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		register(request, response);
	}
	private void register(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		String name = request.getParameter("name");
		int noOfRooms = Integer.parseInt(request.getParameter("noOfRooms"));
		String location = request.getParameter("location");
		int noOfFloors = Integer.parseInt(request.getParameter("noOfFloors"));
		int sqMeter = Integer.parseInt(request.getParameter("sqMeter"));

		HouseDTO houseDTO = new HouseDTO();
		houseDTO.setName(name);
		houseDTO.setNoOfRooms(noOfRooms);
		houseDTO.setLocation(location);
		houseDTO.setNoOfFloors(noOfFloors);
		houseDTO.setSqMeter(sqMeter);
		
		HouseDAO houseDAOImpl=new HouseDAOImpl();
		houseDAOImpl.insertHouse(houseDTO);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("housesuccess.jsp");
		dispatcher.forward(request, response);

	}

}