// program untuk menghitung pajak perseorangan berdasarkan kategori perkawinan
// dimana input status kategori perkawinan (kawin, tidak kawin)
// output yang akan menampilkan pajak yang harus di bayarkan
// Besaran pajak yang dibayar bervariasi berdasarkan jumlah pendapatan pertahun.
/*  pajak 5% untuk tidak kawin 0 > 70.000.000, kawin 0 > 50.000.000
    pajak 15% untuk tidak kawin 70.000.000 > 270.000.000, kawin 50.000.000 > 250.000.000
    pajak 25% untuk tidak kawin  >270.000.000, kawin >250.000.000
*/

// algoritma
public class no4 {
    public static void main(String[] args) {
        int pendapatan;
        int pajak;
        String status;
        System.out.print("Masukkan status perkawinan (kawin/tidak kawin): ");
        status = System.console().readLine();
        System.out.print("Masukkan pendapatan: ");
        pendapatan = Integer.parseInt(System.console().readLine());
        if (status.equals("kawin")) {
            if (pendapatan > 250000000) {
                pajak = (int) (0.25 * pendapatan);
            } else if (pendapatan > 50000000) {
                pajak = (int) (0.15 * pendapatan);
            } else if (pendapatan > 0) {
                pajak = (int) (0.05 * pendapatan);
            } else {
                pajak = 0;
            }
        } else {
            if (pendapatan > 270000000) {
                pajak = (int) (0.25 * pendapatan);
            } else if (pendapatan > 70000000) {
                pajak = (int) (0.15 * pendapatan);
            } else if (pendapatan > 0) {
                pajak = (int) (0.05 * pendapatan);
            } else {
                pajak = 0;
            }
        }
        System.out.println("Pajak yang harus dibayarkan: " + pajak);
    }
}
