package com;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		System.out.println("jhgf");
		int status;
		if(action.equals("Submit")){
			StudentDAO dao = new StudentDAO();

			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			
			String address = request.getParameter("address");
			String gender=request.getParameter("sex");
			String course=request.getParameter("course");
			String department=request.getParameter("department");
			Student student = new Student(fname, lname, address,gender,course,department);
			
		 status= dao.addStudent(student);
		if (status == 0) {
			PrintWriter out = response.getWriter();
			out.print("<html><body><b>Student Added Sucessfully<b></body></html>");
		}
		else{
			status=1;
			 if(status==-1){
					PrintWriter out = response.getWriter();
					out.print("<html><body><b>Error<b></body></html>");
				}
		}
		}
		 

		
	}

}
