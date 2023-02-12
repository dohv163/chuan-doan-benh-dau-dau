/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Pro One Laptop
 */
public class CTLuat {
    String maLuat,maTrieuChung;

    public String getMaLuat() {
        return maLuat;
    }

    public void setMaLuat(String maLuat) {
        this.maLuat = maLuat;
    }

    public String getMaTrieuChung() {
        return maTrieuChung;
    }

    public void setMaTrieuChung(String maTrieuChung) {
        this.maTrieuChung = maTrieuChung;
    }

    @Override
    public String toString() {
        return "CTLuat{" + "maLuat=" + maLuat + ", maTrieuChung=" + maTrieuChung + '}';
    }
    
}
