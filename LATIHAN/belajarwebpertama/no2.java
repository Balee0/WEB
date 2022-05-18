// program untuk menginput jumlah menit
// output yang akan menampilkan jumlah tahun dan jumlah hari

public class no2 {
    public static void main(String[] args) {
        int menit;
        int tahun;
        int hari;
        int sisa;
        System.out.print("Masukkan jumlah menit: ");
        menit = Integer.parseInt(System.console().readLine());
        tahun = menit / (365 * 24 * 60);
        sisa = menit % (365 * 24 * 60);
        hari = sisa / (24 * 60);
        System.out.println("Jumlah tahun: " + tahun);
        System.out.println("Jumlah hari: " + hari);
    }
}
