/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group.nhom4_de33_quanlycapphatquantrang;

/**
 *
 * @author LENOVO LEGION
 */
import dao.QuanTrangDAO;
import dao.QuanNhanDAO;
import dao.DonViDAO;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            themQuanTrang("Áo", "Sĩ quan");
            themQuanNhan("Nguyen Van B", "002", "Don Vi 2", "Nam", "Dai uy");
            themDonVi("Don Vi 2", "DV002", 30);
            
            System.out.println("Danh sách quân trang:");
            hienThiQuanTrang();

            System.out.println("\nDanh sách quân nhân:");
            hienThiQuanNhan();

            System.out.println("\nDanh sách đơn vị:");
            hienThiDonVi();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void themQuanTrang(String ten, String phanLoai) throws SQLException {
        QuanTrang quanTrang = new QuanTrang(ten, phanLoai);
        QuanTrangDAO quanTrangDAO = new QuanTrangDAO();
        quanTrangDAO.addQuanTrang(quanTrang);
        System.out.println("Đã thêm quân trang: " + ten);
    }

    public static void themQuanNhan(String hoTen, String maSo, String donVi, String gioiTinh, String capBacHam) throws SQLException {
        QuanNhan quanNhan = new QuanNhan(hoTen, maSo, donVi, gioiTinh, capBacHam);
        QuanNhanDAO quanNhanDAO = new QuanNhanDAO();
        quanNhanDAO.addQuanNhan(quanNhan);
        System.out.println("Đã thêm quân nhân: " + hoTen);
    }

    public static void themDonVi(String tenDonVi, String maSo, int soLuongQuanNhan) throws SQLException {
        DonVi donVi = new DonVi(tenDonVi, maSo);
        DonViDAO donViDAO = new DonViDAO();
        donViDAO.addDonVi(donVi);
        System.out.println("Đã thêm đơn vị: " + tenDonVi);
    }

    public static void hienThiQuanTrang() throws SQLException {
        QuanTrangDAO quanTrangDAO = new QuanTrangDAO();
        List<QuanTrang> quanTrangs = quanTrangDAO.getAllQuanTrang();
        for (QuanTrang quanTrang : quanTrangs) {
            System.out.println(quanTrang);
        }
    }

    public static void hienThiQuanNhan() throws SQLException {
        QuanNhanDAO quanNhanDAO = new QuanNhanDAO();
        List<QuanNhan> quanNhans = quanNhanDAO.getAllQuanNhan();
        for (QuanNhan quanNhan : quanNhans) {
            System.out.println(quanNhan);
        }
    }

    public static void hienThiDonVi() throws SQLException {
        DonViDAO donViDAO = new DonViDAO();
        List<DonVi> donVis = donViDAO.getAllDonVi();
        for (DonVi donVi : donVis) {
            System.out.println(donVi);
        }
    }
}