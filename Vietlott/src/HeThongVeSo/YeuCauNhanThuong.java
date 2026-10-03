package HeThongVeSo;

import java.time.LocalDateTime;
import TrangThai.TrangThaiNhanThuong;

public class YeuCauNhanThuong {
    private String maYeuCau;
    private KetQuaTrungThuong ketQuaTrungThuong;
    private LocalDateTime thoiGianYeuCau;
    private long soTienYeuCau;
    private TrangThaiNhanThuong trangThai;

    public boolean taoYeuCau() {
        return false;
    }
    public boolean huyYeuCau() {
        return false;
    }
    public boolean coTheXuLy() {
        return false;
    }
}
