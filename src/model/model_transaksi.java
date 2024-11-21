
package model;

public class model_transaksi {
    private String id_transaksi;
    private model_unit jns_unit;
    private String kartu_identitas;
    private String nama_pelanggan;
    private String waktu;
    private String jumlah;
    private String total;
    private String tanggal_pinjam;

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public model_unit getJns_unit() {
        return jns_unit;
    }

    public void setJns_unit(model_unit jns_unit) {
        this.jns_unit = jns_unit;
    }

    public String getKartu_identitas() {
        return kartu_identitas;
    }

    public void setKartu_identitas(String kartu_identitas) {
        this.kartu_identitas = kartu_identitas;
    }

    public String getnama_pelanggan() {
        return nama_pelanggan;
    }

    public void setnama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

}
