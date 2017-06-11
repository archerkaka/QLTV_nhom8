/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import static Controller.controller.delete_book_controller;
import static Controller.controller.find_book_by_ms;
import static Controller.controller.find_book_by_ts;
import static Controller.controller.getTenTacGia;
import static Controller.controller.getTheLoai;
import static Controller.controller.get_all_book_controller;
import static Controller.controller.get_matacgia;
import static Controller.controller.get_matheloai;
import static Controller.controller.get_tentacgia_by_matacgia;
import static Controller.controller.get_theloai_by_matheloai;
import static Controller.controller.update_sach_controller;
import DAL.Sach_Entity;
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
public class ThongTinSach extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinSach
     */
    int rowNumber = 10000000;
    static ArrayList<Sach_Entity> booklist = new ArrayList<>();
    public ThongTinSach() {
        initComponents();
        set_disable();
       CB_CachTimKiem.removeAllItems();
       CB_CachTimKiem.addItem("Tất cả");
       CB_CachTimKiem.addItem("Tên Sách");
       CB_CachTimKiem.addItem("Mã Sách");      
       push_data_to_table(get_all_book_controller());
       jTable1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e){
                    rowNumber = jTable1.getSelectedRow();
                    loadDataTOView(rowNumber);                   
                }   
       });
       CB_TacGia.removeAllItems();
       CB_TheLoai.removeAllItems();
       int size_tentacgia = getTenTacGia().size();
        for(int i=0; i < size_tentacgia; i++){
            CB_TacGia.addItem(getTenTacGia().get(i).toString());
        }
        int size_theloai = getTheLoai().size();
         for(int i=0; i < size_theloai; i++){
            CB_TheLoai.addItem(getTheLoai().get(i).toString());
        }
    }
    
    public void loadDataTOView(int rowNumber){
        TF_MaSach.setText(booklist.get(rowNumber).get_masach());
        TF_TenSach.setText(booklist.get(rowNumber).get_tensach());
        TF_NXB.setText(booklist.get(rowNumber).get_nhaxuatban());
        FF_NamSuatBan.setText(Integer.toString(booklist.get(rowNumber).get_namexuatban()));
        FF_TriGia.setText(Integer.toString(booklist.get(rowNumber).get_trigia()));
        SN_SoLuong.setValue(Integer.valueOf(booklist.get(rowNumber).get_soluongton()));
        String tentacgia= get_tentacgia_by_matacgia(booklist.get(rowNumber).get_matg());
        String theloai = get_theloai_by_matheloai(booklist.get(rowNumber).get_matl());
        CB_TacGia.setSelectedItem(tentacgia);
        CB_TheLoai.setSelectedItem(theloai);
    }
    private void set_disable(){
        TF_MaSach.setEditable(false);
        TF_TenSach.setEditable(false);
        TF_NXB.setEditable(false);
        FF_NamSuatBan.setEditable(false);
        FF_TriGia.setEditable(false);
        CB_TacGia.setEditable(false);
        CB_TheLoai.setEditable(false);
        BT_luu.setEnabled(false);             
    }
    private void set_enable(){
        TF_MaSach.setEditable(true);
        TF_TenSach.setEditable(true);
        TF_NXB.setEditable(true);
        FF_NamSuatBan.setEditable(true);
        FF_TriGia.setEditable(true);
        CB_TacGia.setEditable(true);
        CB_TheLoai.setEditable(true);
        BT_luu.setEnabled(true);             
    }
    static public void reload_book_data_table(){
        push_data_to_table(get_all_book_controller());
    }
    static public void push_data_to_table(ArrayList<Sach_Entity> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector cols = new Vector();
        booklist = list;
       cols.add("Mã Sách");
       cols.add("Tên Sách");
       cols.add("Thể Loại");
       cols.add("Tác Giả");
       cols.add("Năm Xuất Bản");
       cols.add("Nhà Xuất Bản");
       cols.add("Giá Trị");
       cols.add("Ngày Nhập");
       cols.add("Số Lượng Tồn");
       Vector rowData = new Vector(); 
       for (Sach_Entity data : booklist){
           Vector row = new Vector();
           row.add(data.get_masach());
           row.add(data.get_tensach());
           row.add(data.get_matl());
           row.add(data.get_matg());
           row.add(data.get_namexuatban());
           row.add(data.get_nhaxuatban());
           row.add(data.get_trigia());
           row.add(data.get_ngaynhap());
           row.add(data.get_soluongton());
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

        LB_cachtimkiem = new javax.swing.JLabel();
        LB_tutimkiem = new javax.swing.JLabel();
        CB_CachTimKiem = new javax.swing.JComboBox<>();
        TF_TuTimKiem = new javax.swing.JTextField();
        BT_tim = new javax.swing.JButton();
        LB_masach = new javax.swing.JLabel();
        TF_MaSach = new javax.swing.JTextField();
        LB_tensach = new javax.swing.JLabel();
        TF_TenSach = new javax.swing.JTextField();
        LB_tacgia = new javax.swing.JLabel();
        CB_TacGia = new javax.swing.JComboBox<>();
        LB_soluong = new javax.swing.JLabel();
        SN_SoLuong = new javax.swing.JSpinner();
        LB_trigia = new javax.swing.JLabel();
        FF_NamSuatBan = new javax.swing.JFormattedTextField();
        LB_namxuatban = new javax.swing.JLabel();
        LB_nxb = new javax.swing.JLabel();
        TF_NXB = new javax.swing.JTextField();
        CB_TheLoai = new javax.swing.JComboBox<>();
        LB_theloai = new javax.swing.JLabel();
        BT_sua = new javax.swing.JButton();
        BT_xoa = new javax.swing.JButton();
        BT_luu = new javax.swing.JButton();
        BT_huy = new javax.swing.JButton();
        PN_thongtinsach_ketqua = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FF_TriGia = new javax.swing.JTextField();

        LB_cachtimkiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_cachtimkiem.setText("Cách tìm kiếm");

        LB_tutimkiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tutimkiem.setText("Từ tìm kiếm");

        CB_CachTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_CachTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TF_TuTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        BT_tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongtinsach.png"))); // NOI18N
        BT_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_timActionPerformed(evt);
            }
        });

        LB_masach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_masach.setText("Mã sách");

        TF_MaSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_tensach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tensach.setText("Tên sách");

        TF_TenSach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_tacgia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_tacgia.setText("Tác giả");

        CB_TacGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_TacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LB_soluong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_soluong.setText("Số lượng");

        SN_SoLuong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_trigia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_trigia.setText("Trị giá");

        FF_NamSuatBan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        FF_NamSuatBan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LB_namxuatban.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_namxuatban.setText("Năm suất bản");

        LB_nxb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_nxb.setText("NXB");

        TF_NXB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        CB_TheLoai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CB_TheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LB_theloai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LB_theloai.setText("Thể loại");

        BT_sua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_sua.setText("Sửa");
        BT_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_suaActionPerformed(evt);
            }
        });

        BT_xoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_xoa.setText("Xoá");
        BT_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_xoaActionPerformed(evt);
            }
        });

        BT_luu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_luu.setText("Lưu");
        BT_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_luuActionPerformed(evt);
            }
        });

        BT_huy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BT_huy.setText("Huỷ");
        BT_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_huyActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Thể Loại", "Tác Giả", "Số Lượng", "NXB", "Năm Sản Xuất"
            }
        ));
        PN_thongtinsach_ketqua.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_cachtimkiem)
                            .addComponent(LB_tutimkiem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CB_CachTimKiem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_TuTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(BT_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_sua)
                        .addGap(119, 119, 119)
                        .addComponent(BT_xoa)
                        .addGap(117, 117, 117)
                        .addComponent(BT_luu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_huy)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LB_soluong)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_TacGia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SN_SoLuong))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(LB_trigia)
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LB_namxuatban)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LB_tensach)
                                            .addComponent(LB_tacgia))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TF_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TF_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(LB_masach))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB_theloai)
                                    .addComponent(LB_nxb))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_NXB)
                            .addComponent(FF_NamSuatBan)
                            .addComponent(CB_TheLoai, 0, 191, Short.MAX_VALUE)
                            .addComponent(FF_TriGia))
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PN_thongtinsach_ketqua))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_masach)
                            .addComponent(LB_theloai)
                            .addComponent(TF_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_TheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_tensach)
                            .addComponent(LB_nxb)
                            .addComponent(TF_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_tacgia)
                            .addComponent(LB_namxuatban)
                            .addComponent(CB_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FF_NamSuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_soluong)
                            .addComponent(LB_trigia)
                            .addComponent(SN_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FF_TriGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_cachtimkiem)
                            .addComponent(CB_CachTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_tutimkiem)
                            .addComponent(TF_TuTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BT_tim)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_sua)
                    .addComponent(BT_xoa)
                    .addComponent(BT_luu)
                    .addComponent(BT_huy))
                .addGap(18, 18, 18)
                .addComponent(PN_thongtinsach_ketqua, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BT_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_timActionPerformed
        // TODO add your handling code here:
        if (CB_CachTimKiem.getSelectedItem() == "Tất cả"){
            JOptionPane.showMessageDialog(null, "tatca" ,
                  "Title", JOptionPane.WARNING_MESSAGE);
            push_data_to_table(get_all_book_controller());
            return;
        }
        if (TF_TuTimKiem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Nhập từ khóa tìm kiếm!!!" ,
                  "Title", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (CB_CachTimKiem.getSelectedItem() == "Tên Sách"){
            JOptionPane.showMessageDialog(null, "tensach" ,
                  "Title", JOptionPane.WARNING_MESSAGE);
            push_data_to_table(find_book_by_ts(TF_TuTimKiem.getText()));
        }
        if (CB_CachTimKiem.getSelectedItem() == "Mã Sách"){
            JOptionPane.showMessageDialog(null, "masach" ,
                  "Title", JOptionPane.WARNING_MESSAGE);
            push_data_to_table(find_book_by_ms(TF_TuTimKiem.getText()));
        }
        
    }//GEN-LAST:event_BT_timActionPerformed

    private void BT_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_suaActionPerformed
        // TODO add your handling code here:
        set_enable();
    }//GEN-LAST:event_BT_suaActionPerformed

    private void BT_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_luuActionPerformed
        // TODO add your handling code here:
        String masach = TF_MaSach.getText();
        if (masach.length() ==0 ) return;
        String tensach = TF_TenSach.getText();
        String matl = get_matheloai(CB_TheLoai.getSelectedItem().toString());
        String matg = get_matacgia(CB_TacGia.getSelectedItem().toString());
        int namxuatban = Integer.parseInt(FF_NamSuatBan.getText());
        String nhaxuatban = TF_NXB.getText();
        float trigia = Integer.parseInt(FF_TriGia.getText());
        int soluongton = (Integer)SN_SoLuong.getValue();
        if (update_sach_controller(masach, tensach, matl, matg, namxuatban, nhaxuatban, trigia, soluongton) == true){
            set_disable();
            push_data_to_table(get_all_book_controller());
        }
    }//GEN-LAST:event_BT_luuActionPerformed

    private void BT_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_huyActionPerformed
        // TODO add your handling code here:
        if (rowNumber == 10000000) return;
        loadDataTOView(rowNumber);   
        set_disable();
        
    }//GEN-LAST:event_BT_huyActionPerformed

    private void BT_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_xoaActionPerformed
        // TODO add your handling code here:
        if (rowNumber == 10000000) return;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc muốn xóa?" ,"Warning", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            delete_book_controller(booklist.get(rowNumber).get_masach());
            push_data_to_table(get_all_book_controller()); 
        }else{
            return;
        }
    }//GEN-LAST:event_BT_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_huy;
    private javax.swing.JButton BT_luu;
    private javax.swing.JButton BT_sua;
    private javax.swing.JButton BT_tim;
    private javax.swing.JButton BT_xoa;
    private javax.swing.JComboBox<String> CB_CachTimKiem;
    private javax.swing.JComboBox<String> CB_TacGia;
    private javax.swing.JComboBox<String> CB_TheLoai;
    private javax.swing.JFormattedTextField FF_NamSuatBan;
    private javax.swing.JTextField FF_TriGia;
    private javax.swing.JLabel LB_cachtimkiem;
    private javax.swing.JLabel LB_masach;
    private javax.swing.JLabel LB_namxuatban;
    private javax.swing.JLabel LB_nxb;
    private javax.swing.JLabel LB_soluong;
    private javax.swing.JLabel LB_tacgia;
    private javax.swing.JLabel LB_tensach;
    private javax.swing.JLabel LB_theloai;
    private javax.swing.JLabel LB_trigia;
    private javax.swing.JLabel LB_tutimkiem;
    private javax.swing.JScrollPane PN_thongtinsach_ketqua;
    private javax.swing.JSpinner SN_SoLuong;
    private javax.swing.JTextField TF_MaSach;
    private javax.swing.JTextField TF_NXB;
    private javax.swing.JTextField TF_TenSach;
    private javax.swing.JTextField TF_TuTimKiem;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
