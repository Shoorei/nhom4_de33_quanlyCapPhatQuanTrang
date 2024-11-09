/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50), name varchar(200), phoneNumber varchar(50), email varchar(200), password varchar(50), address varchar(200), status varchar(50))");
//            st.executeUpdate("insert into appuser(userRole, name, phoneNumber, email, password, address, status) values ('SuperAdmin', 'Super Admin', '0397867870', 'superadmin@email.com', 'superadminpassword', 'VN', 'Active')");
//            st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key, name varchar(200))");
//            st.executeUpdate("create table uniform(uniform_pk int AUTO_INCREMENT primary key, name varchar(200), quantity int, price int, description varchar(500), category_fk int)");
//            st.executeUpdate("create table officer(officer_pk int AUTO_INCREMENT primary key, name varchar(200), officer_rank varchar(200), phoneNumber varchar(50))");
            st.executeUpdate("create table distributionDetail(distribution_pk int AUTO_INCREMENT primary key, distributionId varchar(200), officer_fk int, distributionDate varchar(200), totalPaid int)");
            
            
            JOptionPane.showMessageDialog(null, "Table Created Successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}
