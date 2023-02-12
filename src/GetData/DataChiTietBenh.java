/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import static GetData.ConnectDB.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DataChiTietBenh {
    public void chiTietBenh(JTable tbl){ 
        DefaultTableModel dtmCtBenh= new DefaultTableModel();
        dtmCtBenh.addColumn("Mã Bệnh Nhân");
        dtmCtBenh.addColumn("Họ tên");
        dtmCtBenh.addColumn("Ngày Sinh");
        dtmCtBenh.addColumn("Địa chỉ");
        dtmCtBenh.addColumn("Ngày khám");
        dtmCtBenh.addColumn("Tiểu sử bệnh lý");
        dtmCtBenh.addColumn("Mức độ");
        dtmCtBenh.addColumn("Triệu chứng");
        dtmCtBenh.addColumn("Tên bệnh");
        try {
           String sql="select distinct BenhNhan.MaBenhNhan,HoTen,NgaySinh,NgayKham,DiaChi,TSGD,MucDo,TenTC from BenhNhan inner join CTBenh on BenhNhan.MaBenhNhan=CTBenh.MaBenhNhan inner join TrieuChung on TrieuChung.MaTC=CTBenh.MaTC";
            PreparedStatement prepareStatement=conn.prepareStatement(sql);
            ResultSet result=prepareStatement.executeQuery();
            dtmCtBenh.setRowCount(0);
            while(result.next()){
                Vector<Object> ds=new Vector<>();
                ds.add(result.getString("MaBenhNhan"));
                ds.add(result.getString("HoTen"));
                ds.add(result.getString("NgaySinh"));
                ds.add(result.getString("NgayKham"));
                ds.add(result.getString("DiaChi"));
                ds.add(result.getString("TSGD"));             

                if(Float.parseFloat(result.getString("MucDo"))==1.0){
                    ds.add("Luôn Luôn Đau");
                } else if(Float.parseFloat(result.getString("MucDo"))==0.75){
                    ds.add("Khá Nhiều"); 
                }  else if(Float.parseFloat(result.getString("MucDo"))==0.5){
                    ds.add("Có Đau");
                } else if(Float.parseFloat(result.getString("MucDo"))==0.25){
                    ds.add("Rất Ít");
                }else{
                    ds.add("Không");
                }
                ds.add(result.getString("TenTC"));
                dtmCtBenh.addRow(ds);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       tbl.setModel(dtmCtBenh);
       
    }
}
