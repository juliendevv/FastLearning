

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Annonce
 */
@WebServlet("/annonce")
public class Annonce extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Annonce() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init()throws ServletException{
    	// TODO Auto-generated constructor stub
    	super.init();
    	System.err.println("coucou");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/WEB-INF/annonce.jsp" ).forward( request, response );
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
	    //response.setCharacterEncoding( "UTF-8" );
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
