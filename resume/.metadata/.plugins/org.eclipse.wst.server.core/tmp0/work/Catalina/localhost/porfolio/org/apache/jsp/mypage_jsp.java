/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2018-01-11 07:53:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Polar porfolio</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css?v=0\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"lib/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"https://rendro.github.io/easy-pie-chart/javascripts/jquery.easy-pie-chart.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(function() {\r\n");
      out.write("\t\r\n");
      out.write("\t//scroll 메뉴바 show, hide\r\n");
      out.write("\t$(window).scroll(function () {\r\n");
      out.write("        if ($(this).scrollTop() > 900) {\r\n");
      out.write("            $('.menu_area').fadeIn();\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.menu_area').fadeOut();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    // logo click => menu bar hide\r\n");
      out.write("    /* $('#logo').click(function () {\r\n");
      out.write("        $('body,html').animate({\r\n");
      out.write("            scrollTop: 0\r\n");
      out.write("        }, 800);\r\n");
      out.write("        return false;\r\n");
      out.write("    });\r\n");
      out.write("\t */\r\n");
      out.write("\t\r\n");
      out.write("\t//chart\r\n");
      out.write("\t  $('.chart').easyPieChart({\r\n");
      out.write("\t    scaleColor: \"#ecf0f1\",\r\n");
      out.write("\t    lineWidth: 20,\r\n");
      out.write("\t    lineCap: 'butt',\r\n");
      out.write("\t    barColor: '#7C7877',\r\n");
      out.write("\t    trackColor:\t\"#ecf0f1\",\r\n");
      out.write("\t    size: 250,\r\n");
      out.write("\t    animate: 500\r\n");
      out.write("\t  });\r\n");
      out.write("\t\r\n");
      out.write("\t//하단 화살표이동\r\n");
      out.write("    $('.scroll-down').click (function(){\r\n");
      out.write("      $('html, body').animate({scrollTop: $('.about_content').offset().top }, 'slow');\r\n");
      out.write("      return false;\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("<div class=\"whole\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"menu_area\">\r\n");
      out.write("\t\t<div class=\"menu_logo\">\r\n");
      out.write("\t\t\t<a href=\"#header\" class=\"logo\">HYE MIN</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t <ul>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t \t<li><a href=\"#about\">ABOUT ME</a></li>\r\n");
      out.write("\t\t\t \t<li><a href=\"#porfolio\">PORTFOLIO</a></li>\r\n");
      out.write("\t\t\t \t<li><a href=\"#contact\">CONTACT</a></li>\r\n");
      out.write("\t\t\t \t\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"main_title\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"main_txt_top\">Developer</p>\r\n");
      out.write("\t\t\t\t<p class=\"main_txt\">PARK HYE MIN </p>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"#\" class=\"scroll-down\" address=\"true\"></a>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<about id=\"about\">\r\n");
      out.write("\t\t<div class=\"about_content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<p class=\"about_head\">ABOUT ME </p>\r\n");
      out.write("\t\t \t<p class=\"about_title\">안녕하세요. Back-end Developer 박혜민입니다.</p>\r\n");
      out.write("\t\t \t  \r\n");
      out.write("\t\t <div class=\"about_main\">\r\n");
      out.write("\t\t\t<div class=\"about_container\">\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"90\">JAVA</div>\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"65\">Servlet&Jsp</div>\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"70\">CSS3</div>\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"55\">jQuery</div>\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"85\">JavaScript</div>\r\n");
      out.write("\t\t\t  <div class=\"chart\" data-percent=\"90\">Ajax</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"about_link\">\r\n");
      out.write("\t\t\t\t<p style=\"text-align: center;\">저에 대해 더 궁금하신가요?</p> \r\n");
      out.write("\t\t\t\t<div class=\"about_link_a\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://daum.net\" class=\"link\">hm's resume</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t \t \t\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</about>\r\n");
      out.write("\t\r\n");
      out.write("\t<porfolio id=\"porfolio\">\r\n");
      out.write("\t\t<div class=\"porfolio_content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</porfolio>\r\n");
      out.write("\t\r\n");
      out.write("\t<contact id=\"contact\">\r\n");
      out.write("\t\t<div class=\"contact_content\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</contact>\r\n");
      out.write("\t\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"footer_wrap\">\r\n");
      out.write("\t\t\t<p>ⓟ2018.박혜민.all rights reserved.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
