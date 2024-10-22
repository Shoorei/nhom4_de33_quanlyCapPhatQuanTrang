/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.nhom4_de33_quanlycapphatquantrang;

/**
 *
 * @author LENOVO LEGION
 */
public class QuanTrang {
    private String ten;
    private String phanLoai; // Phân loại quân trang

    public QuanTrang(String ten, String phanLoai) {
        this.ten = ten;
        this.phanLoai = phanLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    @Override
    public String toString() {
        return ten + " (" + phanLoai + ")";
    }
}