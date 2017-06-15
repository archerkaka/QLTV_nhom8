/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Controller.controller.add_new_book_controller;
import static Controller.controller.getTenTacGia;
import static Controller.controller.getTheLoai;
import static Controller.controller.get_matacgia;
import static Controller.controller.get_matheloai;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThemSach extends javax.swing.JPanel {

    /**
     * Creates new form ThemSach
     */
    public ThemSach() {
        initComponents();
        CB_TacGia.removeAllItems();
        CB_TheLoai.removeAllItems();
        TF_MaSach.setText(null);
       TF_TenSach.setText(null);
       // load tên tác giả lên combo box
        int size_tentacgia = getTenTacGia().size();
        for(int i=0; i < size_tentacgia; i++){
            CB_TacGia.addItem(getTenTacGia().get(i).toString());
        }
        // load tên thể loại lên combo box
        int size_theloai = getTheLoai().size();
         for(int i=0; i < size_theloai; i++){
            CB_TheLoai.addItem(getTheLoai().get(i).toString());
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

        TF_MaSach = new javax.swing.JTextField();
        TF_TenSach = new javax.swing.JTextField();
        TF_NXB = new javax.swing.JTextField();
        TF_NamSuatban = new javax.swing.JTextField();
        LB_namxuatban = new javax.swing.JLabel();
        LB_nxb = new javax.swing.JLabel();
        LB_tacgia = new javax.swing.JLabel();
        LB_tensach = new javax.swing.JLabel();
        LB_masach = new javax.swing.JLabel();
        LB_ngaynhap = new javax.swing.JLabel();
        LB_theloai = new javax.swing.JLabel();
        LB_trigia = new javax.swing.JLabel();
        LB_soluong = new javax.swing.JLabel();
        SN_SoLuong = new javax.swing.JSpinner();
        FF_TriGia = new javax.swing.JFormattedTextField();
        CB_TheLoai = new javax.swing.JComboBox<>();
        BT_save = new javax.swing.JButton();
        BT_reset = new javax.swing.JButton();
        CB_TacGia = new javax.swing.JComboBox<>();
        Date_Ngaynhap = new com.toedter.calendar.JDateChooser();

        TF_MaSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_TenSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_NXB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TF_NXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NXBActionPerformed(evt);
            }
        });

        TF_NamSuatban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_namxuatban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_namxuatban.setText("Năm suất bản");

        LB_nxb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_nxb.setText("Nhà xuất bản");

        LB_tacgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tacgia.setText("Tác giả");

        LB_tensach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tensach.setText("Tên sách");

        LB_masach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_masach.setText("Mã sách");

        LB_ngaynhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_ngaynhap.setText("Ngày nhập");

        LB_theloai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_theloai.setText("Thể loại");

        LB_trigia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_trigia.setText("Trị giá");

        LB_soluong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_soluong.setText("Số lượng");

        SN_SoLuong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        FF_TriGia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        FF_TriGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        CB_TheLoai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_TheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BT_save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save1.png"))); // NOI18N
        BT_save.setText("Lưu Lại");
        BT_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_saveActionPerformed(evt);
            }
        });

        BT_reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        BT_reset.setText("Làm Mới");
        BT_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_resetActionPerformed(evt);
            }
        });

        CB_TacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Date_Ngaynhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_namxuatban)
                    .addComponent(LB_nxb)
                    .addComponent(LB_tacgia)
                    .addComponent(LB_tensach)
                    .addComponent(LB_masach))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_MaSach, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(TF_TenSach)
                    .addComponent(TF_NXB)
                    .addComponent(TF_NamSuatban)
                    .addComponent(CB_TacGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_save)
                        .addGap(97, 97, 97)
                        .addComponent(BT_reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_theloai)
                            .addComponent(LB_trigia)
                            .addComponent(LB_soluong)
                            .addComponent(LB_ngaynhap))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CB_TheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SN_SoLuong)
                            .addComponent(FF_TriGia, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(Date_Ngaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_masach)
                        .addComponent(TF_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LB_ngaynhap))
                    .addComponent(Date_Ngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_tensach)
                    .addComponent(TF_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_theloai)
                    .addComponent(CB_TheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_tacgia)
                    .addComponent(LB_trigia)
                    .addComponent(FF_TriGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_nxb)
                    .addComponent(TF_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_soluong)
                    .addComponent(SN_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_namxuatban)
                    .addComponent(TF_NamSuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_save)
                    .addComponent(BT_reset))
                .addGap(157, 157, 157))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NXBActionPerformed

    private void BT_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_saveActionPerformed
        // TODO add your handling code here:
        // xử lý Btn_save
        try{
            String masach, tensach, matheloai, matacgia, nhaxuatban;
            int trigia, namxuatban, soluong;
            // lấy các giá trị từ người dùng
            Date ngaynhap = new java.sql.Date(Date_Ngaynhap.getDate().getTime());
            trigia = Integer.parseInt(FF_TriGia.getText().replaceAll(",", ""));
            namxuatban = Integer.parseInt(TF_NamSuatban.getText());
            soluong = (Integer)SN_SoLuong.getValue();
            masach = TF_MaSach.getText(); 
            tensach = TF_TenSach.getText();
            nhaxuatban = TF_NXB.getText();
            matheloai = get_matheloai(CB_TheLoai.getSelectedItem().toString());
            matacgia = get_matacgia(CB_TacGia.getSelectedItem().toString());
            // thêm sách
            add_new_book_controller(masach, tensach, matheloai, matacgia, namxuatban, nhaxuatban, trigia, ngaynhap, soluong);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BT_saveActionPerformed

    private void BT_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_resetActionPerformed
        // TODO add your handling code here:
        // xử lý Btn_reset
        // màn hình trở về trạng thái chưa có thông tin
       FF_TriGia.setText("");
       TF_NamSuatban.setText("");
       SN_SoLuong.setValue(1);
       TF_MaSach.setText(null);
       TF_TenSach.setText(null);
       TF_NXB.setText("");
    }//GEN-LAST:event_BT_resetActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_reset;
    private javax.swing.JButton BT_save;
    private javax.swing.JComboBox<String> CB_TacGia;
    private javax.swing.JComboBox<String> CB_TheLoai;
    private static com.toedter.calendar.JDateChooser Date_Ngaynhap;
    private javax.swing.JFormattedTextField FF_TriGia;
    private javax.swing.JLabel LB_masach;
    private javax.swing.JLabel LB_namxuatban;
    private javax.swing.JLabel LB_ngaynhap;
    private javax.swing.JLabel LB_nxb;
    private javax.swing.JLabel LB_soluong;
    private javax.swing.JLabel LB_tacgia;
    private javax.swing.JLabel LB_tensach;
    private javax.swing.JLabel LB_theloai;
    private javax.swing.JLabel LB_trigia;
    private javax.swing.JSpinner SN_SoLuong;
    private static javax.swing.JTextField TF_MaSach;
    private javax.swing.JTextField TF_NXB;
    private javax.swing.JTextField TF_NamSuatban;
    private static javax.swing.JTextField TF_TenSach;
    // End of variables declaration//GEN-END:variables
}
