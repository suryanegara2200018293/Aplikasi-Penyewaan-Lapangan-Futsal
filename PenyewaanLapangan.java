abstract class PenyewaanLapangan implements Pembayaran {
    protected String namaPemesan;
    protected String tanggal;
    protected String jam;

    public PenyewaanLapangan(String namaPemesan, String tanggal, String jam) {
        this.namaPemesan = namaPemesan;
        this.tanggal = tanggal;
        this.jam = jam;
    }

    public abstract void pesanLapangan();

    public abstract void batasKonfirmasiPembayaran();

    public abstract void batalPemesanan();
}
