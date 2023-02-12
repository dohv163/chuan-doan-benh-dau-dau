/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pro One Laptop
 */
public class ConnectDB {
   static Connection conn=null;
	public static Connection ketNoiCoSoDuLieu() {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectUrl="jdbc:sqlserver://;databaseName=BenhDauDau";
                conn=DriverManager.getConnection(connectUrl,"sa","123!@#");
                if(conn != null) {
                        System.out.println("Kết nối thành công !");
                }else {

                        System.out.println("Kết nối thất bại !");
                }
            } catch (Exception e) {
                    e.printStackTrace();
            }
            return conn;

	}
}
