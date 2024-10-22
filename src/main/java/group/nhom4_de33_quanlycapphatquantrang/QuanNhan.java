/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.nhom4_de33_quanlycapphatquantrang;

/**
 *
 * @author LENOVO LEGION
 */
public class QuanNhan {
    private String hoTen;
    private String maSo;
    private String donVi;
    private String gioiTinh;
    private String capBacHam; // Cấp bậc hàm

    public QuanNhan(String hoTen, String maSo, String donVi, String gioiTinh, String capBacHam) {
        this.hoTen = hoTen;
        this.maSo = maSo;
        this.donVi = donVi;
        this.gioiTinh = gioiTinh;
        this.capBacHam = capBacHam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCapBacHam() {
        return capBacHam;
    }

    public void setCapBacHam(String capBacHam) {
        this.capBacHam = capBacHam;
    }

    @Override
    public String toString() {
        return hoTen + " (" + capBacHam + ") - Đơn vị: " + donVi;
    }
}
