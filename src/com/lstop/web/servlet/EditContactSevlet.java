package com.lstop.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lstop.exception.ContactException;
import com.lstop.pojo.Contact;
import com.lstop.service.ContactService;
import com.lstop.service.impl.ContactServiceImpl;

/**
 * Servlet implementation class EditContactSevlet
 */
@WebServlet("/EditContactSevlet")
public class EditContactSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContactSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long contact_id = new Long(request.getParameter("contact_id"));
		ContactService service = new ContactServiceImpl();
		try {
			Contact contact = service.reshowContact(contact_id);
			request.setAttribute("contact", contact);
			request.getRequestDispatcher("jsp/linkman/edit.jsp").forward(request, response);
		} catch (ContactException e) {
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
