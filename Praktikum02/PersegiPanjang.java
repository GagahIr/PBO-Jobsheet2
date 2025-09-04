public class PersegiPanjang {
    int panjang, lebar; // deklarasi atribut

    int getKeliling() { // membuat method getKeliling untuk menghitung keliling
        return 2 * (panjang + lebar); // menghitung keliling persegi panjang
    }

    int getLuas() { // membuat method getLuas untuk menghitung luas
        return panjang * lebar; // menghitung luas  persegi panjang
    }

    void displayInfo() { // method untuk menampilkan info persegi panjang
        System.out.println("Panjang     : " + panjang);
        System.out.println("Lebar       : " + lebar);
    }
}
