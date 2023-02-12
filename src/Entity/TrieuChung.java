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
public class TrieuChung {
    String maTrieuChung,tenTrieuChung;

    public String getMaTrieuChung() {
        return maTrieuChung;
    }

    public void setMaTrieuChung(String maTrieuChung) {
        this.maTrieuChung = maTrieuChung;
    }

    public String getTenTrieuChung() {
        return tenTrieuChung;
    }

    public void setTenTrieuChung(String tenTrieuChung) {
        this.tenTrieuChung = tenTrieuChung;
    }

    @Override
    public String toString() {
        return "TrieuChung{" + "maTrieuChung=" + maTrieuChung + ", tenTrieuChung=" + tenTrieuChung + '}';
    }
    
}
