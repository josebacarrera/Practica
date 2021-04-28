package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Categoria;
import modelo.dao.CategoriaModelo;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CategoriaModelo cm = new CategoriaModelo();
		
		
		//borrar
		if(request.getParameter("id_borrar") != null) {
			
			cm.delete(Integer.parseInt(request.getParameter("id_borrar")));
		}
		
		
		//insertar-añadir
		if(request.getParameter("form_insertar") != null) {
			
			Categoria c = new Categoria();
			
			c.setId(Integer.parseInt(request.getParameter("nombre_cat")));
			
			c.setNombre(request.getParameter("nombre_cat"));
			
			c.setColor(request.getParameter("nombre_cat"));
			
			cm.insert(c);
		}
		
		//editar
		if(request.getParameter("form_editar") != null) {
			
			Categoria c = new Categoria();
			
			c.setId(Integer.parseInt(request.getParameter("nombre_cat")));
			
			c.setNombre(request.getParameter("nombre_cat"));
			
			c.setColor(request.getParameter("nombre_cat"));
			
			cm.update(c);
		}
		
		request.setAttribute("ListaCategoria", cm.selectAll());
		
		request.getRequestDispatcher("Index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
