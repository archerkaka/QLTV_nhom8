/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Jframe.mainframe.danhsachphieu_in_menu;
import static Jframe.mainframe.muonsach_in_menu;
import static Jframe.mainframe.thutienphat_in_menu;
import static Jframe.mainframe.trasach_in_menu;

/**
 *
 * @author Admin
 */
public class MuonTraSach_menu extends javax.swing.JPanel {

    /**
     * Creates new form sach_menu
     */
    public MuonTraSach_menu() {
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

        LB_muonsach_menu = new javax.swing.JLabel();
        BT_MuonSach = new javax.swing.JButton();
        BT_TraSach = new javax.swing.JButton();
        BT_ThuTienPhat = new javax.swing.JButton();
        BT_DanhsachPhieu = new javax.swing.JButton();

        LB_muonsach_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/muonsachmain.png"))); // NOI18N

        BT_MuonSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_MuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/muonsach1.png"))); // NOI18N
        BT_MuonSach.setText("Mượn Sách");
        BT_MuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MuonSachActionPerformed(evt);
            }
        });

        BT_TraSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_TraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trasach.png"))); // NOI18N
        BT_TraSach.setText("Trả Sách");
        BT_TraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_TraSachActionPerformed(evt);
            }
        });

        BT_ThuTienPhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_ThuTienPhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thutienphat.png"))); // NOI18N
        BT_ThuTienPhat.setText("Thu Tiền Phạt");
        BT_ThuTienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThuTienPhatActionPerformed(evt);
            }
        });

        BT_DanhsachPhieu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_DanhsachPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/danhsachphieu.png"))); // NOI18N
        BT_DanhsachPhieu.setText("Dach Sách Phiếu");
        BT_DanhsachPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DanhsachPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LB_muonsach_menu)
                .addGap(18, 18, 18)
                .addComponent(BT_MuonSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(BT_TraSach)
                .addGap(31, 31, 31)
                .addComponent(BT_ThuTienPhat)
                .addGap(36, 36, 36)
                .addComponent(BT_DanhsachPhieu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LB_muonsach_menu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_MuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_TraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_ThuTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_DanhsachPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BT_MuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MuonSachActionPerformed
        // TODO add your handling code here:
        muonsach_in_menu();
    }//GEN-LAST:event_BT_MuonSachActionPerformed

    private void BT_ThuTienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThuTienPhatActionPerformed
        // TODO add your handling code here:
        thutienphat_in_menu();
    }//GEN-LAST:event_BT_ThuTienPhatActionPerformed

    private void BT_TraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_TraSachActionPerformed
        // TODO add your handling code here:
        trasach_in_menu();
    }//GEN-LAST:event_BT_TraSachActionPerformed

    private void BT_DanhsachPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DanhsachPhieuActionPerformed
        // TODO add your handling code here:
        danhsachphieu_in_menu();
    }//GEN-LAST:event_BT_DanhsachPhieuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_DanhsachPhieu;
    private javax.swing.JButton BT_MuonSach;
    private javax.swing.JButton BT_ThuTienPhat;
    private javax.swing.JButton BT_TraSach;
    private javax.swing.JLabel LB_muonsach_menu;
    // End of variables declaration//GEN-END:variables
}
