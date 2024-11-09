/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group.panel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import com.toedter.calendar.JCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * @author LENOVO LEGION
 */
public class QuanNhanPanel extends javax.swing.JFrame {
    private JTextField txtHoTen;
    private JTextField txtMaSo;
    private JTextField txtDonVi;
    private JTextField txtCapBac;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnIssueUniform;
    private JComboBox<String> rankDropdown;
    private JCalendar calendar;
    private JTable table;
    private JTextField txtNgaySinh;

    /**
     * Creates new form QuanNhanPanel
     */
    public QuanNhanPanel() {
        setTitle("Quản Lý Quân Nhân");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Initialize components
        txtHoTen = new JTextField(20);
        txtMaSo = new JTextField(20);
        txtDonVi = new JTextField(20);
        
        // Initialize JCalendar and date format for Ngày Sinh
        calendar = new JCalendar();
        calendar.setPreferredSize(new Dimension(300, 200));
        calendar.setWeekOfYearVisible(false);
        txtNgaySinh = new JTextField(20);
        txtNgaySinh.setEditable(false);

        // Calendar date change listener
        calendar.addPropertyChangeListener("calendar", evt -> {
            Date selectedDate = calendar.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(selectedDate);
            txtNgaySinh.setText(formattedDate);
        });

        // Rank Dropdown (Cấp Bậc)
        rankDropdown = new JComboBox<>(new String[]{
                "Binh Nhì", "Binh Nhất", "Hạ Sĩ", "Trung Sĩ", "Thượng Sĩ", "Thiếu Úy", "Trung Úy", "Đại Úy"
        });

        // Table for displaying data
        table = new JTable(new DefaultTableModel(new Object[]{
                "Họ Tên", "Mã Số", "Đơn Vị", "Cấp Bậc", "Ngày Sinh"
        }, 0));
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(800, 200));

        // Buttons
        btnAdd = new JButton("Thêm");
        btnUpdate = new JButton("Sửa");
        btnDelete = new JButton("Xóa");
        btnIssueUniform = new JButton("Cấp Quân Trang");

        
        btnIssueUniform.addActionListener(e -> openCapPhatQuanTrangPanel());

        
        // Layout for form fields
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Họ Tên:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtHoTen, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Mã Số:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtMaSo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Đơn Vị:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtDonVi, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Cấp Bậc:"), gbc);
        gbc.gridx = 1;
        formPanel.add(rankDropdown, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(new JLabel("Ngày Sinh:"), gbc);
        gbc.gridx = 1;
        formPanel.add(calendar, gbc);
        gbc.gridx = 2;
        formPanel.add(txtNgaySinh, gbc);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnIssueUniform);
        buttonPanel.add(btnIssueUniform);

        // Main panel for layout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);

        // Add action listeners for buttons
        btnAdd.addActionListener(e -> addRowToTable());
        btnUpdate.addActionListener(e -> updateRowInTable());
        btnDelete.addActionListener(e -> deleteRowFromTable());
    }
    private void openCapPhatQuanTrangPanel() {
    int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        String hoTen = (String) table.getValueAt(selectedRow, 0);
        String maSo = (String) table.getValueAt(selectedRow, 1);
        
        // Open the CapPhatQuanTrangPanel and pass selected soldier info
        new CapPhatPanel(hoTen, maSo).setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một quân nhân để cấp quân trang.");
    }
}

    // Method to add a new row to the table
    private void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String hoTen = txtHoTen.getText();
        String maSo = txtMaSo.getText();
        String donVi = txtDonVi.getText();
        String capBac = (String) rankDropdown.getSelectedItem();
        String ngaySinh = txtNgaySinh.getText();

        // Add row to table
        model.addRow(new Object[]{hoTen, maSo, donVi, capBac, ngaySinh});

        // Clear the input fields
        txtHoTen.setText("");
        txtMaSo.setText("");
        txtDonVi.setText("");
        txtNgaySinh.setText("");
        rankDropdown.setSelectedIndex(0);
    }

    // Method to update a selected row in the table
    private void updateRowInTable() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String hoTen = txtHoTen.getText();
            String maSo = txtMaSo.getText();
            String donVi = txtDonVi.getText();
            String capBac = (String) rankDropdown.getSelectedItem();
            String ngaySinh = txtNgaySinh.getText();

            model.setValueAt(hoTen, selectedRow, 0);
            model.setValueAt(maSo, selectedRow, 1);
            model.setValueAt(donVi, selectedRow, 2);
            model.setValueAt(capBac, selectedRow, 3);
            model.setValueAt(ngaySinh, selectedRow, 4);

            // Clear the input fields
            txtHoTen.setText("");
            txtMaSo.setText("");
            txtDonVi.setText("");
            txtNgaySinh.setText("");
            rankDropdown.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.");
        }
    }

    // Method to delete a selected row from the table
    private void deleteRowFromTable() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.");
        }
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
            java.util.logging.Logger.getLogger(QuanNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanNhanPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
