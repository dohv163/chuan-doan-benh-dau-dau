/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FillData;

import Entity.BenhNhan;
import GetData.DataBenhNhan;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DanhSachBenhNhan {
    public void showBenhNhan(JTable tbl){
        DataBenhNhan dtBenh=new DataBenhNhan();
        Vector<BenhNhan> vecBn=dtBenh.dataBenhNhan();
        String[] columnames={"Mã bệnh nhân","Họ Tên","Ngày Sinh","Địa chỉ","Ngày khám","Tiểu sử bệnh lý"};
        Object[][] data= new Object[vecBn.size()][columnames.length];
        int i=0;
        for (BenhNhan dsBn : vecBn) {
            data[i][0]=dsBn.getMaBenhNhan();
            data[i][1]=dsBn.getHoTen();
            data[i][2]=dsBn.getNgaySinh();
            data[i][3]=dsBn.getDiaChi();
            data[i][4]=dsBn.getNgayKham();
            data[i][5]=dsBn.getTieuSuGD();
            i++;
        }
        TableModel tableModel= new DefaultTableModel(data, columnames);
        tbl.setModel(tableModel);
    }
   
}
