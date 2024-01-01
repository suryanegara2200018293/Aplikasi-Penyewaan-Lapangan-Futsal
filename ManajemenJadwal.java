import java.util.ArrayList;
import java.util.List;
class ManajemenJadwal {
    private List<String> jadwalLapangan;

    public ManajemenJadwal() {
        this.jadwalLapangan = new ArrayList<>();
        // Inisialisasi jadwal lapangan (bisa dari database atau input admin)
        jadwalLapangan.add("2024-01-01:09:00");
        jadwalLapangan.add("2024-01-01:10:00");
        // ...
    }

    public void tambahJadwal(String tanggal, String jam) {
        // Implementasi penambahan jadwal lapangan
        jadwalLapangan.add(tanggal + ":" + jam);
        System.out.println("Jadwal lapangan berhasil ditambahkan pada " + tanggal + " jam " + jam);
    }

    public void hapusJadwal(String tanggal, String jam) {
        // Implementasi penghapusan jadwal lapangan
        jadwalLapangan.remove(tanggal + ":" + jam);
        System.out.println("Jadwal lapangan berhasil dihapus pada " + tanggal + " jam " + jam);
    }

    public void tampilkanJadwal() {
        // Implementasi menampilkan jadwal lapangan
        System.out.println("Jadwal Lapangan Futsal:");
        for (String jadwal : jadwalLapangan) {
            System.out.println(jadwal);
        }
    }
}

