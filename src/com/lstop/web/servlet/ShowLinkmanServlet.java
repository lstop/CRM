package com.lstop.web.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ShowLinkmanServlet
 */
@WebServlet("/ShowLinkmanServlet")
public class ShowLinkmanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLinkmanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int page = request.getParameter("page")==null?1:new Integer(request.getParameter("page"));
		int perpage = request.getParameter("page")==null?2:new Integer(request.getParameter("perpage"));

		ContactService  service  =new ContactServiceImpl();
		try {
			List<Contact> list = service.queryContact(page,perpage);
			request.setAttribute("contact_list", list);
			request.setAttribute("pagehide", page);
			request.setAttribute("perpagehide", perpage);
			request.setAttribute("sizehide", (service.countContact()+perpage-1)/perpage);
			request.getRequestDispatcher("jsp/linkman/list.jsp").forward(request, response);
			
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
