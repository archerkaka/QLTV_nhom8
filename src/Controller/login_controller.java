/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAL.DataAccess;
import static DAL.DataAccess.get_isSaved;
import static DAL.DataAccess.get_username_DA;
import static DAL.DataAccess.set_isSaved;
import Jframe.login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author letra
 */
public class login_controller {
    DataAccess DA = new DataAccess();
    controller ctler = new controller();
    static String permission = null;
    static String name;
    public boolean loginValidate(String username, String password){
        try {
             permission = DA.login(username, password);
        } catch (SQLException ex) {
            Logger.getLogger(login_controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (permission != null){
            name = username;
            gotoMainFrame(permission); 
            return true;
        }
        return false;
    }
    public static void logout(){
        login login_form = new login();
        login_form.show_login();
    }
    public void gotoMainFrame(String permission){
        
        if (permission.equals("admin") || permission.equals("user")){
            JOptionPane.showMessageDialog(null, "Dang nhap quyen "+ permission ,
                  "Title", JOptionPane.WARNING_MESSAGE);
            ctler.openMainFram();
        }else{
            JOptionPane.showMessageDialog(null, "Dang nhap quyen "+ permission ,
                  "Title", JOptionPane.WARNING_MESSAGE);
        }
    }
    static public String get_current_user_permission(){
        return permission;
    }
    static public String[] get_saved_account(){
        return get_isSaved();
    }
    static public void save_username_and_password(String username){
        set_isSaved(username);
    }
    static public String get_username(){
        return get_username_DA(name);
    }
    static public String get_name(){
        return name;
    }
}
