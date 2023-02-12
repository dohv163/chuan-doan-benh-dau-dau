/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import Entity.CTLuat;
import static GetData.ConnectDB.conn;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Pro One Laptop
 */
public class ChiTietLuat {
    public Vector<CTLuat> layChiTietLuat(){
        Vector<CTLuat> vecChiTietLuat=new Vector<>();
        try {
            String sql="select * from CTLuat";
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next()){
                CTLuat luat=new CTLuat();
                luat.setMaLuat(result.getString(1));
                luat.setMaTrieuChung(result.getString(2));
                vecChiTietLuat.add(luat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vecChiTietLuat;
        }
}
