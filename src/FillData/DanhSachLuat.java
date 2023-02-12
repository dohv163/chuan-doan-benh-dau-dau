/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FillData;

import Entity.Luat;
import GetData.LayLuatDB;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DanhSachLuat {
    public static void showLuat(JTable tbl){
        LayLuatDB listLuat= new LayLuatDB();
        Vector<Luat> dsLuat=listLuat.layLuat();
            String[] columnames={"Mã Luật","Mã Bệnh","Độ tin cậy"};
            Object[][] data=new Object[dsLuat.size()][columnames.length];
            int i=0;
            for (Entity.Luat ds : dsLuat) {
                data[i][0]=ds.getMaLuat();
                data[i][1]=ds.getMaBenh();
                data[i][2]=ds.getDoTinCay();
                i++;
        }
        TableModel tableModel= new DefaultTableModel(data, columnames);
        tbl.setModel(tableModel);
    }
}
