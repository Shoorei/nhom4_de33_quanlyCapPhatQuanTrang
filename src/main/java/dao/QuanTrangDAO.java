/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author LENOVO LEGION
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import group.nhom4_de33_quanlycapphatquantrang.QuanTrang;

public class QuanTrangDAO {
    public void addQuanTrang(QuanTrang quanTrang) throws SQLException {
        Connection con = ConnectionProvider.getCon();
        String query = "INSERT INTO quantrang (ten, phanLoai) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, quanTrang.getTen());
        ps.setString(2, quanTrang.getPhanLoai());
        ps.executeUpdate();
        con.close();
    }

    public List<QuanTrang> getAllQuanTrang() throws SQLException {
        List<QuanTrang> list = new ArrayList<>();
        Connection con = ConnectionProvider.getCon();
        String query = "SELECT * FROM quantrang";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            QuanTrang quanTrang = new QuanTrang(
                    rs.getString("ten"),
                    rs.getString("phanLoai")
            );
            list.add(quanTrang);
        }
        con.close();
        return list;
    }
}
