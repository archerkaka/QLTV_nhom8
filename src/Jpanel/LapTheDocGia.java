/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

/**
 *
 * @author Admin
 */
public class LapTheDocGia extends javax.swing.JPanel {

    /**
     * Creates new form LapTheDocGia
     */
    public LapTheDocGia() {
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

        LB_madocgia = new javax.swing.JLabel();
        LB_hovaten = new javax.swing.JLabel();
        LB_cmnd = new javax.swing.JLabel();
        LB_mail = new javax.swing.JLabel();
        LB_diachi = new javax.swing.JLabel();
        TF_DiaChi = new javax.swing.JTextField();
        TF_mail = new javax.swing.JTextField();
        TF_cmnd = new javax.swing.JTextField();
        TF_HoVaTen = new javax.swing.JTextField();
        TF_MaDocGia = new javax.swing.JTextField();
        LB_ngaylapthe = new javax.swing.JLabel();
        LB_ngaysinh = new javax.swing.JLabel();
        LB_gioitinh = new javax.swing.JLabel();
        LB_loaidocgia = new javax.swing.JLabel();
        CB_LoaiDocGia = new javax.swing.JComboBox<>();
        CB_GioiTinh = new javax.swing.JComboBox<>();
        BT_save = new javax.swing.JButton();
        BT_reset = new javax.swing.JButton();
        Date_NgayLapThe = new com.toedter.calendar.JDateChooser();
        Date_NgaySinh = new com.toedter.calendar.JDateChooser();

        LB_madocgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_madocgia.setText("Mã độc giả");

        LB_hovaten.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_hovaten.setText("Họ và tên");

        LB_cmnd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_cmnd.setText("CMND");

        LB_mail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_mail.setText("Mail");

        LB_diachi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_diachi.setText("Địa chỉ");

        TF_DiaChi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_mail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TF_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_mailActionPerformed(evt);
            }
        });

        TF_cmnd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_HoVaTen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TF_MaDocGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_ngaylapthe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_ngaylapthe.setText("Ngày lập thẻ");

        LB_ngaysinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_ngaysinh.setText("Ngày sinh");

        LB_gioitinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_gioitinh.setText("Giới tính");

        LB_loaidocgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_loaidocgia.setText("Loại độc giả");

        CB_LoaiDocGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_LoaiDocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CB_GioiTinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Không xác định", " " }));

        BT_save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save1.png"))); // NOI18N
        BT_save.setText("Lưu Lại");

        BT_reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        BT_reset.setText("Làm Mới");

        Date_NgayLapThe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        Date_NgaySinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_diachi)
                    .addComponent(LB_mail)
                    .addComponent(LB_cmnd)
                    .addComponent(LB_hovaten)
                    .addComponent(LB_madocgia))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_HoVaTen)
                            .addComponent(TF_mail)
                            .addComponent(TF_cmnd)
                            .addComponent(TF_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_ngaysinh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_ngaylapthe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_gioitinh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_loaidocgia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_GioiTinh, 0, 417, Short.MAX_VALUE)
                            .addComponent(CB_LoaiDocGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date_NgayLapThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(TF_DiaChi))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_save)
                .addGap(97, 97, 97)
                .addComponent(BT_reset)
                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_madocgia)
                        .addComponent(TF_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LB_ngaylapthe))
                    .addComponent(Date_NgayLapThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_hovaten)
                        .addComponent(TF_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LB_ngaysinh))
                    .addComponent(Date_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_cmnd)
                    .addComponent(LB_gioitinh)
                    .addComponent(TF_cmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_mail)
                    .addComponent(TF_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_loaidocgia)
                    .addComponent(CB_LoaiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_diachi)
                    .addComponent(TF_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_save)
                    .addComponent(BT_reset))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_mailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_reset;
    private javax.swing.JButton BT_save;
    private javax.swing.JComboBox<String> CB_GioiTinh;
    private javax.swing.JComboBox<String> CB_LoaiDocGia;
    private com.toedter.calendar.JDateChooser Date_NgayLapThe;
    private com.toedter.calendar.JDateChooser Date_NgaySinh;
    private javax.swing.JLabel LB_cmnd;
    private javax.swing.JLabel LB_diachi;
    private javax.swing.JLabel LB_gioitinh;
    private javax.swing.JLabel LB_hovaten;
    private javax.swing.JLabel LB_loaidocgia;
    private javax.swing.JLabel LB_madocgia;
    private javax.swing.JLabel LB_mail;
    private javax.swing.JLabel LB_ngaylapthe;
    private javax.swing.JLabel LB_ngaysinh;
    private javax.swing.JTextField TF_DiaChi;
    private javax.swing.JTextField TF_HoVaTen;
    private javax.swing.JTextField TF_MaDocGia;
    private javax.swing.JTextField TF_cmnd;
    private javax.swing.JTextField TF_mail;
    // End of variables declaration//GEN-END:variables
}