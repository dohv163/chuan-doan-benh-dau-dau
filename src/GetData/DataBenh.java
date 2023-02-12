/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import Entity.Benh;
import static GetData.ConnectDB.conn;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Pro One Laptop
 */
public class DataBenh {
    public Vector<Benh> layDanhSachBenh(){
        Vector<Benh> vecDanhSachBenh= new Vector<>();
        try {
            String sql="select * from Benh";
            Statement statement=conn.createStatement(); 
            ResultSet result=statement.executeQuery(sql);
            while(result.next()){
                Benh benh=new Benh();
                benh.setMaBenh(result.getString(1));
                benh.setTenBenh(result.getString(2));
                vecDanhSachBenh.add(benh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vecDanhSachBenh;
        
    }
}
