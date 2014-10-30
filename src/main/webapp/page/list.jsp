<%@page import="java.util.List"%>
<%@page import="Tubagus.Fajar.DAO.MahasiswaDAO"%>
<%@page import="Tubagus.Fajar.model.Mahasiswa"%>
<%
    MahasiswaDAO dao = new MahasiswaDAO();
    List<Mahasiswa> list = dao.listMahasiswa();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Form Mahasiswa</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="asset/css/bootstrap.min.css" type="text/css"/>
        <link rel="stylesheet" href="asset/css/bootstrap.css" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="bs-docs-section">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="page-header">
                            <h1 id="forms">List Mahasiswa</h1>
                            <a href="FormMahasiswaServlet?action=form-add" class="btn btn-primary btn-xs">Add Record</a>
                        </div>
                    </div>
                </div>
                <div class="row" id="form-add">
                    <div class="col-lg-10">
                        <table class="table table-bordered table-hover ">
                            <thead>
                                <tr>
                                    <th>NPM</th>
                                    <th>Nama</th>
                                    <th>Tempat Tangal Lahir</th>
                                    <th>Jenis Kelamin</th>
                                    <th>Alamat</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (Mahasiswa mhs : list) {
                                %>
                                <tr>
                                    <td><%=mhs.getNpm()%></td>
                                    <td><%=mhs.getNama()%></td>
                                    <td><%=mhs.getTempatTanggalLahir()%></td>
                                    <td><%=mhs.getJenisKelamin()%></td>
                                    <td><%=mhs.getAlamat()%></td>
                                    <td>
                                        <div class="btn-group">
                                            <a href="FormMahasiswaServlet?action=edit&id=<%=mhs.getId()%>&npm=<%=mhs.getNpm()%>" class="btn btn-info btn-xs" title="Edit">E</a>
                                            <a href="FormMahasiswaServlet?action=delete&id=<%=mhs.getId()%>&npm=<%=mhs.getNpm()%>" class="btn btn-danger btn-xs" title="Delete">D</a>
                                        </div>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table> 
                    </div>    
                </div>
            </div> 
            <script src="asset/jquery-1.10.2.min.js"></script>
            <script src="asset/bootstrap.min.js"></script>
    </body>
</html> 