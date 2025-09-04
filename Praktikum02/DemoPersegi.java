public class DemoPersegi {
    public static void main(String[] args) { // method main
        PersegiPanjang ppj1 = new PersegiPanjang(); // membuat objek dari kelas PersegiPanjang
        ppj1.panjang = 4; // mengisi atribut panjang
        ppj1.lebar = 13; // mengisi atribut lebar

        System.out.println("Persegi Panjang ke-1:");
        ppj1.displayInfo(); // memanggil method displayInfo untuk menampilkan info persegi panjang
        System.out.println("Luas Persegi Panjang ke-1 adalah: " + ppj1.getLuas()); // memanggil method getLuas untuk menghitung luas persegi panjang
        System.out.println("Keliling Persegi Panjang ke-1 adalah: " + ppj1.getKeliling()); // memanggil method getKeliling untuk menghitung keliling persegi panjang
        System.out.println();

        PersegiPanjang ppj2 = new PersegiPanjang(); // membuat objek dari kelas PersegiPanjang
        ppj2.panjang = 3; // mengisi atribut panjang
        ppj2.lebar = 13; // mengisi atribut lebar

        System.out.println("Persegi Panjang ke-2:");
        ppj2.displayInfo(); // memanggil method displayInfo untuk menampilkan info persegi panjang
        System.out.println("Luas Persegi Panjang ke-2 adalah: " + ppj2.getLuas()); // memanggil method getLuas untuk menghitung luas persegi panjang
        System.out.println("Keliling Persegi Panjang ke-1 adalah: " + ppj2.getKeliling()); // memanggil method getKeliling untuk menghitung keliling persegi panjang
    }
}
