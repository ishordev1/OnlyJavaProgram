package collage_project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sun.net.httpserver.Filter.Chain;

public class filter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Type cast servletRequest into HttpRequest and store in variable
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession s=req.getSession();
String ses	= (String)s.getAttribute("check_session");

		if(ses !=null && ses.equals("ishor")) {
			chain.doFilter(request,response);
		}
		else {
		RequestDispatcher rd=request.getRequestDispatcher("login_fail_error.jsp");
		rd.forward(request, response);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

}
