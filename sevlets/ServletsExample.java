package sevlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletsExample
 */
public class ServletsExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletsExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter pw=response.getWriter();	
	response.setContentType("text/html");
//	pw.println("<div>welcome</div>");
	
	pw.println("<h1>REGISTRATION SUCCESSFULL</h1>");
//	pw.println("<b>java</b>");
	
	String name=request.getParameter("name");
	System.out.println(name);
	String firstname1=request.getParameter("name");
	String lastname2=request.getParameter("lname");
	String email3=request.getParameter("email");
	String mobile4=request.getParameter("mobile");
//	System.out.println(firstname1);
	
	RegestrationDetails obj=new RegestrationDetails();
	
	RegistrationJdbc obj1=new RegistrationJdbc();
	obj.setFirstname(firstname1);
	obj.setLastname(lastname2);
	obj.setEmail(email3);
	obj.setMobile(mobile4);
	try {
		 obj1.insert(obj);
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
