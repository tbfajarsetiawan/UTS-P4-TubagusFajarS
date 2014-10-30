package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Tubagus.Fajar.DAO.MahasiswaDAO;
import Tubagus.Fajar.model.Mahasiswa;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

    MahasiswaDAO dao = new MahasiswaDAO();
    List<Mahasiswa> list = dao.listMahasiswa();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Form Mahasiswa</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"bs-docs-section\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"page-header\">\n");
      out.write("                            <h1 id=\"forms\">List Mahasiswa</h1>\n");
      out.write("                            <a href=\"FormMahasiswaServlet?action=form-add\" class=\"btn btn-primary btn-xs\">Add Record</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\" id=\"form-add\">\n");
      out.write("                    <div class=\"col-lg-10\">\n");
      out.write("                        <table class=\"table table-bordered table-hover \">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>NPM</th>\n");
      out.write("                                    <th>Nama</th>\n");
      out.write("                                    <th>Tempat Tangal Lahir</th>\n");
      out.write("                                    <th>Jenis Kelamin</th>\n");
      out.write("                                    <th>Alamat</th>\n");
      out.write("                                    <th>Action</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    for (Mahasiswa mhs : list) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(mhs.getNpm());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(mhs.getNama());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(mhs.getTempatTanggalLahir());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(mhs.getJenisKelamin());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(mhs.getAlamat());
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <div class=\"btn-group\">\n");
      out.write("                                            <a href=\"FormMahasiswaServlet?action=edit&id=");
      out.print(mhs.getId());
      out.write("&npm=");
      out.print(mhs.getNpm());
      out.write("\" class=\"btn btn-info btn-xs\" title=\"Edit\">E</a>\n");
      out.write("                                            <a href=\"FormMahasiswaServlet?action=delete&id=");
      out.print(mhs.getId());
      out.write("&npm=");
      out.print(mhs.getNpm());
      out.write("\" class=\"btn btn-danger btn-xs\" title=\"Delete\">D</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table> \n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <script src=\"asset/jquery-1.10.2.min.js\"></script>\n");
      out.write("            <script src=\"asset/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
