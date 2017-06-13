/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.login_controller.get_current_user_permission;
import static Controller.login_controller.get_name;
import static DAL.DataAccess.add_new_book;
import static DAL.DataAccess.delete_book;
import static DAL.DataAccess.delete_employee;
import static DAL.DataAccess.getSQLServerConnection;
import static DAL.DataAccess.get_TenTacGia;
import static DAL.DataAccess.get_TheLoai;
import static DAL.DataAccess.get_all_book;
import static DAL.DataAccess.get_all_nv;
import static DAL.DataAccess.get_book_by_masach;
import static DAL.DataAccess.get_book_by_ten_sach;
import static DAL.DataAccess.get_book_list_by_code;
import static DAL.DataAccess.get_book_list_by_name;
import static DAL.DataAccess.get_list_permission;
import static DAL.DataAccess.get_maTG;
import static DAL.DataAccess.get_maTL;
import static DAL.DataAccess.get_tentacgia_by_matg;
import static DAL.DataAccess.get_tentheloai_by_matl;
import static DAL.DataAccess.updatePassword;
import static DAL.DataAccess.update_sach;
import DAL.Nhanvien_Entity;
import DAL.Sach_Entity;
import Jframe.mainframe;
import static Jpanel.TrangChu.set_TrangChu_username;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author letra
 */
public class controller {

    mainframe mf = new mainframe();
    public static void openConnection(){
        try {
            getSQLServerConnection();
            JOptionPane.showMessageDialog(null, "Ket noi thanh cong",
                  "Title", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ket noi that bai",
                  "Title", JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public void openMainFram(){
        mf.setVisible(true);
        set_TrangChu_username();
    }
    public static ArrayList getTenTacGia(){
        return get_TenTacGia();
    }
    public static ArrayList getTheLoai(){
        return get_TheLoai();
    }
    public static String get_permission(){
        return get_current_user_permission();
    }
    public static void add_new_book_controller(String masach, String tensach, String matheloai, String matacgia, int namxuatban, String nhaxuatban, int trigia, Date ngaynhap, int soluong  ){
        add_new_book(masach, tensach, matheloai, matacgia, namxuatban, nhaxuatban, trigia, ngaynhap, soluong);
    }
    public static String get_matheloai(String tentheloai){
        return get_maTL(tentheloai);
    }
    public static String get_matacgia(String tentacgia){
        return get_maTG(tentacgia);
    }
    public static String get_tentacgia_by_matacgia(String matacgia){
        return get_tentacgia_by_matg(matacgia);
    }
    public static String get_theloai_by_matheloai(String matheloai){
        return get_tentheloai_by_matl(matheloai);
    }
    public static ArrayList<Sach_Entity> get_all_book_controller(){   
        return get_all_book();
    }
    public static ArrayList<Nhanvien_Entity> get_all_nhanvien_controller(){
        return get_all_nv();
    }
    public static void find_book_by_name(String name){
       get_book_list_by_name(name);
    }
    public static void find_book_by_code(String code){
        get_book_list_by_code(code);
    }
    public static ArrayList<Sach_Entity> find_book_by_ms(String masach){
        return get_book_by_masach(masach);
    }
    public static ArrayList<Sach_Entity> find_book_by_ts(String tensach){
        return get_book_by_ten_sach(tensach);
    }
    public static void changPassword(String matkhau, String matkhaumoi){
            String tentk = get_name();
            if (updatePassword(tentk,matkhau,matkhaumoi)==true){
                JOptionPane.showMessageDialog(null, "Thay đổi mật khẩu thành công",
                  "Title", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Thay đổi mật khẩu thất bại",
                  "Title", JOptionPane.WARNING_MESSAGE);
            }
   }
   public static boolean update_sach_controller(String masach, String tensach, String matl, String matg, int namxuatban, String nhaxuatban, float trigia, int soluongton){
       boolean is_updated =  update_sach(masach, tensach, matl, matg, namxuatban, nhaxuatban, trigia, soluongton);
       if (is_updated == true){
           JOptionPane.showMessageDialog(null, "Lưu thành công",
                  "Title", JOptionPane.WARNING_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "lưu that bai",
                  "Title", JOptionPane.WARNING_MESSAGE);
       }
       return is_updated;
   }
   public static void delete_book_controller(String masach){
         if (delete_book(masach)== true){
             JOptionPane.showMessageDialog(null, "Xóa thành công",
                  "Title", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại",
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
   }
   public static void delete_employee_controller(String tentk){
       if (delete_employee(tentk) == true){
           JOptionPane.showMessageDialog(null, "Xóa thành công",
                  "Title", JOptionPane.WARNING_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "Xóa thất bại",
                  "Title", JOptionPane.WARNING_MESSAGE);
       }
   }
   public static ArrayList get_permission_list(){
       return get_list_permission();
   }
}
