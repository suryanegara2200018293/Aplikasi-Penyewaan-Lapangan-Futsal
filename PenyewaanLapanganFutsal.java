public class PenyewaanLapanganFutsal extends PenyewaanLapangan {
    private boolean pembayaranBerhasil;

    public PenyewaanLapanganFutsal(String namaPemesan, String tanggal, String jam) {
        super(namaPemesan, tanggal, jam);
        this.pembayaranBerhasil = false;
    }

    @Override
    public void pesanLapangan() {
        // Implementasi pemesanan lapangan futsal
        System.out.println("Lapangan Futsal berhasil dipesan oleh " + namaPemesan +
                " pada tanggal " + tanggal + " jam " + jam);
    }

    @Override
    public void batasKonfirmasiPembayaran() {
        // Implementasi batas waktu konfirmasi pembayaran
        System.out.println("Pembayaran harus dikonfirmasi dalam waktu tertentu setelah pemesanan");
    }

    @Override
    public void konfirmasiPembayaran() {
        // Implementasi konfirmasi pembayaran
        this.pembayaranBerhasil = true;
        System.out.println("Konfirmasi pembayaran berhasil");
    }

    @Override
    public void batalPemesanan() {
        // Implementasi pembatalan pemesanan
        if (pembayaranBerhasil) {
            System.out.println("Pemesanan tidak dapat dibatalkan setelah pembayaran berhasil");
        } else {
            System.out.println("Pemesanan lapangan Futsal dibatalkan oleh " + namaPemesan);
        }
    }
}
