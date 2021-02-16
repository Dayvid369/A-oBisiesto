package bisiestoWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import curso.servlets04.atributos.Alumno;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/bisiesto")
public class Bisiesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bisiesto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Integer year = Integer.parseInt(request.getParameter("numero"));

		
	String resultado = null;
	if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
		System.out.println("El año es bisiesto");
	resultado="El año es bisiesto";
	request.setAttribute("result", resultado.toString());	
	request.getRequestDispatcher("/jsp/bisiesto/index.jsp").forward(request, response);
	
	}else {
		System.out.println("El año no es bisiesto");
	resultado="El año no es bisiesto";
	request.setAttribute("result", resultado.toString());	
	request.getRequestDispatcher("/jsp/bisiesto/index.jsp").forward(request, response);
	}

	
	
}
		


}
