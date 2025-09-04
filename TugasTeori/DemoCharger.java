package TugasTeori;

public class DemoCharger {
    public static void main(String[] args) { // method main
        Charger chgr = new Charger("UGreen", "Putih", "C", 25, 30); // membuat objek yang berparameter dari kelas Charger
        Charger chgr2 = new Charger("Robot", "Hitam", "C", 45, 80); // membuat objek yang berparameter dari kelas Charger

        System.out.println("Baterai saat ini: " + chgr.baterai); // menampilkan atribut baterai dari objek chgr
        System.out.println("Sedang mengisi daya...."); 
        System.out.println("Baterai sekarang: " + chgr.isiDaya()); // memanggil method isiDaya dari objek chgr

        System.out.println("Cek baterai....");
        System.out.print("Baterai sekarang: ");
        chgr.cekBaterai(); // memanggil method cekBaterai dari objek chgr

        System.out.println(); // memberi jarak

        System.out.println("Baterai saat ini: " + chgr2.baterai); // menampilkan atribut baterai dari objek chgr2
        System.out.println("Sedang mengisi daya....");
        System.out.println("Baterai sekarang: " + chgr2.isiDaya()); // memanggil method isiDaya dari objek chgr2

        System.out.println("Cek baterai....");
        System.out.print("Baterai sekarang: ");
        chgr2.cekBaterai(); // memanggil method cekBaterai dari objek chgr2
    }

}
