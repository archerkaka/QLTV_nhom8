/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Date;

/**
 *
 * @author letra
 */
public class Nhanvien_Entity {
    private String manhanvien;
    private String tennhanvien;
    private String gioitinh;
    private String cmnd;
    private Date ngaysinh;
    private String taikhoan;
    private String matkhau;
    private String maquyen;
    
    public String get_manhanvien(){
        return manhanvien;
    }
    public String get_tennhanvien(){
        return tennhanvien;
    }
    public String get_gioitinh(){
        return gioitinh;
    }
    public String get_cmnd(){
        return cmnd;
    }
    public Date get_ngaysinh(){
        return ngaysinh;
    }
    public String get_taikhoan(){
        return taikhoan;
    }
    public String get_matkhau(){
        return matkhau;
    }
    public String get_maquyen(){
        return maquyen;
    }
    
    public void set_manhanvien(String manv){
        this.manhanvien = manv;
    }
    public void set_tennhanvien(String tennv){
        this.tennhanvien = tennv;
    }
    public void set_gioitinh(String sex){
        this.gioitinh = sex;
    }
    public void set_cmnd(String socmnd){
        this.cmnd = socmnd;
    }
    public void set_ngaysinh(Date ns){
        this.ngaysinh = ns;
    }
    public void set_taikhoan(String tk){
        this.taikhoan = tk;
    }
    public void set_matkhau(String mk){
        this.matkhau = mk;
    }
    public void set_maquyen(String mq){
        this.maquyen = mq;
    }
}
