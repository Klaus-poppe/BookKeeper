package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Book;
import Model.Dao;
import Model.User;

/**
 * Servlet implementation class HomeController - Page after Login
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		Book b;
		Dao db = new Dao();
		if(button.equals("Add"))
		{
				RequestDispatcher view = request.getRequestDispatcher("AddBook.jsp");
				view.forward(request, response);
		}
		else if(button.equals("Delete"))
		{
			RequestDispatcher view = request.getRequestDispatcher("DeleteBook.jsp");
			view.forward(request, response);
		}
		else if(button.equals("SearchBook"))
		{
			String book=request.getParameter("t1");
			Boolean flag = db.searchBook(book);
			if(flag)
			{
				RequestDispatcher view = request.getRequestDispatcher("view.jsp");
				view.forward(request, response);
			}
		}
		else if(button.equals("SearchAuthor"))
		{
			String author=request.getParameter("t2");
			Boolean flag = db.searchBook(author);
			if(flag)
			{
				RequestDispatcher view = request.getRequestDispatcher("view.jsp");
				view.forward(request, response);
			}
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
