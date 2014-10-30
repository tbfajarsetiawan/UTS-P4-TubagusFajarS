
package Tubagus.Fajar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Tubagus.Fajar.DAO.MahasiswaDAO;
import Tubagus.Fajar.model.Mahasiswa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Fajar
 */
public class FormMahasiswaServlet extends HttpServlet {
    private final String Index = "FormMahasiswa.html";
    private final String List = "page/list.jsp";
    private final String Edit = "page/edit.jsp";
    MahasiswaDAO dao;

    public FormMahasiswaServlet() {
        super();
        dao = new MahasiswaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String redirect = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("form-add")) {
            redirect = Index;
        } else if (action.equalsIgnoreCase("simpan")) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNpm(Integer.parseInt(request.getParameter("inputNPM")));
            mhs.setNama(request.getParameter("inputNama"));
            mhs.setTempatLahir(request.getParameter("inputTempatLahir"));
            try {
                Date dob = new SimpleDateFormat("dd-M-yyyy").parse(request.getParameter("inputTanggalLahir"));
                mhs.setTglLahir(dob);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            mhs.setJenisKelamin(request.getParameter("inputJenisKelamin"));
            mhs.setAlamat(request.getParameter("inputAlamat"));
            dao.simpan(mhs);
            redirect = List;
        } else if (action.equalsIgnoreCase("delete")) {
            String id = request.getParameter("id");
            String npm = request.getParameter("npm");
            int iid = Integer.parseInt(id);
            int inpm = Integer.parseInt(npm);
            dao.hapusMahasiswa(iid, inpm);
            redirect = List;
        } else if (action.equalsIgnoreCase("edit")) {
            redirect = Edit;
        } else if (action.equalsIgnoreCase("list-mahasiswa")) {
            redirect = List;
        } else if (action.equalsIgnoreCase("update")) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(request.getParameter("inputNama"));
            mhs.setTempatLahir(request.getParameter("inputTempatLahir"));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
            java.util.Date date = null;
            try {
                date = sdf.parse(request.getParameter("inputTanggalLahir"));
                mhs.setTglLahir((Date) date);
            } catch (Exception ex) {
            }
            mhs.setJenisKelamin(request.getParameter("inputJenisKelamin"));
            mhs.setAlamat(request.getParameter("inputAlamat"));
            mhs.setId(Integer.parseInt(request.getParameter("inputId")));
            mhs.setNpm(Integer.parseInt(request.getParameter("inputNPM")));
            dao.updateMahasiswa(mhs);
            redirect = List;
        } else {
            redirect = List;
        }
        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
   
}
