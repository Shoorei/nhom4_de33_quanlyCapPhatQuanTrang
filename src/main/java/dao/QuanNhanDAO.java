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
import group.nhom4_de33_quanlycapphatquantrang.QuanNhan;

public class QuanNhanDAO {
    public void addQuanNhan(QuanNhan quanNhan) throws SQLException {
        Connection con = ConnectionProvider.getCon();
        String query = "INSERT INTO quannhan (name, maSo, donVi, gioiTinh, capBacHam) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, quanNhan.getHoTen());
        ps.setString(2, quanNhan.getMaSo());
        ps.setString(3, quanNhan.getDonVi());
        ps.setString(4, quanNhan.getGioiTinh());
        ps.setString(5, quanNhan.getCapBacHam());
        ps.executeUpdate();
        con.close();
    }

    public List<QuanNhan> getAllQuanNhan() throws SQLException {
        List<QuanNhan> list = new ArrayList<>();
        Connection con = ConnectionProvider.getCon();
        String query = "SELECT * FROM quannhan";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            QuanNhan quanNhan = new QuanNhan(
                    rs.getString("name"),
                    rs.getString("maSo"),
                    rs.getString("donVi"),
                    rs.getString("gioiTinh"),
                    rs.getString("capBacHam")
            );
            list.add(quanNhan);
        }
        con.close();
        return list;
    }
}
