/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuandoanbenhdanhdau;

import ChuanDoanBenhUI.ChuanDoanBenh;
import GetData.ConnectDB;
import GetData.LayLuatDB;

/**
 *
 * @author Pro One Laptop
 */
public class ChuanDoanBenhDanhDau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ConnectDB cn= new ConnectDB();
      cn.ketNoiCoSoDuLieu();
      new ChuanDoanBenh().setVisible(true);
      new ChuanDoanBenh().setLocationRelativeTo(null);
    }
    
}
