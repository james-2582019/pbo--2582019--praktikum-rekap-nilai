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

            if (nilai == SELESAI) {
                break;
            }

            // Cek apakah nilai berada di luar 0-100
            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0..100");
                continue;
            }
            if (nilai < 0 || nilai > 100) {
                System.out.println("  nilai maksimal 100... lawak kali");
                continue;
            }

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

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default  -> "Tidak Lulus";

            };
        } while (true);
    }
}