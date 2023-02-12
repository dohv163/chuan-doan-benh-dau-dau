/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import Entity.BenhNhan;
import static GetData.ConnectDB.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Pro One Laptop
 */
public class DataBenhNhan {
    public Vector<BenhNhan> dataBenhNhan(){
        Vector<BenhNhan> vecBenhNhan=new Vector<BenhNhan>();
        try {
            String sql="select * from BenhNhan";
            Statement statment=conn.createStatement();
            ResultSet result=statment.executeQuery(sql);
            while(result.next()){
                BenhNhan bn= new BenhNhan();
                bn.setMaBenhNhan(result.getString(1));
                bn.setHoTen(result.getString(2));
                bn.setNgaySinh(result.getString(3));
                bn.setDiaChi(result.getString(4));
                bn.setNgayKham(result.getString(5));
                bn.setTieuSuGD(result.getString(6));
                vecBenhNhan.add(bn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vecBenhNhan;
    }
    public int xuLyThemBenhNhan(BenhNhan bn){
        try {
            String sql="insert into BenhNhan values(?,?,?,?,?)";
            PreparedStatement preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, bn.getHoTen());
            preStatement.setString(2, bn.getNgaySinh());
            preStatement.setString(3, bn.getDiaChi());
            preStatement.setString(4, bn.getNgayKham());
            preStatement.setString(5, bn.getTieuSuGD());
            return preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public boolean kiemTraTonTai(String ma){
        try {
            String sql="select * from BenhNhan where MaBenhNhan=?";
            PreparedStatement prepareState=conn.prepareStatement(sql);
            prepareState.setString(1, ma);
            ResultSet rs=prepareState.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    
    }
    public void xoaBenhNhan(String ma){
        try {
            String sql="delete from BenhNhan where MaBenhNhan=?";
            PreparedStatement prepareStatement=conn.prepareStatement(sql);
            prepareStatement.setString(1, ma);
            prepareStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
