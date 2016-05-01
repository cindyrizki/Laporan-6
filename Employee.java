/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private String nama, id, jabatan, istri;
    private int tahun, anak;
    private final int acuan = 2016;
    public double bonus, tunjangan;
    private int gaji = 3000000;
    public Employee(String a, String b, String c, String d, int e, int f){
        nama = a;
        id = b;
        jabatan = c;
        istri = d;
        anak = e;
        tahun = f;
    }
    public String getNama(){
        return nama;
    }
    public String getId(){
        return id;
    }
    public String getJabatan(){
        return jabatan;
    }
    public String getIstri(){
        return istri;
    }
    public int getAnak(){
        return anak;
    }
    public int getTahun(){
        return tahun;
    }
    public int getGaji(){
        return gaji;
    }
    public double Bonus(){
        if ((acuan-getTahun())<=5){
            bonus = 0;
        }else if((acuan-getTahun())>=6 && (acuan-getTahun())<=10){
            bonus = 0.05*getGaji();
        }else if((acuan-getTahun())>10){
            bonus = 0.1 * getGaji();
        }
        return bonus;
    }
    public double Tunjangan(){
        if ((acuan-getTahun())<=10){
            tunjangan = 0;
        }else{
            tunjangan = 0.1 * getGaji();
        }
        return tunjangan;
    }
    public double Sementara(){
        return Tunjangan()+ getGaji() + Bonus();
    }
    public double tunjanganIstri(){
        if(getIstri().equalsIgnoreCase("Menikah")){
            tunjangan = 0.1 * Sementara();
        }else{
            tunjangan = 0;
        }
        return tunjangan;
    }
    public double tunjanganAnak(){
        if (getAnak()<=3){
            tunjangan = getAnak() * 0.15 * (Sementara() + tunjanganIstri());
        }else{
            tunjangan = 3 * 0.15 * (Sementara() + tunjanganIstri());
        }
        return tunjangan;
    }
    public double Total(){
        return Sementara() + tunjanganIstri() + tunjanganAnak();
    }
}
