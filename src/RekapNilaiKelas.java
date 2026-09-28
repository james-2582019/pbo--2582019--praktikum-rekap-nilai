import java.util.Scanner;

public class RekapNilaiKelas {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int jumlahNilai = 0;
        int nomor = 1;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        do {
            System.out.print("Nilai ke-" + nomor + " : ");
            int nilai = scanner.nextInt();

            // Jika input -1, berhenti
            if (nilai == SELESAI) {
                break;
            }

            // Cek nilai harus 0 sampai 100
            if (nilai < 0 || nilai > 100) {
                System.out.println("  Ditolak - nilai harus 0..100");
                continue;
            }

            // Menentukan grade
            char grade;

            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            // Menentukan keterangan berdasarkan grade
            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println("  Grade       : " + grade);
            System.out.println("  Keterangan  : " + keterangan);

            // Menambahkan nilai ke total
            total += nilai;

            // Menambah jumlah nilai
            jumlahNilai++;

            // Menambah nomor input
            nomor++;

        } while (true);

        System.out.println();
        System.out.println("===== HASIL REKAP =====");
        System.out.println("Nilai sah   : " + jumlahNilai);

        if (jumlahNilai > 0) {

            double rata = total / jumlahNilai;

            String status = rata >= 60
                    ? "LULUS"
                    : "TIDAK LULUS";

            System.out.println("Rata-rata   : " + String.format("%.2f", rata));
            System.out.println("Status      : " + status);

        } else {

            System.out.println("Rata-rata   : 0,00");
            System.out.println("Status      : TIDAK LULUS");
        }

        scanner.close();
    }
}