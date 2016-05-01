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
public class PegawaiTidakTetap extends Employee {
    private int jamLembur;
    private double pendapatan;
    public PegawaiTidakTetap(String a, String b, String c, String d, int e, int f, int g) {
        super(a, b, c, d, e, f);
        jamLembur = g;
    }
    public int getJam(){
        return jamLembur;
    }
    public double pendapatan(){
        if (getJam()>=10){
            pendapatan = getJam() * 10000;
        }else{
            pendapatan = 0;
        }
        return pendapatan;
    }
    public double Total2(){
        return super.Total() + pendapatan();
    }
    public void Display2(){
        System.out.println("-------------------------------------");
        System.out.println("\tSlip Gaji Anda");
        System.out.println("Nama pegawai       : "+super.getNama());
        System.out.println("Id pegawai         : "+super.getId());
        System.out.println("Gaji pokok         : Rp. "+super.getGaji());
        System.out.println("Tunjangan Kerja    : Rp. "+super.Tunjangan());
        System.out.println("Tunjangan Istri    : Rp. "+super.tunjanganIstri());
        System.out.println("Tunjangan Anak     : Rp. "+super.tunjanganAnak());
        System.out.println("Bonus              : Rp. "+super.Bonus());
        System.out.println("Pendapatan Lembur  : Rp. "+pendapatan());
        System.out.println("Total Pendapatan   : Rp. "+Total2());
        System.out.println("-------------------------------------");
        System.out.println();
    }
    
}
