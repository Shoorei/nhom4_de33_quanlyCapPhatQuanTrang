/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.nhom4_de33_quanlycapphatquantrang;

/**
 *
 * @author LENOVO LEGION
 */
import java.util.ArrayList;

public class DonVi {
    private String tenDonVi;
    private String maSo;
    private int soLuongQuanNhan;
    private ArrayList<QuanNhan> danhSachQuanNhan;

    public DonVi(String tenDonVi, String maSo) {
        this.tenDonVi = tenDonVi;
        this.maSo = maSo;
        this.danhSachQuanNhan = new ArrayList<>();
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public int getSoLuongQuanNhan() {
        return soLuongQuanNhan;
    }

    public void themQuanNhan(QuanNhan quanNhan) {
        this.danhSachQuanNhan.add(quanNhan);
        this.soLuongQuanNhan = this.danhSachQuanNhan.size();
    }

    @Override
    public String toString() {
        return tenDonVi + " (Ma so: " + maSo + ") - So luong quan nhan: " + soLuongQuanNhan;
    }
}