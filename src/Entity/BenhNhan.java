/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Pro One Laptop
 */
public class BenhNhan {
    String maBenhNhan;
    String ngaySinh;
    String diaChi;
    String ngayKham;
    String tieuSuGD;
    String hoTen;

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
    
    
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
   
    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(String ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getTieuSuGD() {
        return tieuSuGD;
    }

    public void setTieuSuGD(String tieuSuGD) {
        this.tieuSuGD = tieuSuGD;
    }

    @Override
    public String toString() {
        return "BenhNhan{"+" ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", ngayKham=" + ngayKham + ", tieuSuGD=" + tieuSuGD + '}';
    }

 
    
}
