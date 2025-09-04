package TugasTeori;

public class Charger { // Membuat class Charger
    String merk, warna, type; // deklarasi atribut
    int daya, baterai; // deklarasi atribut

    Charger(String merk, String warna, String type, int daya, int baterai) { // constructor Charger
        this.merk = merk; // mengisi atribut merk, keyword this untuk membedakan atribut dan parameter
        this.warna = warna;
        this.type = type;
        this.daya = daya;
        this.baterai = baterai;
    }
    
    int isiDaya() { // method isiDaya untuk mengisi daya baterai
        return this.baterai += 5;
    }

    void cekBaterai() { // method cekBaterai untuk mengecek status baterai
        if (this.baterai == 100) { // kondisi jika baterai penuh
            System.out.println(this.baterai + "%" + " Baterai penuh");
        } else if (this.baterai >= 80) { // kondisi jika baterai hampir penuh
            System.out.println(this.baterai + "%" + " Baterai hampir penuh");
        } else if (this.baterai >= 30) { // kondisi jika baterai cukup
            System.out.println(this.baterai + "%" + " Baterai Cukup");
        } else { // kondisi jika baterai lemah
            System.out.println(this.baterai + "%" + " Baterai lemah");
        }
    }

}
