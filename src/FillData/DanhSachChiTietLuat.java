/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FillData;

import Entity.CTLuat;
import Entity.Luat;
import GetData.ChiTietLuat;
import GetData.LayLuatDB;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DanhSachChiTietLuat {
     public static void showLuat(JTable tbl){
            ChiTietLuat listLuat= new ChiTietLuat();
            Vector<CTLuat> dsLuat=listLuat.layChiTietLuat();
            String[] columnames={"Mã Luật","Triệu chứng"};
            Object[][] data=new Object[dsLuat.size()][columnames.length];
            int i=0;
            for (CTLuat ds : dsLuat) {
                data[i][0]=ds.getMaLuat();
                data[i][1]=ds.getMaTrieuChung();
                i++;
        }
        TableModel tableModel= new DefaultTableModel(data, columnames);
        tbl.setModel(tableModel);
    }
}
