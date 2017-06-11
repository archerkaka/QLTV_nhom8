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
public class Sach_Entity {
    private String masach;
    private String tensach;
    private String matl;
    private String matg;
    private int namxuatban  ;
    private String nhaxuatban;
    private int trigia;
    private Date ngaynhap;
    private int soluongton;
    
    public String get_masach(){
        return masach;
    }
    public String get_tensach(){
        return tensach;
    }
    public String get_matl(){
        return matl;
    }
    public String get_nhaxuatban(){
        return nhaxuatban;
    }
    public int get_namexuatban(){
        return namxuatban;
    }
    public int get_trigia(){
        return trigia;
    }
    public int get_soluongton(){
        return soluongton;
    }
    public String get_matg(){
        return matg;
    }
    public Date get_ngaynhap(){
        return ngaynhap;
    }
    
    public void set_ngaynhap(Date ngay_nhap){
        this.ngaynhap = ngay_nhap;
    }
    public void set_masach(String ma_sach){
        this.masach = ma_sach;
    }
    public void set_tensach(String ten_sach){
        this.tensach = ten_sach;
    }
    public void set_matl(String matheloai){
        this.matl = matheloai;
    }
    public void set_matg(String matacgia){
        this.matg = matacgia;
    }
    public void set_namxuatban(int nxb){
        this.namxuatban = nxb;
    }
    public void set_nhaxuatban(String nha_xuatban){
        this.nhaxuatban = nha_xuatban;
    }
    public void set_trigia(int tri_gia){
        this.trigia = tri_gia;
    }
    public void set_soluongton(int soluong){
            this.soluongton = soluong;
    }
    
}
