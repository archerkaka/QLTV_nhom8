/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Controller.controller.changPassword;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DoiMatKhau extends javax.swing.JPanel {

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
        initComponents();
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
        Pass_MatKhauHienTai = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Pass_MatKhauMoi = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Pass_NhapLaiMatKhauMoi = new javax.swing.JPasswordField();
        BT_save = new javax.swing.JButton();
        BT_reset = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Mật khẩu hiện tại");

        Pass_MatKhauHienTai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Pass_MatKhauHienTai.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mật khẩu mới");

        Pass_MatKhauMoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Pass_MatKhauMoi.setText("jPasswordField2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nhập lại mật khẩu mới");

        Pass_NhapLaiMatKhauMoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Pass_NhapLaiMatKhauMoi.setText("jPasswordField3");

        BT_save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save1.png"))); // NOI18N
        BT_save.setText("Lưu");
        BT_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_saveActionPerformed(evt);
            }
        });

        BT_reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/savebt.png"))); // NOI18N
        BT_reset.setText("Huỷ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass_NhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass_MatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass_MatKhauHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BT_save)
                        .addGap(61, 61, 61)
                        .addComponent(BT_reset)))
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Pass_MatKhauHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pass_MatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pass_NhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_save)
                    .addComponent(BT_reset))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BT_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_saveActionPerformed
        // TODO add your handling code here:
        String matkhau = Pass_MatKhauHienTai.getText();
        String matkhaumoi = Pass_MatKhauMoi.getText();
        String xacnhanmatkhau = Pass_NhapLaiMatKhauMoi.getText();
        if (matkhaumoi.equals(xacnhanmatkhau)){     //Mật khẩu mới giống với xác nhận mật khẩu.
            changPassword(matkhau, matkhaumoi);
        }else{
            JOptionPane.showMessageDialog(null,matkhaumoi + "Mật khẩu không khớp" + xacnhanmatkhau , //popup message thông báo nếu mật khẩu không khớp. 
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BT_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_reset;
    private javax.swing.JButton BT_save;
    private javax.swing.JPasswordField Pass_MatKhauHienTai;
    private javax.swing.JPasswordField Pass_MatKhauMoi;
    private javax.swing.JPasswordField Pass_NhapLaiMatKhauMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
