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
public class PegawaiTetap extends Employee {

    public PegawaiTetap(String a, String b, String c, String d, int e, int f) {
        super(a, b, c, d, e, f);
    }
    public void Display1(){
        System.out.println("-------------------------------------");
        System.out.println("\tSlip Gaji Anda");
        System.out.println("Nama pegawai       : "+super.getNama());
        System.out.println("Id pegawai         : "+super.getId());
        System.out.println("Gaji pokok         : Rp. "+super.getGaji());
        System.out.println("Tunjangan Kerja    : Rp. "+super.Tunjangan());
        System.out.println("Tunjangan Istri    : Rp. "+super.tunjanganIstri());
        System.out.println("Tunjangan Anak     : Rp. "+super.tunjanganAnak());
        System.out.println("Bonus              : Rp. "+super.Bonus());
        System.out.println("Total Pendapatan   : Rp. "+super.Total());
        System.out.println("-------------------------------------");
        System.out.println();
    }
    
}
