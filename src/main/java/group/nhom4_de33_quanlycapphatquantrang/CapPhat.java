/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.nhom4_de33_quanlycapphatquantrang;

/**
 *
 * @author LENOVO LEGION
 */
import java.time.LocalDate;

public class CapPhat {
    private LocalDate thoiGianPhat;
    private DonVi donViCapPhat;
    private QuanTrang quanTrang;
    private int soLuongPhatRa;
    private int soLuongThuVe;
    private boolean daPhat; // Tình trạng cấp phát

    public CapPhat(LocalDate thoiGianPhat, DonVi donViCapPhat, QuanTrang quanTrang, int soLuongPhatRa, int soLuongThuVe, boolean daPhat) {
        this.thoiGianPhat = thoiGianPhat;
        this.donViCapPhat = donViCapPhat;
        this.quanTrang = quanTrang;
        this.soLuongPhatRa = soLuongPhatRa;
        this.soLuongThuVe = soLuongThuVe;
        this.daPhat = daPhat;
    }

    public LocalDate getThoiGianPhat() {
        return thoiGianPhat;
    }

    public void setThoiGianPhat(LocalDate thoiGianPhat) {
        this.thoiGianPhat = thoiGianPhat;
    }

    public DonVi getDonViCapPhat() {
        return donViCapPhat;
    }

    public void setDonViCapPhat(DonVi donViCapPhat) {
        this.donViCapPhat = donViCapPhat;
    }

    public QuanTrang getQuanTrang() {
        return quanTrang;
    }

    public void setQuanTrang(QuanTrang quanTrang) {
        this.quanTrang = quanTrang;
    }

    public int getSoLuongPhatRa() {
        return soLuongPhatRa;
    }

    public void setSoLuongPhatRa(int soLuongPhatRa) {
        this.soLuongPhatRa = soLuongPhatRa;
    }

    public int getSoLuongThuVe() {
        return soLuongThuVe;
    }

    public void setSoLuongThuVe(int soLuongThuVe) {
        this.soLuongThuVe = soLuongThuVe;
    }

    public boolean isDaPhat() {
        return daPhat;
    }

    public void setDaPhat(boolean daPhat) {
        this.daPhat = daPhat;
    }

    @Override
    public String toString() {
        return "Cấp phát " + quanTrang.getTen() + " cho " + donViCapPhat.getTenDonVi() + " vào ngày " + thoiGianPhat + 
               ". Số lượng phát: " + soLuongPhatRa + ", Số lượng thu: " + soLuongThuVe + ", Trạng thái: " + (daPhat ? "Đã phát" : "Chưa phát");
    }
}
