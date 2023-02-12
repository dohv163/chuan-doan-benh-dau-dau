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
public class Luat {
    String maLuat,maBenh,doTinCay;

    public String getMaLuat() {
        return maLuat;
    }

    public void setMaLuat(String maLuat) {
        this.maLuat = maLuat;
    }

    public String getMaBenh() {
        return maBenh;
    }

    public void setMaBenh(String maBenh) {
        this.maBenh = maBenh;
    }

    public String getDoTinCay() {
        return doTinCay;
    }

    public void setDoTinCay(String doTinCay) {
        this.doTinCay = doTinCay;
    }

    @Override
    public String toString() {
        return "Luat{" + "maLuat=" + maLuat + ", maBenh=" + maBenh + ", doTinCay=" + doTinCay + '}';
    }
    
}
