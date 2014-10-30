
package Tubagus.Fajar.DAO;

/**
 *
 * @author Fajar
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Tubagus.Fajar.model.Mahasiswa;


public class MahasiswaDAO {
    private Connection koneksiDatabase;
    
    public Connection connect() {
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/UTSp4";
            String user = "root";
            String password = "";
            Class.forName(driver);
            koneksiDatabase = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return koneksiDatabase;
    }
    
    public void disconnect() {
        try {
            koneksiDatabase.close();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    
    public void simpan(Mahasiswa mhs){
        try {
            String sql = "INSERT INTO mahasiswa(npm, nama, tmplahir, tgllahir, jk, alamat) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connect().prepareStatement(sql);

            ps.setInt(1, mhs.getNpm());
            ps.setString(2, mhs.getNama());
            ps.setString(3, mhs.getTempatLahir());
            ps.setDate(4, new java.sql.Date(mhs.getTglLahir().getTime()));
            ps.setString(5, mhs.getJenisKelamin());
            ps.setString(6, mhs.getAlamat());

            ps.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    
    public Mahasiswa cariMahasiswa(int id, int npm) {
        Mahasiswa mhs = new Mahasiswa();
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=? and npm=?";
            PreparedStatement ps = connect().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, npm);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNpm(rs.getInt("npm"));
                mhs.setNama(rs.getString("nama"));
                mhs.setTempatLahir(rs.getString("tmplahir"));
                mhs.setTglLahir(rs.getDate("tgllahir"));
                mhs.setJenisKelamin(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return mhs;
    }

    public void updateMahasiswa(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa set nama=?, tmplahir=?, tgllahir=?, jk=?, alamat=? where id=? and npm=?";
            PreparedStatement ps = connect().prepareStatement(sql);

            ps.setString(1, mhs.getNama());
            ps.setString(2, mhs.getTempatLahir());
            ps.setDate(3, new java.sql.Date(mhs.getTglLahir().getTime()));
            ps.setString(4, mhs.getJenisKelamin());
            ps.setString(5, mhs.getAlamat());
            ps.setInt(6, mhs.getId());
            ps.setInt(7, mhs.getNpm());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void hapusMahasiswa(int id, int npm) {
        try {
            String sql = "DELETE FROM mahasiswa where id=? and npm=?";
            PreparedStatement ps = connect().prepareStatement(sql);

            ps.setInt(1, id);
            ps.setInt(2, npm);

            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List listMahasiswa() {
        List result = new ArrayList();
        try {
            String sql = "SELECT * FROM mahasiswa";
            PreparedStatement ps = connect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNpm(rs.getInt("npm"));
                mhs.setNama(rs.getString("nama"));
                mhs.setTempatLahir(rs.getString("tmplahir"));
                mhs.setTglLahir(rs.getDate("tgllahir"));
                mhs.setJenisKelamin(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
                result.add(mhs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
