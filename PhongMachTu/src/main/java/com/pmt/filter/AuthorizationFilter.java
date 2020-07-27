package com.pmt.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.pmt.Util.SessionUtil;
import com.pmt.model.NguoiDung;

@WebFilter("/*")
public class AuthorizationFilter implements Filter{

	private ServletContext context;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.context = filterConfig.getServletContext();
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURI();
		
		if (url.startsWith("/PhongMachTu/Admin") ||url.startsWith("/PhongMachTu/admin") ) {
			NguoiDung user = (NguoiDung) SessionUtil.getInstance().getValue(req, "USERLOGIN");
			
			if (user != null) {
				if (user.getVaiTro().getId()==1) {
					chain.doFilter(request, response);
				} else {
					//send message
					resp.sendRedirect(req.getContextPath()+"/login");
				}
				
			} else {
				//send message
				resp.sendRedirect(req.getContextPath()+"/login");
			}
			
		} else if (url.startsWith("/PhongMachTu/reception")) {
			
			NguoiDung user = (NguoiDung) SessionUtil.getInstance().getValue(req, "USERLOGIN");
			
			if (user != null) {
				if (user.getVaiTro().getId()==2) {
					chain.doFilter(request, response);
				} else {
					//send message
					resp.sendRedirect(req.getContextPath()+"/login");
				}
				
			} else {
				//send message
				resp.sendRedirect(req.getContextPath()+"/login");
			}
			
		} else if (url.startsWith("/PhongMachTu/Doctor")) {
			NguoiDung user = (NguoiDung) SessionUtil.getInstance().getValue(req, "USERLOGIN");
			
			if (user != null) {
				if (user.getVaiTro().getId()==3) {
					chain.doFilter(request, response);
				} else {
					//send message
					resp.sendRedirect(req.getContextPath()+"/login");
				}
				
			} else {
				//send message
				resp.sendRedirect(req.getContextPath()+"/login");
			}
			
		} else if (url.startsWith("/PhongMachTu/Pharmacies")) {
			NguoiDung user = (NguoiDung) SessionUtil.getInstance().getValue(req, "USERLOGIN");
			
			if (user != null) {
				if (user.getVaiTro().getId()==4) {
					chain.doFilter(request, response);
				} else {
					//send message
					resp.sendRedirect(req.getContextPath()+"/login");
				}
				
			} else {
				//send message
				resp.sendRedirect(req.getContextPath()+"/login");
			}
			
		} else {
			chain.doFilter(request, response);
		}
		
		
	}

}
