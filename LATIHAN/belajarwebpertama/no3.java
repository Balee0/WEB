// program untuk menginput 1 (Satu) buah bilangan integer 
// kemudian output akan memeriksa apakah bilangan yang diinputkan dapat dibagi oleh angka 4 dan 5, atau tidak bisa dibagi oleh keduanya, atau bisa dibagi oleh salah satu dari bilangan

// algoritma
public class no3 {
    public static void main(String[] args) {
        int bilangan;
        System.out.print("Masukkan bilangan: ");
        bilangan = Integer.parseInt(System.console().readLine());
        if (bilangan % 4 == 0 && bilangan % 5 == 0) {
            System.out.println("Bilangan " + bilangan + " dapat dibagi oleh 4 dan 5");
        } else if (bilangan % 4 == 0) {
            System.out.println("Bilangan " + bilangan
                    + " dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak oleh keduanya ");
        } else if (bilangan % 5 == 0) {
            System.out.println("Bilangan " + bilangan
                    + " dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak oleh keduanya ");
        } else {
            System.out.println("Bilangan " + bilangan + " tidak dapat dibagi oleh 4 dan 5");
        }
    }
}