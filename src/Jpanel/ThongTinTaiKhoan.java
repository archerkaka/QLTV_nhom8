/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Controller.controller.delete_employee_controller;
import static Controller.controller.get_all_nhanvien_controller;
import static Controller.controller.get_permission_list;
import DAL.Nhanvien_Entity;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThongTinTaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinTaiKhoang
     */
    static private int rowNumber = 1000000; 
    static ArrayList<Nhanvien_Entity> nhanvienlist = new ArrayList<>();
    public ThongTinTaiKhoan() {
        initComponents();
        set_Disable();
        CB_ChucVu.removeAllItems();
        // load các chức vụ trong csdl vào combo box chức vụ
        int size_tentacgia = get_permission_list().size();
        for(int i=0; i < size_tentacgia; i++){
            CB_ChucVu.addItem(get_permission_list().get(i).toString());
        }
        // load thông tin các nhân viên trong csdl hiển thị vào table
        push_data_to_table(get_all_nhanvien_controller());
        jTable1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e){
                    rowNumber = jTable1.getSelectedRow();
                    loadDataToView(rowNumber);                   
                }   
       });
        
    }
    private void set_Disable(){
        BT_Luu.setEnabled(false);
        
    }
    private void set_Enable(){
        BT_Luu.setEnabled(true);
    }
    private void loadDataToView(int rowNumber){
        // load thông tin từ table lên các xử lý cho người dùng chỉnh sửa dễ dàng
        TF_TenDangNhap.setText(nhanvienlist.get(rowNumber).get_tennhanvien());
        TF_Pass.setText(nhanvienlist.get(rowNumber).get_matkhau());
        CB_MaNhanVien.setText(nhanvienlist.get(rowNumber).get_manhanvien());
        if (nhanvienlist.get(rowNumber).get_maquyen().equals("Q01")) //Kiểm tra quyền của tài khoản.
            CB_ChucVu.setSelectedItem("admin");
        else 
            CB_ChucVu.setSelectedItem("user");
    }
    static public void push_data_to_table(ArrayList<Nhanvien_Entity> list){
        // load dữ liệu từ csdl lên table
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector cols = new Vector();
        nhanvienlist = list;
       cols.add("Mã nhân vien");
       cols.add("Tên nhân viên");
       cols.add("Giới tính");
       cols.add("Số CMND");
       cols.add("Ngày sinh");
       cols.add("Tài khoản");
       cols.add("Mật khẩu");
       Vector rowData = new Vector(); 
       for (Nhanvien_Entity data : nhanvienlist){
           Vector row = new Vector();
//           CB_MaNhanVien.addItem(data.get_manhanvien());
           row.add(data.get_manhanvien());
           row.add(data.get_tennhanvien());
           row.add(data.get_gioitinh());
           row.add(data.get_cmnd());
           row.add(data.get_ngaysinh());
           row.add(data.get_taikhoan());
           row.add(data.get_matkhau());
           rowData.add(row);
       }
       dtm.setDataVector(rowData, cols);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_TenDangNhap = new javax.swing.JTextField();
        BT_Luu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TF_Pass = new javax.swing.JPasswordField();
        BT_Huy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CB_ChucVu = new javax.swing.JComboBox<>();
        BT_Them = new javax.swing.JButton();
        BT_Sua = new javax.swing.JButton();
        BT_Xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CB_MaNhanVien = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Mã nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Tên Đăng nhập");

        TF_TenDangNhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        BT_Luu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_Luu.setText("Lưu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Mật khẩu");

        TF_Pass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TF_Pass.setText("jPasswordField1");

        BT_Huy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_Huy.setText("Huỷ");
        BT_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_HuyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Chức vụ");

        CB_ChucVu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BT_Them.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_Them.setText("Thêm");

        BT_Sua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_Sua.setText("Sửa");
        BT_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SuaActionPerformed(evt);
            }
        });

        BT_Xoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_Xoa.setText("Xoá");
        BT_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_XoaActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên đăng nhập", "Mật khẩu", "Chức vụ", "Mã nhân viên", "Tên nhân viên"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        CB_MaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MaNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_TenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CB_ChucVu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(CB_MaNhanVien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Huy)
                    .addComponent(BT_Luu))
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(BT_Them)
                .addGap(73, 73, 73)
                .addComponent(BT_Sua)
                .addGap(73, 73, 73)
                .addComponent(BT_Xoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CB_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Luu))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BT_Huy)
                    .addComponent(TF_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CB_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Them)
                    .addComponent(BT_Sua)
                    .addComponent(BT_Xoa))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CB_MaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MaNhanVienActionPerformed

    private void BT_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_XoaActionPerformed
        // TODO add your handling code here:
        if (rowNumber == 1000000) return;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc muốn xóa?" ,"Warning", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            delete_employee_controller(nhanvienlist.get(rowNumber).get_manhanvien());
            push_data_to_table(get_all_nhanvien_controller());
        }else{
            return;
        } //Xoá tài khoản hiện tại.
    }//GEN-LAST:event_BT_XoaActionPerformed

    private void BT_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SuaActionPerformed
        // TODO add your handling code here:
        set_Enable(); //Sữa thông tin tài khoản hiện tại.
    }//GEN-LAST:event_BT_SuaActionPerformed

    private void BT_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_HuyActionPerformed
        // TODO add your handling code here:
        if (rowNumber == 1000000) return;
        loadDataToView(rowNumber);   
        set_Disable(); //Huỷ mọi thay đổi thông tin cho tài khoản hiện tại.
    }//GEN-LAST:event_BT_HuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Huy;
    private javax.swing.JButton BT_Luu;
    private javax.swing.JButton BT_Sua;
    private javax.swing.JButton BT_Them;
    private javax.swing.JButton BT_Xoa;
    private javax.swing.JComboBox<String> CB_ChucVu;
    private javax.swing.JTextField CB_MaNhanVien;
    private javax.swing.JPasswordField TF_Pass;
    private javax.swing.JTextField TF_TenDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
