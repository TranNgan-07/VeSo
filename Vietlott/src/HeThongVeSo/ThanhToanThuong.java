package HeThongVeSo;
import java.time.LocalDateTime;
import TrangThai.TrangThaiThanhToan;

public class ThanhToanThuong {
    private String maThanhToan;
    private YeuCauNhanThuong yeuCauNhanThuong;
    private long soTienThanhToan;
    private LocalDateTime thoiGianThanhToan;
    private String phuongThucThanhToan;
    private TrangThaiThanhToan trangThai;

    public boolean thucHienThanhToan() {
        return false;
    }

    public boolean huyThanhToan() {
        return false;
    }

    public boolean daThanhToan() {
        return false;
    }
}
