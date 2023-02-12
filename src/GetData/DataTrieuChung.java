/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetData;

import Entity.TrieuChung;
import static GetData.ConnectDB.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Pro One Laptop
 */
public class DataTrieuChung {
       public Vector<TrieuChung> dataTrieuChung(){
           Vector<TrieuChung> vecTrieuChung= new Vector<>();
           try {
               String sql="select * from TrieuChung";
               Statement statement=conn.createStatement();
               ResultSet result= statement.executeQuery(sql);
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung;
       
       }
    public Vector<TrieuChung> dataTrieuChung1(int trieuChung){
           Vector<TrieuChung> vecTrieuChung1= new Vector<>();
           try {
               String sql="select * from TrieuChung where NhomTrieuChung=?";
               PreparedStatement prepareStatement=conn.prepareStatement(sql);
               prepareStatement.setInt(1,1);
               ResultSet result=prepareStatement.executeQuery();
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung1.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung1;
       
       }
    public Vector<TrieuChung> dataTrieuChung2(int trieuChung){
           Vector<TrieuChung> vecTrieuChung1= new Vector<>();
           try {
               String sql="select * from TrieuChung where NhomTrieuChung=?";
               PreparedStatement prepareStatement=conn.prepareStatement(sql);
               prepareStatement.setInt(1,2);
               ResultSet result=prepareStatement.executeQuery();
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung1.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung1;
       
       }
    public Vector<TrieuChung> dataTrieuChung3(int trieuChung){
           Vector<TrieuChung> vecTrieuChung1= new Vector<>();
           try {
               String sql="select * from TrieuChung where NhomTrieuChung=?";
               PreparedStatement prepareStatement=conn.prepareStatement(sql);
               prepareStatement.setInt(1,3);
               ResultSet result=prepareStatement.executeQuery();
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung1.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung1;
       
       }
    public Vector<TrieuChung> dataTrieuChung4(int trieuChung){
           Vector<TrieuChung> vecTrieuChung1= new Vector<>();
           try {
               String sql="select * from TrieuChung where NhomTrieuChung=?";
               PreparedStatement prepareStatement=conn.prepareStatement(sql);
               prepareStatement.setInt(1,4);
               ResultSet result=prepareStatement.executeQuery();
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung1.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung1;
       
       }
    public Vector<TrieuChung> dataTrieuChung5(int trieuChung){
           Vector<TrieuChung> vecTrieuChung1= new Vector<>();
           try {
               String sql="select * from TrieuChung where NhomTrieuChung=?";
               PreparedStatement prepareStatement=conn.prepareStatement(sql);
               prepareStatement.setInt(1,5);
               ResultSet result=prepareStatement.executeQuery();
               while(result.next()){
                   TrieuChung tc= new TrieuChung();
                   tc.setMaTrieuChung(result.getString(1));
                   tc.setTenTrieuChung(result.getString(2));
                   vecTrieuChung1.add(tc);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return vecTrieuChung1;
       
       }
}
