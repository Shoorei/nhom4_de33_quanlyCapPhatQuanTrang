/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group.panel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author LENOVO LEGION
 */
public class DonViPanel extends javax.swing.JFrame {
    private JTextField txtTenDonVi;
    private JTextField txtMaSo;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JTable table;
    private DefaultTableModel tableModel;
    private int selectedRow = -1; 
    /**
     * Creates new form DonViPanel
     */
    public DonViPanel() {
        setTitle("Quản Lý Đơn Vị");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Khởi tạo các thành phần
        txtTenDonVi = new JTextField(20);
        txtMaSo = new JTextField(20);
        btnAdd = new JButton("Thêm");
        btnUpdate = new JButton("Sửa");
        btnDelete = new JButton("Xóa");

        // Khởi tạo bảng dữ liệu
        tableModel = new DefaultTableModel(new Object[]{"Tên Đơn Vị", "Mã Số"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(500, 200)); // Điều chỉnh kích thước bảng

        // Sử dụng GridBagLayout để bố trí các thành phần
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Tên Đơn Vị:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtTenDonVi, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Mã Số:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtMaSo, gbc);

        // Panel chứa các nút
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        // Panel chính để chứa tất cả thành phần
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // Hiển thị giao diện
        setVisible(true);

        // Khởi tạo sự kiện cho các nút
        initComponents();
    }

    private void initComponents() {
        // Sự kiện thêm thông tin vào bảng
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenDonVi = txtTenDonVi.getText();
                String maSo = txtMaSo.getText();
                if (!tenDonVi.isEmpty() && !maSo.isEmpty()) {
                    // Thêm vào bảng
                    tableModel.addRow(new Object[]{tenDonVi, maSo});
                    // Làm trống các trường nhập
                    txtTenDonVi.setText("");
                    txtMaSo.setText("");
                } else {
                    JOptionPane.showMessageDialog(DonViPanel.this, "Vui lòng nhập đầy đủ thông tin", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Sự kiện xóa thông tin trong bảng
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedRow >= 0) {
                    tableModel.removeRow(selectedRow);
                    selectedRow = -1;
                } else {
                    JOptionPane.showMessageDialog(DonViPanel.this, "Vui lòng chọn một dòng để xóa", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Sự kiện sửa thông tin trong bảng
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedRow >= 0) {
                    String tenDonVi = txtTenDonVi.getText();
                    String maSo = txtMaSo.getText();
                    if (!tenDonVi.isEmpty() && !maSo.isEmpty()) {
                        tableModel.setValueAt(tenDonVi, selectedRow, 0);
                        tableModel.setValueAt(maSo, selectedRow, 1);
                        // Làm trống các trường nhập
                        txtTenDonVi.setText("");
                        txtMaSo.setText("");
                    } else {
                        JOptionPane.showMessageDialog(DonViPanel.this, "Vui lòng nhập đầy đủ thông tin", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(DonViPanel.this, "Vui lòng chọn một dòng để sửa", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Sự kiện chọn dòng trong bảng
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    txtTenDonVi.setText(tableModel.getValueAt(selectedRow, 0).toString());
                    txtMaSo.setText(tableModel.getValueAt(selectedRow, 1).toString());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonViPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonViPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
