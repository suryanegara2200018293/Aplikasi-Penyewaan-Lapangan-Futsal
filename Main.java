import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class AplikasiSewaLapanganFutsal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh penggunaan class dan method
        System.out.println("Selamat datang di Aplikasi Penyewaan Lapangan Futsal");

        // Pendaftaran Pengguna
        System.out.print("Masukkan email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        PendaftaranPengguna pengguna = new PendaftaranPengguna(email, password);
        pengguna.verifikasiEmail();

        // Manajemen Jadwal
        ManajemenJadwal manajemenJadwal = new ManajemenJadwal();
        manajemenJadwal.tambahJadwal("2024-01-01", "11:00");
        manajemenJadwal.tampilkanJadwal();

        // Penyewaan Lapangan
        System.out.print("Masukkan tanggal pemesanan (format: YYYY-MM-DD): ");
        String tanggalPemesanan = scanner.nextLine();
        System.out.print("Masukkan jam pemesanan (format: HH:mm): ");
        String jamPemesanan = scanner.nextLine();

        PenyewaanLapanganFutsal pesanLapangan = new PenyewaanLapanganFutsal("Mahasiswa1", tanggalPemesanan, jamPemesanan);
        pesanLapangan.pesanLapangan();
        pesanLapangan.batasKonfirmasiPembayaran();

        // Konfirmasi Pembayaran
        System.out.print("Apakah Anda ingin melakukan konfirmasi pembayaran? (y/n): ");
        String konfirmasiPembayaran = scanner.nextLine();
        if (konfirmasiPembayaran.equalsIgnoreCase("y")) {
            pesanLapangan.konfirmasiPembayaran();
        }

        // Pembatalan Pemesanan
        System.out.print("Apakah Anda ingin membatalkan pemesanan? (y/n): ");
        String batalkanPemesanan = scanner.nextLine();
        if (batalkanPemesanan.equalsIgnoreCase("y")) {
            pesanLapangan.batalPemesanan();
        }
    }
}