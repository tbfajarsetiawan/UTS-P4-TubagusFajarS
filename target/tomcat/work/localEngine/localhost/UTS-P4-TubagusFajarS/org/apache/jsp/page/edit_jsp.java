package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tubagus.Fajar.DAO.MahasiswaDAO;
import Tubagus.Fajar.model.Mahasiswa;
import java.text.SimpleDateFormat;
import java.util.List;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Mahasiswa mhs = new Mahasiswa();
    MahasiswaDAO dao = new MahasiswaDAO();
    List<Mahasiswa> list = dao.listMahasiswa();
    String pid = request.getParameter("id");
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Form Mahasiswa</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/bootstrap.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/css/datepicker3.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"bs-docs-section\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"page-header\">\n");
      out.write("                            <h1 id=\"forms\">Edit Mahasiswa</h1>\n");
      out.write("                            <a href=\"FormMahasiswaServlet?action=form-add\" class=\"btn btn-primary btn-xs\">Add Record</a>\n");
      out.write("                            <a href=\"FormMahasiswaServlet?action=list-mahasiswa\" class=\"btn btn-primary btn-xs\">View All</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\" id=\"form-add\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"well bs-component\">    \n");
      out.write("                            ");

                                if (!((pid) == null)) {
                                    int id = Integer.parseInt(request.getParameter("id"));
                                    int npm = Integer.parseInt(request.getParameter("npm"));
                                    mhs = dao.cariMahasiswa(id, npm);
                            
      out.write("\n");
      out.write("                            <form class=\"form-horizontal\" method=\"post\" action=\"FormMahasiswaServlet\">\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"update\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"inputId\" readonly=\"readonly\" value=\"");
      out.print(mhs.getId());
      out.write("\">\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputNPM\" class=\"col-lg-3 control-label\">NPM</label>\n");
      out.write("                                        <div class=\"col-lg-9\">\n");
      out.write("                                            <input class=\"form-control\" id=\"inputNPM\" name=\"inputNPM\" value=\"");
      out.print(mhs.getNpm());
      out.write("\" placeholder=\"NPM\" type=\"text\" required=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputNama\" class=\"col-lg-3 control-label\">Nama</label>\n");
      out.write("                                        <div class=\"col-lg-9\">\n");
      out.write("                                            <input class=\"form-control\" id=\"inputNama\" name=\"inputNama\" value=\"");
      out.print(mhs.getNama());
      out.write("\" placeholder=\"Nama\" type=\"text\" required=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputTempatLahir\" class=\"col-lg-3 control-label\">Tempat Lahir</label>\n");
      out.write("                                        <div class=\"col-lg-9\">\n");
      out.write("                                            <input class=\"form-control\" id=\"inputTempatLahir\" name=\"inputTempatLahir\" value=\"");
      out.print(mhs.getTempatLahir());
      out.write("\" placeholder=\"Tempat Lahir\" type=\"text\" required=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputTanggalLahir\" class=\"col-lg-3 control-label\">Tanggal Lahir</label>\n");
      out.write("                                        <div class=\"col-lg-9\" id=\"datepicker\">\n");
      out.write("                                            <input class=\"form-control\" id=\"inputTanggalLahir\" name=\"inputTanggalLahir\" value=\"");
      out.print(sdf.format(mhs.getTglLahir()));
      out.write("\" placeholder=\"Tanggal Lahir\" type=\"text\" required=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-3 control-label\">Jenis Kelamin</label>\n");
      out.write("                                        <div class=\"col-lg-9\">\n");
      out.write("                                            <div class=\"radio\">\n");
      out.write("                                                <label>\n");
      out.write("                                                    <input name=\"inputJenisKelamin\" value=\"L\" ");
 if ((mhs.getJenisKelamin().equalsIgnoreCase("L"))) { 
      out.write(" checked=\"\" ");
 } 
      out.write(" type=\"radio\" required=\"\">\n");
      out.write("                                                    Laki-laki\n");
      out.write("                                                </label>                   \n");
      out.write("                                                <label>\n");
      out.write("                                                    <input name=\"inputJenisKelamin\" value=\"P\" ");
 if ((mhs.getJenisKelamin().equalsIgnoreCase("P"))) { 
      out.write(" checked=\"\" ");
 } 
      out.write(" type=\"radio\" required=\"\">\n");
      out.write("                                                    Perempuan\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputAlamat\" class=\"col-lg-3 control-label\">Alamat</label>\n");
      out.write("                                        <div class=\"col-lg-9\">\n");
      out.write("                                            <textarea class=\"form-control\" name=\"inputAlamat\" rows=\"5\" id=\"textArea\" style=\"resize: none\" required=\"\">");
      out.print(mhs.getAlamat());
      out.write("</textarea>                   \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-9 col-lg-offset-3\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary\">Simpan</button>\n");
      out.write("                                            <button type=\"reset\" class=\"btn btn-default\">Reset</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>\n");
      out.write("                            ");
 } else { 
      out.write("\n");
      out.write("                            <h1 id=\"forms\">Data not found</h1>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <script src=\"asset/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"asset/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"asset/js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#datepicker input').datepicker({\n");
      out.write("                format: \"dd-mm-yyyy\",\n");
      out.write("                autoclose: true,\n");
      out.write("                todayHighlight: true\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
