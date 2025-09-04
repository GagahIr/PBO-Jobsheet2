public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023423";
        m1.nama = "Yansy Ayuningtiyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m1.displayBiodata();

        System.out.println();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023424";
        m2.nama = "Gagah Irlangsa";
        m2.alamat = "Madiun, Jawa Timur";
        m2.kelas = "2B";

        m2.displayBiodata();
    }
}
