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
import group.entity.DonVi;

public class DonViDAO {
    public void addDonVi(DonVi donVi) throws SQLException {
        Connection con = ConnectionProvider.getCon();
        String query = "INSERT INTO donvi (tenDonVi, maSo, soLuongQuanNhan) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, donVi.getTenDonVi());
        ps.setString(2, donVi.getMaSo());
        ps.setInt(3, donVi.getSoLuongQuanNhan());
        ps.executeUpdate();
        con.close();
    }

    public List<DonVi> getAllDonVi() throws SQLException {
        List<DonVi> list = new ArrayList<>();
        Connection con = ConnectionProvider.getCon();
        String query = "SELECT * FROM donvi";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DonVi donVi = new DonVi(rs.getString("tenDonVi"), rs.getString("maSo"));
            donVi.setSoLuongQuanNhan(rs.getInt("soLuongQuanNhan"));
            list.add(donVi);
        }
        con.close();
        return list;
    }
}