/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainEmployee {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("\tCV. Lestari");
        System.out.println("-------------------------");
        for (int jab = 1; jab <=16; jab++){
            System.out.println("KODE PEGAWAI");
            System.out.println("01. Manager");
            System.out.println("02. Pegawai Tetap");
            System.out.println("03. Pegawai Non Tetap");
            System.out.print("Masukan Kode Anda : ");
            int pil = x.nextInt();
            switch(pil){
                case 01 : System.out.print("Nama              : ");
                          String a = x.next();
                          System.out.print("Id pegawai        : ");
                          String b = x.next();
                          System.out.print("Status pernikahan : ");
                          String c = x.next();
                          System.out.print("Jumlah Anak       : ");
                          int d = x.nextInt();
                          System.out.print("Tahun Masuk       : ");
                          int e = x.nextInt();
                          System.out.println();
                          Manager m2 = new Manager(a,b,"Manager",c,d,e);
                          m2.Total();
                          m2.Display();break;
                case 02 : System.out.println("Nama              : ");
                          String a1 = x.nextLine();
                          System.out.println("Id pegawai        : ");
                          String b1 = x.nextLine();
                          System.out.println("Status pernikahan : ");
                          String c1 = x.nextLine();
                          System.out.println("Jumlah Anak       : ");
                          int d1 = x.nextInt();
                          System.out.println("Tahun Masuk       : ");
                          int e1 = x.nextInt();
                          System.out.println();
                          PegawaiTetap pt2 = new PegawaiTetap(a1,b1,"Pegawai Tetap",c1,d1,e1);
                          pt2.Total();
                          pt2.Display1();break;
                case 03 : System.out.println("Nama              : ");
                          String a2 = x.nextLine();
                          System.out.println("Id pegawai        : ");
                          String b2 = x.nextLine();
                          System.out.println("Status pernikahan : ");
                          String c2 = x.nextLine();
                          System.out.println("Jumlah Anak       : ");
                          int d2 = x.nextInt();
                          System.out.println("Tahun Masuk       : ");
                          int e2 = x.nextInt();
                          System.out.println("Jam Lembur        : ");
                          int f2 = x.nextInt();
                          System.out.println();
                          PegawaiTidakTetap ptt2 = new PegawaiTidakTetap(a2,b2,"Pegawai Tidak Tetap",c2,d2,e2,f2);
                          ptt2.Total();
                          ptt2.Display2();break;
            }
        }
    }

}
