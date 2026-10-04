package HeThongVeSo;

public class ChiTietGiaoDich {
    private String maChiTiet;
    private VeSo veSo;
    private long donGia;
    private long thanhTien;

    public ChiTietGiaoDich(String maChiTiet, VeSo veSo, long donGia) {
        this.maChiTiet = maChiTiet;
        this.veSo = veSo;
        this.donGia = donGia;
    }
    public long tinhThanhTien() {
        if (veSo == null || donGia <= 0) {
            thanhTien = 0;
            return 0;
        }
        thanhTien = donGia;
        return thanhTien;
    }
    public VeSo getVeSo() {
        return veSo;
    }
    public long getDonGia() {
        return donGia;
    }
    public long getThanhTien() {
        return thanhTien;
    }
}
