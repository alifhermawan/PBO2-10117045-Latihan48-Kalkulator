package pbo2.pkg10117045.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untukmenghitung operasi
 * penjumlahan, pengurangan, perkalian dan pemnagian sesuai nilai yang telah
 * ditentukan
 */

public class Utama {
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);

        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+kal.add(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Minus is = "+kal.minus(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Multiplication is = "+kal.multiplication(kal.getValue1(),kal.getValue2()));
        System.out.println("Result Division is = "+kal.division(kal.getValue1(),kal.getValue2()));

    }
}