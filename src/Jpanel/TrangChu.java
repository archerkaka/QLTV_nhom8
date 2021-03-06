/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Controller.login_controller.get_current_user_permission;
import static Controller.login_controller.get_username;
import static Jframe.mainframe.danhsachphieu_in_menu;
import static Jframe.mainframe.goto_hethong;
import static Jframe.mainframe.goto_muontrasach;
import static Jframe.mainframe.goto_quanlytaikhoan;
import static Jframe.mainframe.goto_thongtindocgia;
import static Jframe.mainframe.goto_thongtinsach;
import static Jframe.mainframe.lapthedocgia_in_menu;
import static Jframe.mainframe.muonsach_in_menu;
import static Jframe.mainframe.themsach_in_menu;
import static Jframe.mainframe.thongtindocgia_in_menu;
import static Jframe.mainframe.thongtinsach_in_menu;
import static Jframe.mainframe.thongtintaikhoan_in_menu;
import static Jframe.mainframe.thutienphat_in_menu;
import static Jframe.mainframe.trasach_in_menu;
import static Jpanel.HeThong_menu.thaydoiquydinh;

/**
 *
 * @author Admin
 */
public class TrangChu extends javax.swing.JPanel {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BT_ThongTinSach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BT_ThongTinDocGia = new javax.swing.JButton();
        BT_LapPhieuMuonSach = new javax.swing.JButton();
        BT_LapPhieuTraSach = new javax.swing.JButton();
        BT_QuanLyPhieuLap = new javax.swing.JButton();
        BT_LapPhieuThuTien = new javax.swing.JButton();
        BT_QuanLyTaiKhoan = new javax.swing.JButton();
        BT_ThayDoiQuyDinh = new javax.swing.JButton();
        BT_ThongKeSachMuon = new javax.swing.JButton();
        BT_LapTheDocGia = new javax.swing.JButton();
        BT_ThemSach = new javax.swing.JButton();
        BT_ThongKeSachTraTre = new javax.swing.JButton();
        jb_name = new javax.swing.JLabel();
        jb_permission = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Bạn đăng nhập với tư cách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Xin chào,");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ĐẠI HỌC QUỐC GIA TP HỒ CHÍ MINH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TRƯỜNG ĐẠI HỌC CÔNG NGHỆ THÔNG TIN");

        BT_ThongTinSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThongTinSach.setText("Thông tin sách");
        BT_ThongTinSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThongTinSachActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chọn một tác vụ để bắt đầu :");

        BT_ThongTinDocGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThongTinDocGia.setText("Thông tin độc giả");
        BT_ThongTinDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThongTinDocGiaActionPerformed(evt);
            }
        });

        BT_LapPhieuMuonSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_LapPhieuMuonSach.setText("Lập phiểu mượn sách");
        BT_LapPhieuMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LapPhieuMuonSachActionPerformed(evt);
            }
        });

        BT_LapPhieuTraSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_LapPhieuTraSach.setText("Lập phiếu trả sách");
        BT_LapPhieuTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LapPhieuTraSachActionPerformed(evt);
            }
        });

        BT_QuanLyPhieuLap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_QuanLyPhieuLap.setText("Quản lý phiếu lập");
        BT_QuanLyPhieuLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_QuanLyPhieuLapActionPerformed(evt);
            }
        });

        BT_LapPhieuThuTien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_LapPhieuThuTien.setText("Lập phiếu thu tiền");
        BT_LapPhieuThuTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LapPhieuThuTienActionPerformed(evt);
            }
        });

        BT_QuanLyTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_QuanLyTaiKhoan.setText("Quản lý tài khoản");
        BT_QuanLyTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_QuanLyTaiKhoanActionPerformed(evt);
            }
        });

        BT_ThayDoiQuyDinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThayDoiQuyDinh.setText("Thay đổi quy định");
        BT_ThayDoiQuyDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThayDoiQuyDinhActionPerformed(evt);
            }
        });

        BT_ThongKeSachMuon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThongKeSachMuon.setText("Thống kê sách mượn");
        BT_ThongKeSachMuon.setToolTipText("");
        BT_ThongKeSachMuon.setActionCommand("Thống kê sách \nmượn theo thể loại");
        BT_ThongKeSachMuon.setAlignmentX(32.0F);
        BT_ThongKeSachMuon.setAlignmentY(32.0F);
        BT_ThongKeSachMuon.setAutoscrolls(true);
        BT_ThongKeSachMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThongKeSachMuonActionPerformed(evt);
            }
        });

        BT_LapTheDocGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_LapTheDocGia.setText("Lập thẻ độc giả");
        BT_LapTheDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LapTheDocGiaActionPerformed(evt);
            }
        });

        BT_ThemSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThemSach.setText("Thêm Sách");
        BT_ThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThemSachActionPerformed(evt);
            }
        });

        BT_ThongKeSachTraTre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_ThongKeSachTraTre.setText("Thống kê sách trả trễ");
        BT_ThongKeSachTraTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ThongKeSachTraTreActionPerformed(evt);
            }
        });

        jb_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_name.setText("...");

        jb_permission.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_permission.setForeground(new java.awt.Color(51, 51, 255));
        jb_permission.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_permission, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BT_ThongKeSachTraTre)
                                            .addComponent(BT_ThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BT_LapTheDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BT_ThongKeSachMuon)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BT_ThongTinSach, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BT_ThongTinDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_QuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT_LapPhieuThuTien, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT_LapPhieuMuonSach))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BT_QuanLyPhieuLap, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BT_LapPhieuTraSach))
                                    .addComponent(BT_ThayDoiQuyDinh))
                                .addContainerGap(47, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jb_name))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jb_permission))
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_ThongTinSach, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_ThongTinDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_LapPhieuMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_LapPhieuTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_ThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_LapTheDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_LapPhieuThuTien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_QuanLyPhieuLap, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_ThongKeSachTraTre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_ThongKeSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_QuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_ThayDoiQuyDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents
    public static void set_TrangChu_username(){
        String username = get_username();
        String permission = get_current_user_permission();
        jb_name.setText(username);
        jb_permission.setText(permission);
        
    }
    private void BT_ThongKeSachMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThongKeSachMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_ThongKeSachMuonActionPerformed

    private void BT_ThongKeSachTraTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThongKeSachTraTreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_ThongKeSachTraTreActionPerformed

    private void BT_ThongTinSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThongTinSachActionPerformed
        // TODO add your handling code here:
        goto_thongtinsach();
        thongtinsach_in_menu();
    }//GEN-LAST:event_BT_ThongTinSachActionPerformed

    private void BT_ThongTinDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThongTinDocGiaActionPerformed
        // TODO add your handling code here:
        goto_thongtindocgia();
        thongtindocgia_in_menu();
    }//GEN-LAST:event_BT_ThongTinDocGiaActionPerformed

    private void BT_LapPhieuMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LapPhieuMuonSachActionPerformed
        // TODO add your handling code here:
        goto_muontrasach();
        muonsach_in_menu();
    }//GEN-LAST:event_BT_LapPhieuMuonSachActionPerformed

    private void BT_LapPhieuTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LapPhieuTraSachActionPerformed
        // TODO add your handling code here:
        goto_muontrasach();
        trasach_in_menu();
    }//GEN-LAST:event_BT_LapPhieuTraSachActionPerformed

    private void BT_ThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThemSachActionPerformed
        // TODO add your handling code here:
        goto_thongtinsach();
        themsach_in_menu();
    }//GEN-LAST:event_BT_ThemSachActionPerformed

    private void BT_LapTheDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LapTheDocGiaActionPerformed
        // TODO add your handling code here:
        goto_thongtindocgia();
        lapthedocgia_in_menu();
    }//GEN-LAST:event_BT_LapTheDocGiaActionPerformed

    private void BT_LapPhieuThuTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LapPhieuThuTienActionPerformed
        // TODO add your handling code here:
        goto_muontrasach();
        thutienphat_in_menu();
    }//GEN-LAST:event_BT_LapPhieuThuTienActionPerformed

    private void BT_QuanLyPhieuLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_QuanLyPhieuLapActionPerformed
        // TODO add your handling code here:
        goto_muontrasach();
        danhsachphieu_in_menu();
    }//GEN-LAST:event_BT_QuanLyPhieuLapActionPerformed

    private void BT_QuanLyTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_QuanLyTaiKhoanActionPerformed
        // TODO add your handling code here:
        goto_quanlytaikhoan();
        thongtintaikhoan_in_menu();
    }//GEN-LAST:event_BT_QuanLyTaiKhoanActionPerformed

    private void BT_ThayDoiQuyDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ThayDoiQuyDinhActionPerformed
        // TODO add your handling code here:
        goto_hethong();
        thaydoiquydinh();
    }//GEN-LAST:event_BT_ThayDoiQuyDinhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_LapPhieuMuonSach;
    private javax.swing.JButton BT_LapPhieuThuTien;
    private javax.swing.JButton BT_LapPhieuTraSach;
    private javax.swing.JButton BT_LapTheDocGia;
    private javax.swing.JButton BT_QuanLyPhieuLap;
    private javax.swing.JButton BT_QuanLyTaiKhoan;
    private javax.swing.JButton BT_ThayDoiQuyDinh;
    private javax.swing.JButton BT_ThemSach;
    private javax.swing.JButton BT_ThongKeSachMuon;
    private javax.swing.JButton BT_ThongKeSachTraTre;
    private javax.swing.JButton BT_ThongTinDocGia;
    private javax.swing.JButton BT_ThongTinSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jb_name;
    private static javax.swing.JLabel jb_permission;
    // End of variables declaration//GEN-END:variables
}
