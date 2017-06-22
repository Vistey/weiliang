package com.liangjing.www.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 拦截所有用户访问任何html资源
 * 验证用户时候已经登录
 */
public class SessionFilter implements Filter {

  /**
   * 将登录请求转发 (重定向会导致请求死循环)
   * filterChain.doFilter 将请求内容向下传递
   * @param servletRequest 请求内容
   * @param servletResponse 返回内容
   * @param filterChain filter控制器
   */
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse)servletResponse;
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpSession session = request.getSession();
    if (session.getAttribute("idCard") == null || request.getServletPath().equals("/login.html")){
      request.getRequestDispatcher("login.html").forward(request,response);
    }
    filterChain.doFilter(servletRequest,servletResponse);
  }
}


