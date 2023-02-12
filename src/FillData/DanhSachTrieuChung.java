/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FillData;

import Entity.TrieuChung;
import GetData.DataTrieuChung;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pro One Laptop
 */
public class DanhSachTrieuChung {
    public void showTrieuChung(JTable tbl){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung();
        String[] columnames={"Mã triệu chứng","Tên triệu chứng"};
        Object[][] data=new Object[vecTrieuChung.size()][columnames.length];
            int i=0;
            for (TrieuChung ds : vecTrieuChung) {
                data[i][0]=ds.getMaTrieuChung();
                data[i][1]=ds.getTenTrieuChung();
                i++;
        }  
        TableModel tableModel= new DefaultTableModel(data, columnames);
        tbl.setModel(tableModel);
    }
    public static ComboBoxModel cbbTrieuChung1(){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung();
        StringBuilder items= new StringBuilder();
        for (TrieuChung tenTrieuChung : vecTrieuChung) {
            items.append(tenTrieuChung.getTenTrieuChung());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
    public static ComboBoxModel cbbTrieuChung2(){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung2(2);
        StringBuilder items= new StringBuilder();
        for (TrieuChung tenTrieuChung : vecTrieuChung) {
            items.append(tenTrieuChung.getTenTrieuChung());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
    public static ComboBoxModel cbbTrieuChung3(){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung3(3);
        StringBuilder items= new StringBuilder();
        for (TrieuChung tenTrieuChung : vecTrieuChung) {
            items.append(tenTrieuChung.getTenTrieuChung());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
    public static ComboBoxModel cbbTrieuChung4(){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung4(4);
        StringBuilder items= new StringBuilder();
        for (TrieuChung tenTrieuChung : vecTrieuChung) {
            items.append(tenTrieuChung.getTenTrieuChung());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
    public static ComboBoxModel cbbTrieuChung5(){
        DataTrieuChung dtTC=new DataTrieuChung();
        Vector<TrieuChung> vecTrieuChung=dtTC.dataTrieuChung5(5);
        StringBuilder items= new StringBuilder();
        for (TrieuChung tenTrieuChung : vecTrieuChung) {
            items.append(tenTrieuChung.getTenTrieuChung());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
}
