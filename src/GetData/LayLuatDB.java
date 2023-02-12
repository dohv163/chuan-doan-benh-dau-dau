/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import static GetData.ConnectDB.conn;
import Entity.Luat;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;


/**
 *
 * @author Pro One Laptop
 */
public class LayLuatDB {

    public Vector<Luat> layLuat(){
        Vector<Luat> vecLuat=new Vector<>();
        try {
            String sql="select * from luat";
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery(sql);
            while(result.next()){
                Luat luat=new Luat();
                luat.setMaLuat(result.getString(1));
                luat.setMaBenh(result.getString(2));
                luat.setDoTinCay(result.getString(3));
                vecLuat.add(luat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vecLuat;
        }
}
