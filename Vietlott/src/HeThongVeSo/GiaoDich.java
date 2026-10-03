package HeThongVeSo;
import java.time.LocalDateTime;
import java.util.List;
import TrangThai.TrangThaiGiaoDich;

public class GiaoDich {
    private String maGiaoDich;
    private DiemBan diemBan;
    private LocalDateTime thoiGianGiaoDich;
    private long tongTien;
    private TrangThaiGiaoDich trangThai;
    private List<ChiTietGiaoDich> danhSachChiTiet;

    public boolean themChiTiet(ChiTietGiaoDich chiTiet) {
        return false;
    }

    public long tinhTongTien() {
        return 0;
    }

    public boolean huyGiaoDich() {
        return false;
    }
}
