import java.util.HashMap;
import java.util.Map;

public class Mahasiswa {
    private static final double Mhs = 0;
    private Map<String, Double> nilaiMhs;{
        nilaiMhs = new HashMap<>();
    }

    public void tambahMhs(String nim, String kelas, String nama) {
        String key = nim + "-" + kelas + "-" + nama;
        nilaiMhs.put(key, 0.0);
        System.out.println();
        
    }
    public void hapusMhs(String nim, String kelas, String nama) {
        String key = nim + "-" + kelas + "-" + nama;
        if (nilaiMhs.containsKey(key)) {
            nilaiMhs.remove(key);
            System.out.println("Data mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Data mahasiswa tidak ditemukan.");
        }
    }

    public void simpanNilaiMhs(String nim, String kelas, String nama, double nilai) {
        String key = nim + "-" + kelas + "-" + nama;
        if (nilaiMhs.containsKey(key)) {
            nilaiMhs.put(key, nilai);
            System.out.println();
        } else {
            System.out.println("Data mahasiswa tidak ditemukan.");
        }
    }

    public void tampilkanNilaiMhs() {
        System.out.println();
        if (nilaiMhs.isEmpty()) {
            System.out.println("Belum ada data mahasiswa yang disimpan.");
        } else {
            double totalNilai = 0.0;
            int jumlahMhs = 0;
            for (Map.Entry<String, Double> entry : nilaiMhs.entrySet()) {
                String[] dataMhs = entry.getKey().split("-");
                String nim = dataMhs[0];
                String kelas = dataMhs[1];
                String nama = dataMhs[2];
                double nilai = entry.getValue();
                
                System.out.println("NIM   : " + nim);
                System.out.println("Kelas : " + kelas);
                System.out.println("Nama  : " + nama);
                System.out.println("Nilai : " + nilai);

                nilai = totalNilai;
                totalNilai += Mhs;
                jumlahMhs++;
            }

            double rata2 = totalNilai / jumlahMhs;
            System.out.println("Rata-rata nilai mahasiswa: " + rata2);
        }
    }
}