/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FillData;

import Entity.Benh;
import GetData.DataBenh;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DanhSachBenh {
    public void danhSachBenh(JTable tbl){
        DataBenh dsBenh= new DataBenh();
        Vector<Benh> vecBenh=dsBenh.layDanhSachBenh();
        String[] columnames={"Mã Bệnh","Tên Bệnh"};
        Object[][] data=new Object[vecBenh.size()][columnames.length];
        int i=0;
        for (Benh ds: vecBenh) {
            data[i][0]=ds.getMaBenh();
            data[i][1]=ds.getTenBenh();
            i++;
        }
        TableModel tableModel= new DefaultTableModel(data, columnames);
        tbl.setModel(tableModel);
    }
}
