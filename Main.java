import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) {
        Mahasiswa dataMahasiswa = new Mahasiswa();
        Scanner userInput = new Scanner(System.in);

        while (true) {
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.println("3. Simpan Nilai Mahasiswa");
        System.out.println("4. Tampilkan Nilai Mahasiswa");
        System.out.println("5. Keluar");
        int pilihan = userInput.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = userInput.next();
                    System.out.print("Masukkan kelas: ");
                    String kelas = userInput.next();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = userInput.next();
                    dataMahasiswa.tambahMhs(nim, kelas, nama);
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    nim = userInput.next();
                    System.out.print("Masukkan kelas mahasiswa yang akan dihapus: ");
                    kelas = userInput.next();
                    System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                    nama = userInput.next();
                    dataMahasiswa.hapusMhs(nim, kelas, nama);
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = userInput.next();
                    System.out.print("Masukkan kelas mahasiswa: ");
                    kelas = userInput.next();
                    System.out.print("Masukkan nama mahasiswa: ");
                    nama = userInput.next();
                    System.out.print("Masukkan nilai mahasiswa: ");
                    double nilai = userInput.nextDouble();
                    dataMahasiswa.simpanNilaiMhs(nim, kelas, nama, nilai);
                    break;
                case 4:
                    dataMahasiswa.tampilkanNilaiMhs();
                    break;
                case 5:
                    break;
            }   
        }  
    }
}