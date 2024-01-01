// Class untuk pendaftaran pengguna
class PendaftaranPengguna {
    private String email;
    private String password;

    public PendaftaranPengguna(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void verifikasiEmail() {
        // Implementasi verifikasi email
        System.out.println("Email berhasil diverifikasi");
    }
}