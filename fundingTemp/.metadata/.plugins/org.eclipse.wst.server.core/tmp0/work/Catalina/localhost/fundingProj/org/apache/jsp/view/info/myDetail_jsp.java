/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-09-05 05:42:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1660185375234L));
    _jspx_dependants.put("jar:file:/D:/program/fundingTemp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/fundingProj/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\r\n");
      out.write("\r\n");
 String nickname = (String)request.getSession().getAttribute("nickname"); 


      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#perBtn\").on(\"click\", function() {\r\n");
      out.write("			if(");
      out.print(nickname !=null);
      out.write("){\r\n");
      out.write("			$(\"#per\").css('display', 'block')				\r\n");
      out.write("			}else{\r\n");
      out.write("				alert(\"로그인 후 이용 가능합니다.\")\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$(function() {\r\n");
      out.write("		var num = parseInt($(\"#perText\").val());\r\n");
      out.write("		var pp = parseInt($(\"#pp\").val());\r\n");
      out.write("	\r\n");
      out.write("		var price = pp;\r\n");
      out.write("		$(\"#plus\").on(\"click\", function(e) {\r\n");
      out.write("			num = num + 1;\r\n");
      out.write("			price = num * pp\r\n");
      out.write("			$('input[name=personnel]').attr('value', num)\r\n");
      out.write("			$('input[name=price]').attr('value', price)\r\n");
      out.write("			console.log(price)\r\n");
      out.write("			e.preventDefault()\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("		$(\"#minus\").on(\"click\", function(e) {\r\n");
      out.write("			if (num > 0) {\r\n");
      out.write("				num = num - 1;\r\n");
      out.write("				price = num * pp\r\n");
      out.write("				console.log(price)\r\n");
      out.write("				$('input[name=personnel]').attr('value', num)\r\n");
      out.write("				$('input[name=price]').attr('value', price)\r\n");
      out.write("			} else {\r\n");
      out.write("				price = num * pp\r\n");
      out.write("				console.log(price)\r\n");
      out.write("				num = 0;\r\n");
      out.write("\r\n");
      out.write("				$('input[name=personnel]').attr('value', num)\r\n");
      out.write("				$('input[name=price]').attr('value', price)\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			e.preventDefault()\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"productDetail\">\r\n");
      out.write("	<table class=\"tableBasic\" border=\"\">\r\n");
      out.write("		<colgroup>\r\n");
      out.write("			<col width=\"200px\" />\r\n");
      out.write("			<col width=\"auto\" />\r\n");
      out.write("		</colgroup>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>회사명</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.company}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th id = \"title\">제품명</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>닉네임</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.nickname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>제품소개</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.wname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>소개</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>목표금액</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.targetamount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>가격</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>현재모금액</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.price*dto.personnel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>날짜</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.reg_dateStr }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>조회수</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.cnt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>	\r\n");
      out.write("	</table>\r\n");
      out.write("			<div class=\"buttonArea\">\r\n");
      out.write("				<a href=\"MyInquiry?title=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">문의</a>\r\n");
      out.write("				<button id=\"perBtn\">구매</button> \r\n");
      out.write("				<a href=\"MyList\">뒤로가기</a> \r\n");
      out.write("			</div>\r\n");
      out.write("	<form action=\"Payment\">\r\n");
      out.write("		<div id=\"per\">\r\n");
      out.write("			<div class=\"amountArea\">	\r\n");
      out.write("				<fieldset>		\r\n");
      out.write("					<legend>수량</legend>\r\n");
      out.write("					<input type=\"text\" id=\"perText\" name=\"personnel\" value=\"1\" readonly />\r\n");
      out.write("					<button id=\"plus\">+</button>\r\n");
      out.write("					<button id=\"minus\">-</button>	\r\n");
      out.write("				</fieldset>\r\n");
      out.write("				<fieldset>	\r\n");
      out.write("					<legend>가격</legend>\r\n");
      out.write("					<input type=\"text\" id=\"pp\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly />\r\n");
      out.write("					<input type=\"text\"  name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" hidden />\r\n");
      out.write("				</fieldset>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"buttonArea\">\r\n");
      out.write("				<input type=\"submit\" id = \"payment\" value =\"결제\" />\r\n");
      out.write("			</div>		\r\n");
      out.write("		</div>	\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    ");
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