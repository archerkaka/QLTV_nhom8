/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import static Controller.login_controller.get_username;
import static Controller.login_controller.logout;
import Jpanel.DanhSachPhieu;
import Jpanel.DocGia_menu;
import Jpanel.DoiMatKhau;
import Jpanel.HeThong_menu;
import Jpanel.LapTheDocGia;
import Jpanel.MuonSach;
import Jpanel.TrangChu;
import Jpanel.MuonTraSach_menu;
import Jpanel.Sach_menu;
import Jpanel.TaiKhoan_menu;
import Jpanel.ThayDoiQuyDinh;
import Jpanel.ThemSach;
import Jpanel.ThongTinDocGia;
import Jpanel.ThongTinPhienBan;
import Jpanel.ThongTinSach;
import Jpanel.ThongTinTaiKhoan;
import Jpanel.ThuTienPhat;
import Jpanel.TraSach;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class mainframe extends javax.swing.JFrame {
    GridBagLayout grid1= new GridBagLayout();
    FlowLayout grid2=new FlowLayout();
    GridLayout grid3= new GridLayout();
    BorderLayout grid4 = new BorderLayout();
    static JPanel current_active_menu;
    static JPanel current_active_in_menu;
    
    static TrangChu trangchu;
    static Sach_menu sach_menu;
    static ThemSach themsach;
    static ThongTinSach thongtinsach;
    static DocGia_menu docgia_menu;
    static LapTheDocGia lapthedocgia;
    static ThongTinDocGia thongtindocgia;
    static MuonTraSach_menu muontrasach_menu;
    static MuonSach muonsach;
    static TraSach trasach;
    static ThuTienPhat thutienphat;
    static DanhSachPhieu danhsachphieu;
    static TaiKhoan_menu taikhoan_menu;
    static HeThong_menu hethong_menu;
    static ThayDoiQuyDinh thaydoiquydinh;
    static DoiMatKhau doimatkhau;
    static ThongTinTaiKhoan thongtintaikhoan;
    static ThongTinPhienBan thongtinphienban;
    /**
     * Creates new form mainframe
     */
    public mainframe() {
        initComponents();
        
        trangchu=new TrangChu();
        themsach = new ThemSach();
        thongtinsach = new ThongTinSach();
        lapthedocgia = new LapTheDocGia();
        thongtindocgia= new ThongTinDocGia();
        trasach = new TraSach();
        muonsach = new MuonSach();
        thutienphat = new ThuTienPhat();
        danhsachphieu = new DanhSachPhieu();
        thaydoiquydinh = new ThayDoiQuyDinh();
        thongtintaikhoan = new ThongTinTaiKhoan();
        doimatkhau = new DoiMatKhau();
        thongtinphienban = new ThongTinPhienBan();
        
        in_menu_panel.setLayout(grid1);
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.gridx = 0;
        gc1.gridy = 0;
        in_menu_panel.add(trangchu, gc1);
        in_menu_panel.add(themsach, gc1);
        in_menu_panel.add(thongtinsach, gc1);
        in_menu_panel.add(thongtindocgia, gc1);
        in_menu_panel.add(lapthedocgia, gc1);
        in_menu_panel.add(muonsach, gc1);
        in_menu_panel.add(trasach, gc1);
        in_menu_panel.add(thutienphat, gc1);
        in_menu_panel.add(danhsachphieu, gc1);
        in_menu_panel.add(thaydoiquydinh, gc1);
        in_menu_panel.add(thongtintaikhoan, gc1);
        in_menu_panel.add(doimatkhau, gc1);
        in_menu_panel.add(thongtinphienban, gc1);
        trangchu.setVisible(true);
        themsach.setVisible(false);
        thongtinsach.setVisible(false);
        thongtindocgia.setVisible(false);
        lapthedocgia.setVisible(false);
        muonsach.setVisible(false);
        trasach.setVisible(false);
        thutienphat.setVisible(false);
        danhsachphieu.setVisible(false);
        thaydoiquydinh.setVisible(false);
        thongtintaikhoan.setVisible(false);
        doimatkhau.setVisible(false);
        thongtinphienban.setVisible(false);
        current_active_in_menu = trangchu;
        current_active_menu = trangchu;
        
        
        sach_menu = new Sach_menu();
        docgia_menu = new DocGia_menu();
        muontrasach_menu = new MuonTraSach_menu();
        hethong_menu = new HeThong_menu();
        taikhoan_menu = new TaiKhoan_menu();
        menu_panel.setLayout(grid1);
        GridBagConstraints gc2 = new GridBagConstraints();
        gc2.gridx = 0;
        gc2.gridy = 0;
        menu_panel.add(sach_menu, gc2);
        menu_panel.add(docgia_menu, gc2);
        menu_panel.add(muontrasach_menu, gc2);
        menu_panel.add(hethong_menu, gc2);
        menu_panel.add(taikhoan_menu, gc2);
        sach_menu.setVisible(false);
        docgia_menu.setVisible(false);
        muontrasach_menu.setVisible(false);
        hethong_menu.setVisible(false);
        taikhoan_menu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PN_thongtinphienban_mainmenu1 = new javax.swing.JPanel();
        BT_trangchu1 = new javax.swing.JButton();
        BT_sach1 = new javax.swing.JButton();
        BT_docgia1 = new javax.swing.JButton();
        BT_muontrasach1 = new javax.swing.JButton();
        BT_thongke1 = new javax.swing.JButton();
        BT_hethong1 = new javax.swing.JButton();
        BT_taikhoan1 = new javax.swing.JButton();
        BT_dangxuat1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menu_panel = new javax.swing.JPanel();
        in_menu_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PN_thongtinphienban_mainmenu1.setBackground(new java.awt.Color(0, 102, 255));
        PN_thongtinphienban_mainmenu1.setAlignmentX(0.0F);
        PN_thongtinphienban_mainmenu1.setAlignmentY(0.0F);

        BT_trangchu1.setBackground(new java.awt.Color(0, 102, 255));
        BT_trangchu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_trangchu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trangchu.png"))); // NOI18N
        BT_trangchu1.setText("Trang Chủ");
        BT_trangchu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_trangchu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_trangchu1MouseClicked(evt);
            }
        });
        BT_trangchu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_trangchu1ActionPerformed(evt);
            }
        });

        BT_sach1.setBackground(new java.awt.Color(0, 102, 255));
        BT_sach1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_sach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sach.png"))); // NOI18N
        BT_sach1.setText("Sách");
        BT_sach1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_sach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_sach1MouseClicked(evt);
            }
        });
        BT_sach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_sach1ActionPerformed(evt);
            }
        });

        BT_docgia1.setBackground(new java.awt.Color(0, 102, 255));
        BT_docgia1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_docgia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/docgia.png"))); // NOI18N
        BT_docgia1.setText("Độc Giả");
        BT_docgia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_docgia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_docgia1ActionPerformed(evt);
            }
        });

        BT_muontrasach1.setBackground(new java.awt.Color(0, 102, 255));
        BT_muontrasach1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_muontrasach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/muonsach.png"))); // NOI18N
        BT_muontrasach1.setText("Mượn Trả Sách");
        BT_muontrasach1.setAlignmentY(0.0F);
        BT_muontrasach1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_muontrasach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_muontrasach1ActionPerformed(evt);
            }
        });

        BT_thongke1.setBackground(new java.awt.Color(0, 102, 255));
        BT_thongke1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thongke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongke.png"))); // NOI18N
        BT_thongke1.setText("Thống Kê");
        BT_thongke1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_hethong1.setBackground(new java.awt.Color(0, 102, 255));
        BT_hethong1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_hethong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hethong.png"))); // NOI18N
        BT_hethong1.setText("Hệ Thống");
        BT_hethong1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_hethong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_hethong1ActionPerformed(evt);
            }
        });

        BT_taikhoan1.setBackground(new java.awt.Color(0, 102, 255));
        BT_taikhoan1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_taikhoan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/taikhoan.png"))); // NOI18N
        BT_taikhoan1.setText("Tài Khoản");
        BT_taikhoan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_taikhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_taikhoan1ActionPerformed(evt);
            }
        });

        BT_dangxuat1.setBackground(new java.awt.Color(0, 102, 255));
        BT_dangxuat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_dangxuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dangxuat.png"))); // NOI18N
        BT_dangxuat1.setText("Đăng Xuất");
        BT_dangxuat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_dangxuat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_dangxuat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PN_thongtinphienban_mainmenu1Layout = new javax.swing.GroupLayout(PN_thongtinphienban_mainmenu1);
        PN_thongtinphienban_mainmenu1.setLayout(PN_thongtinphienban_mainmenu1Layout);
        PN_thongtinphienban_mainmenu1Layout.setHorizontalGroup(
            PN_thongtinphienban_mainmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_sach1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_docgia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_muontrasach1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
            .addComponent(BT_thongke1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_hethong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_taikhoan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_dangxuat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_trangchu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_thongtinphienban_mainmenu1Layout.setVerticalGroup(
            PN_thongtinphienban_mainmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thongtinphienban_mainmenu1Layout.createSequentialGroup()
                .addComponent(BT_trangchu1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_sach1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_docgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_muontrasach1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_thongke1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_hethong1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_taikhoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_dangxuat1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout in_menu_panelLayout = new javax.swing.GroupLayout(in_menu_panel);
        in_menu_panel.setLayout(in_menu_panelLayout);
        in_menu_panelLayout.setHorizontalGroup(
            in_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1154, Short.MAX_VALUE)
        );
        in_menu_panelLayout.setVerticalGroup(
            in_menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(in_menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(in_menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PN_thongtinphienban_mainmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_thongtinphienban_mainmenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BT_trangchu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_trangchu1ActionPerformed
        current_active_in_menu.setVisible(false);
        current_active_menu.setVisible(false);
        trangchu.setVisible(true);
        current_active_in_menu = trangchu;
        current_active_menu = trangchu;
//        trangchu.setVisible(true);
    }//GEN-LAST:event_BT_trangchu1ActionPerformed
     static public void goto_hethong(){
     current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        hethong_menu.setVisible(true);
        thongtinphienban.setVisible(true);
        current_active_in_menu = thongtinphienban;
        current_active_menu = hethong_menu;
     }
    private void BT_hethong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_hethong1ActionPerformed
        // TODO add your handling code here:
        current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        hethong_menu.setVisible(true);
        thongtinphienban.setVisible(true);
        current_active_in_menu = thongtinphienban;
        current_active_menu = hethong_menu;
    }//GEN-LAST:event_BT_hethong1ActionPerformed
    static public void thongtinphienban_in_menu(){
        current_active_in_menu.setVisible(false);
        thongtinphienban.setVisible(true);
        current_active_in_menu = thongtinphienban;
        current_active_menu = hethong_menu;
    }
    static public void thaydoiquydinh_in_menu(){
        current_active_in_menu.setVisible(false);
        thaydoiquydinh.setVisible(true);
        current_active_in_menu = thaydoiquydinh;
        current_active_menu = hethong_menu;
    }
    static public void goto_thongtinsach(){
        current_active_in_menu.setVisible(false);
        current_active_menu.setVisible(false);
        sach_menu.setVisible(true);
        themsach.setVisible(true);
        current_active_menu = sach_menu;
        current_active_in_menu = themsach; 
    }
    private void BT_sach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_sach1ActionPerformed
       
        current_active_in_menu.setVisible(false);
        current_active_menu.setVisible(false);
        sach_menu.setVisible(true);
        themsach.setVisible(true);
        current_active_menu = sach_menu;
        current_active_in_menu = themsach; 
    }//GEN-LAST:event_BT_sach1ActionPerformed
    public static void thongtinsach_in_menu(){
        current_active_in_menu.setVisible(false);
        thongtinsach.setVisible(true);
        current_active_menu = sach_menu;
        current_active_in_menu = thongtinsach;
    }
    public static void themsach_in_menu(){
        current_active_in_menu.setVisible(false);
        themsach.setVisible(true);
        current_active_menu = sach_menu;
        current_active_in_menu = themsach;
    }
    private void BT_trangchu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_trangchu1MouseClicked
        
    }//GEN-LAST:event_BT_trangchu1MouseClicked

    private void BT_sach1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_sach1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_sach1MouseClicked
    static public void goto_thongtindocgia(){
        current_active_in_menu.setVisible(false);
        current_active_menu.setVisible(false);
        docgia_menu.setVisible(true);
        lapthedocgia.setVisible(true);
        current_active_menu = docgia_menu;
        current_active_in_menu = lapthedocgia;
    }
    private void BT_docgia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_docgia1ActionPerformed
        // TODO add your handling code here:
        current_active_in_menu.setVisible(false);
        current_active_menu.setVisible(false);
        docgia_menu.setVisible(true);
        lapthedocgia.setVisible(true);
        current_active_menu = docgia_menu;
        current_active_in_menu = lapthedocgia;
    }//GEN-LAST:event_BT_docgia1ActionPerformed
    public static void lapthedocgia_in_menu()
    {
        current_active_in_menu.setVisible(false);
        lapthedocgia.setVisible(true);
        current_active_menu = docgia_menu;
        current_active_in_menu = lapthedocgia;
    }
    public static void thongtindocgia_in_menu()
    {
        current_active_in_menu.setVisible(false);
        thongtindocgia.setVisible(true);
        current_active_menu = docgia_menu;
        current_active_in_menu = thongtindocgia;
    }
    static public void goto_muontrasach(){
        current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        muontrasach_menu.setVisible(true);
        muonsach.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = muonsach;
    }
    private void BT_muontrasach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_muontrasach1ActionPerformed
        // TODO add your handling code here:
        current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        muontrasach_menu.setVisible(true);
        muonsach.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = muonsach;
    }//GEN-LAST:event_BT_muontrasach1ActionPerformed
    public static void muonsach_in_menu(){
        current_active_in_menu.setVisible(false);
        muonsach.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = muonsach; 
    }
    public static void trasach_in_menu(){
        current_active_in_menu.setVisible(false);
        trasach.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = trasach;
    }
    public static void danhsachphieu_in_menu(){
        current_active_in_menu.setVisible(false);
        danhsachphieu.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = danhsachphieu;
    }
    public static void thutienphat_in_menu(){
        current_active_in_menu.setVisible(false);
        thutienphat.setVisible(true);
        current_active_menu = muontrasach_menu;
        current_active_in_menu = thutienphat;
    }
     static public void goto_quanlytaikhoan(){
         current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        taikhoan_menu.setVisible(true);
        doimatkhau.setVisible(true);
        current_active_menu = taikhoan_menu;
        current_active_in_menu = doimatkhau;
     }
    private void BT_taikhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_taikhoan1ActionPerformed
        // TODO add your handling code here:
        current_active_menu.setVisible(false);
        current_active_in_menu.setVisible(false);
        taikhoan_menu.setVisible(true);
        doimatkhau.setVisible(true);
        current_active_menu = taikhoan_menu;
        current_active_in_menu = doimatkhau;
    }//GEN-LAST:event_BT_taikhoan1ActionPerformed

    private void BT_dangxuat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_dangxuat1ActionPerformed
        // TODO add your handling code here:
        logout();
        this.dispose();
    }//GEN-LAST:event_BT_dangxuat1ActionPerformed
    public static void doimatkhau_in_menu(){
        current_active_in_menu.setVisible(false);
        doimatkhau.setVisible(true);
        current_active_menu = taikhoan_menu;
        current_active_in_menu = doimatkhau;
    }
    public static void thongtintaikhoan_in_menu(){
        current_active_in_menu.setVisible(false);
        thongtintaikhoan.setVisible(true);
        current_active_menu = taikhoan_menu;
        current_active_in_menu = thongtintaikhoan;
    }
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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_dangxuat1;
    private javax.swing.JButton BT_docgia1;
    private javax.swing.JButton BT_hethong1;
    private javax.swing.JButton BT_muontrasach1;
    private javax.swing.JButton BT_sach1;
    private javax.swing.JButton BT_taikhoan1;
    private javax.swing.JButton BT_thongke1;
    private javax.swing.JButton BT_trangchu1;
    private javax.swing.JPanel PN_thongtinphienban_mainmenu1;
    private javax.swing.JPanel in_menu_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu_panel;
    // End of variables declaration//GEN-END:variables
}
