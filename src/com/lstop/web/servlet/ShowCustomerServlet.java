package com.lstop.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lstop.exception.CustomerException;
import com.lstop.pojo.Customer;
import com.lstop.service.CustomerService;
import com.lstop.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class ShowCustomerServlet
 */
@WebServlet("/ShowCustomerServlet")
public class ShowCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCustomerServlet() {
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
		CustomerService service = new CustomerServiceImpl();
		try {
			List<Customer> list = service.queryCustomer(page,perpage);
			request.setAttribute("customer_list", list);
			request.setAttribute("pagehide", page);
			request.setAttribute("perpagehide", perpage);
			request.setAttribute("sizehide", (service.countCustomer()+perpage-1)/perpage);
			request.getRequestDispatcher("jsp/customer/list.jsp").forward(request, response);
		} catch (CustomerException e) {
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
