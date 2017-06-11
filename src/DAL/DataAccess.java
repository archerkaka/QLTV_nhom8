/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author letra
 */
public class DataAccess {
    static Connection conn;
    // Kết nối vào SQLServer.
 // (Sử dụng thư viện điều khiển JTDS)
 public static Connection getSQLServerConnection()
         throws SQLException, ClassNotFoundException {
     String hostName = "localhost";
     String sqlInstanceName = "SQLEXPRESS";
     String database = "QuanLyThuVien";
     String userName = "sa";
     String password = "newpassword";
 
     return getSQLServerConnection(hostName, sqlInstanceName, database,
             userName, password);
 }
 
 
 // Trường hợp sử dụng SQLServer.
 // Và thư viện JTDS.
 public static Connection getSQLServerConnection(String hostName,
         String sqlInstanceName, String database, String userName,
         String password) throws ClassNotFoundException, SQLException {
     Class.forName("net.sourceforge.jtds.jdbc.Driver");
     String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/"
             + database + ";instance=" + sqlInstanceName;
 
     conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
    
    public static void closeConnection(){
         if (conn!=null)
             try {
                 if (!conn.isClosed())
                     conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
         conn=null;      
    }
    
    static ResultSet rs = null;
    static PreparedStatement ps ;
    String login_validation = "select * from TAIKHOAN where TenTK = ? and MatKhau = ?";
    String permission_defination = "select TenQuyen from QUYEN,TAIKHOAN where TAIKHOAN.TenTK=? and QUYEN.MaQuyen = TAIKHOAN.MaQuyen";
    public String login(String username, String password) throws SQLException, ClassNotFoundException{       
        try {
            
            ps = conn.prepareStatement(login_validation);
//            JOptionPane.showMessageDialog(null, "Dang nhap thanh cong!!!",
//                  "Title", JOptionPane.WARNING_MESSAGE);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.next()){
            
            return getPermission(username);
        }else{
            JOptionPane.showMessageDialog(null, "Dang nhap that bai",
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    static String unsave_all = "Update TAIKHOAN SET isSaved = 0";
    static String set_isSaved = "Update TAIKHOAN SET isSaved = 1 where TenTK = ? ";
    private static void unsave(){
        try {
            ps = conn.prepareStatement(unsave_all);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void set_isSaved(String username){
        try {
            unsave();
            ps = conn.prepareStatement(set_isSaved);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static String get_isSaved = "Select * from TAIKHOAN where isSaved = 1";
    public static String[] get_isSaved(){
        try {
            ps = conn.prepareStatement(get_isSaved);
            rs = ps.executeQuery();
            if (rs.next()){
                String[] taikhoan = {rs.getString("TenTK"),rs.getString("MatKhau")};
                return taikhoan;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
            
    private String getPermission(String username)
    {
        String permission = null;
        try {
            
            ps = conn.prepareStatement(permission_defination);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                permission = rs.getString("TenQuyen");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return permission;
    }
    
    static String getTenTacGia = "Select TenTG from TACGIA";
    public static ArrayList get_TenTacGia(){
        ArrayList name = new ArrayList();
        try {
            try {
                ps = conn.prepareStatement(getTenTacGia);
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = ps.executeQuery();
            while (rs.next())
            {
                name.add(rs.getString("TenTG"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    static String getTheLoai = "Select TenTL from THELOAI";
    public static ArrayList get_TheLoai(){
        ArrayList theloai = new ArrayList();
        try {
            try {
                ps = conn.prepareStatement(getTheLoai);
            } catch (SQLException ex) {
                Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = ps.executeQuery();
            while (rs.next())
            {
                theloai.add(rs.getString("TenTL"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return theloai;
    }
    static String get_username = "select TenNV from NHANVIEN, TAIKHOAN where TenTK = ? and NHANVIEN.MaNV = TAIKHOAN.MaNV";
    static public String get_username_DA(String username){
        try {
            ps = conn.prepareStatement(get_username);
            ps.setString(1, username);          
            rs = ps.executeQuery();
            while (rs.next())
            {
                
                return rs.getString("TenNV");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "unknown";
    }
    static String themsach = "insert into SACH VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    static public void add_new_book(String masach, String tensach, String matheloai, String matacgia, int namxuatban, String nhaxuatban, int trigia, Date ngaynhap, int soluong  ){
        int i = 0;
        try {
            ps = conn.prepareStatement(themsach);
            ps.setString(1, masach);
            ps.setString(2, tensach);
            ps.setString(3, matheloai);
            ps.setString(4, matacgia);
            ps.setInt(5, namxuatban);
            ps.setString(6, nhaxuatban);
            ps.setInt(7, trigia);
            ps.setDate(8, ngaynhap);
            ps.setInt(9, soluong);
            i = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (i !=0) JOptionPane.showMessageDialog(null, "Thêm thành công" ,
                  "Title", JOptionPane.WARNING_MESSAGE);
        else{
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
    }
    static String get_matacgia = "select MaTG From TACGIA where TenTG = ?";
    static public String get_maTG(String tentacgia){
        String maTG;
        try {
            ps = conn.prepareStatement(get_matacgia);
            ps.setString(1, tentacgia);
            rs = ps.executeQuery();
            while (rs.next()){ 
                return maTG = rs.getString("MaTG");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    static String get_matheloai = "select MaTL From THELOAI where TenTL = ?";
    static public String get_maTL(String tentheloai){
        String maTL;
        try {
            ps = conn.prepareStatement(get_matheloai);
            ps.setString(1, tentheloai);
            rs = ps.executeQuery();
            while (rs.next()){ 
                return maTL = rs.getString("MaTL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    static String get_book_by_code = "SELECT * FROM SACH WHERE MaSach = ?";
    static String get_book_by_name = "SELECT * FROM SACH WHERE TenSach = ?";
    static public ArrayList<Sach_Entity> get_book_list_by_name(String bookname){
        ArrayList<Sach_Entity> booklist = new ArrayList<>();
        try {            
            ps = conn.prepareStatement(get_book_by_name);
            ps.setString(1, bookname);
            rs = ps.executeQuery();
            if (rs.next()){
                Sach_Entity sach = new Sach_Entity();
                sach.set_masach(rs.getString("MaSach"));
                sach.set_tensach(rs.getString("TenSach"));
                sach.set_matg(rs.getString("MaTG"));
                sach.set_matl(rs.getString("MaTL"));
                sach.set_namxuatban(rs.getInt("NamXuatBan"));
                sach.set_nhaxuatban(rs.getString("NhaXuatBan"));
                sach.set_trigia(rs.getInt("TriGia"));
                sach.set_soluongton(rs.getInt("SoLuongTon"));
                sach.set_ngaynhap(rs.getDate("NgayNhap"));
                booklist.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booklist;
    }            
    static public ArrayList<Sach_Entity> get_book_list_by_code(String bookcode){
        ArrayList booklist = new ArrayList<>();
        try {           
            ps = conn.prepareStatement(get_book_by_name);
            ps.setString(1, bookcode);
            rs = ps.executeQuery();
            if (rs.next()){
                Sach_Entity sach = new Sach_Entity();
                sach.set_masach(rs.getString("MaSach"));
                sach.set_tensach(rs.getString("TenSach"));
                sach.set_matg(rs.getString("MaTG"));
                sach.set_matl(rs.getString("MaTL"));
                sach.set_namxuatban(rs.getInt("NamXuatBan"));
                sach.set_nhaxuatban(rs.getString("NhaXuatBan"));
                sach.set_trigia(rs.getInt("TriGia"));
                sach.set_soluongton(rs.getInt("SoLuongTon"));
                sach.set_ngaynhap(rs.getDate("NgayNhap"));
                booklist.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booklist;
    }
    static String get_all = "SELECT * FROM SACH";
    static public ArrayList<Sach_Entity> get_all_book(){
         ArrayList booklist = new ArrayList<>();
        try {           
            ps = conn.prepareStatement(get_all);
            rs = ps.executeQuery();
            while (rs.next()){
                Sach_Entity sach = new Sach_Entity();
                sach.set_masach(rs.getString("MaSach"));
                sach.set_tensach(rs.getString("TenSach"));
                sach.set_matg(rs.getString("MaTG"));
                sach.set_matl(rs.getString("MaTL"));
                sach.set_namxuatban(rs.getInt("NamXuatBan"));
                sach.set_nhaxuatban(rs.getString("NhaXuatBan"));
                sach.set_trigia(rs.getInt("TriGia"));
                sach.set_soluongton(rs.getInt("SoLuongTon"));
                sach.set_ngaynhap(rs.getDate("NgayNhap"));
                booklist.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booklist; 
    }
    static String get_tentacgia = "SELECT TenTG FROM TACGIA WHERE MaTG = ?";
    static public String get_tentacgia_by_matg(String matg){
        String tentacgia = "unknown";
        try {
            ps = conn.prepareStatement(get_tentacgia);
            ps.setString(1, matg);
            rs = ps.executeQuery();
            while (rs.next()){
                tentacgia = rs.getString("TenTG");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tentacgia;
    }
    static String get_tentheloai = "SELECT TenTL FROM THELOAI WHERE MaTL= ?";   
    static public String get_tentheloai_by_matl(String matl){
        String tentheloai = "unknown";
        try {
            ps = conn.prepareStatement(get_tentheloai);
            ps.setString(1, matl);
            rs = ps.executeQuery();
            while (rs.next()){
                tentheloai = rs.getString("TenTL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tentheloai;
    }
    static String find_sach_by_masach = "SELECT * FROM SACH WHERE MaSach LIKE ?";
    static public ArrayList<Sach_Entity> get_book_by_masach(String masach){
         ArrayList booklist = new ArrayList<>();
         String ms = "%"+masach+"%" ;
        try {          
            ps = conn.prepareStatement(find_sach_by_masach);
            ps.setString(1, ms);
            rs = ps.executeQuery();
            while (rs.next()){
                Sach_Entity sach = new Sach_Entity();
                sach.set_masach(rs.getString("MaSach"));
                sach.set_tensach(rs.getString("TenSach"));
                sach.set_matg(rs.getString("MaTG"));
                sach.set_matl(rs.getString("MaTL"));
                sach.set_namxuatban(rs.getInt("NamXuatBan"));
                sach.set_nhaxuatban(rs.getString("NhaXuatBan"));
                sach.set_trigia(rs.getInt("TriGia"));
                sach.set_soluongton(rs.getInt("SoLuongTon"));
                sach.set_ngaynhap(rs.getDate("NgayNhap"));               
                booklist.add(sach);
            }              
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booklist;
    }
    static String find_sach_by_tensach = "SELECT * FROM SACH WHERE TenSach LIKE ?";
    static public ArrayList<Sach_Entity> get_book_by_ten_sach(String tensach){
        ArrayList booklist = new ArrayList<>();
         String ms = "%"+tensach+"%" ;
        try {          
            ps = conn.prepareStatement(find_sach_by_tensach);
            ps.setString(1, ms);
            rs = ps.executeQuery();
            while (rs.next()){
                Sach_Entity sach = new Sach_Entity();
                sach.set_masach(rs.getString("MaSach"));
                sach.set_tensach(rs.getString("TenSach"));
                sach.set_matg(rs.getString("MaTG"));
                sach.set_matl(rs.getString("MaTL"));
                sach.set_namxuatban(rs.getInt("NamXuatBan"));
                sach.set_nhaxuatban(rs.getString("NhaXuatBan"));
                sach.set_trigia(rs.getInt("TriGia"));
                sach.set_soluongton(rs.getInt("SoLuongTon"));
                sach.set_ngaynhap(rs.getDate("NgayNhap"));
                booklist.add(sach);
            }              
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booklist;
    }
    static String changPassword = "Update TAIKHOAN Set MatKhau=? where TenTK=? and MatKhau=?";
    static public boolean updatePassword(String tentk, String matkhau, String matkhaumoi){
        int is_updated = 0;
        try {
            ps = conn.prepareStatement(changPassword);
            ps.setString(1, matkhaumoi);
            ps.setString(2, tentk);
            ps.setString(3, matkhau);
            is_updated = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (is_updated > 0){
            return true;
        }else{
            return false;
        }
    }
    static String get_all_nhanvien = "Select * from NHANVIEN Join TAIKHOAN ON NHANVIEN.MaNV = TAIKHOAN.MaNV";
    static public  ArrayList<Nhanvien_Entity> get_all_nv(){
         ArrayList nhanvienlist = new ArrayList<>();
        try {           
            ps = conn.prepareStatement(get_all_nhanvien);
            rs = ps.executeQuery();
            while (rs.next()){
                Nhanvien_Entity nhanvien = new Nhanvien_Entity();
                nhanvien.set_manhanvien(rs.getString("MaNV"));
                nhanvien.set_tennhanvien(rs.getString("TenNV"));
                nhanvien.set_gioitinh(rs.getString("GioiTinhNV"));
                nhanvien.set_cmnd(rs.getString("SoCMND"));
                nhanvien.set_ngaysinh(rs.getDate("NgaySinhNV"));
                nhanvien.set_taikhoan(rs.getString("TenTK"));
                nhanvien.set_matkhau(rs.getString("MatKhau"));
                nhanvien.set_maquyen(rs.getString("MaQuyen"));
                nhanvienlist.add(nhanvien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhanvienlist; 
    }
    static String update_sach="UPDATE SACH set MaSach = ?, TenSach = ?, MaTL = ?, MaTG = ?, NamXuatBan = ?, NhaXuatBan = ?, TriGia = ?, SoLuongTon = ? where MaSach=?";
    static public boolean update_sach(String masach, String tensach, String matl, String matg, int namxuatban, String nhaxuatban, float trigia, int soluongton){
        int is_updated = 0;
        try {
            ps = conn.prepareStatement(update_sach);
            ps.setString(1, masach);
            ps.setString(2, tensach);
            ps.setString(3, matl);
            ps.setString(4, matg);
            ps.setInt(5, namxuatban);
            ps.setString(6, nhaxuatban);
            ps.setFloat(7, trigia);
            ps.setInt(8, soluongton);
            ps.setString(9, masach);
            is_updated = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (is_updated > 0) return true;
        else 
            return false;
    }
    static String delete_book="DELETE FROM SACH WHERE MaSach=?";
    static public boolean delete_book(String masach){
        int is_deleted = 0;
        try {
            ps = conn.prepareStatement(delete_book);
            ps.setString(1, masach);
            is_deleted = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (is_deleted > 0){
            return true;
        }else {
            return false;
        }
    }
    static String delete_employee="DELETE FROM TAIKHOAN WHERE TenTK = ?";
    static public boolean delete_employee(String tentk){
        int is_deleted = 0;
        try {
            ps = conn.prepareStatement(delete_employee);
            ps.setString(1, tentk);
            is_deleted = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (is_deleted > 0) return true;
        else 
            return false;
    }
    
}
