package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiThanhToan;
import TrangThai.TrangThaiNhanThuong;

public class ThanhToanThuong {
    private String maThanhToan;
    private YeuCauNhanThuong yeuCauNhanThuong;
    private long soTienThanhToan;
    private LocalDateTime thoiGianThanhToan;
    private String phuongThucThanhToan;
    private TrangThaiThanhToan trangThai;

    public ThanhToanThuong(String maThanhToan,YeuCauNhanThuong yeuCauNhanThuong,String phuongThucThanhToan) {
        this.maThanhToan = maThanhToan;
        this.yeuCauNhanThuong = yeuCauNhanThuong;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.trangThai = TrangThaiThanhToan.CHO_THANH_TOAN;
    }
    public boolean thucHienThanhToan() {
        if (yeuCauNhanThuong == null) {
            return false;
        }
        if (yeuCauNhanThuong.getTrangThai() != TrangThaiNhanThuong.DA_DUYET) {
            return false;
        }
        if (trangThai != TrangThaiThanhToan.CHO_THANH_TOAN) {
            return false;
        }
        if (phuongThucThanhToan.trim().isEmpty()) {
            return false;
        }
        soTienThanhToan = yeuCauNhanThuong.getSoTienYeuCau();

        if (soTienThanhToan <= 0) {
            trangThai = TrangThaiThanhToan.THAT_BAI;
            return false;
        }
        trangThai = TrangThaiThanhToan.DA_THANH_TOAN;
        thoiGianThanhToan = LocalDateTime.now();
        return true;
    }
    public boolean huyThanhToan() {
        if (trangThai == TrangThaiThanhToan.DA_THANH_TOAN || trangThai == TrangThaiThanhToan.DA_HUY) {
            return false;
        }
        trangThai = TrangThaiThanhToan.DA_HUY;
        return true;
    }
    public boolean daThanhToan() {
        return trangThai == TrangThaiThanhToan.DA_THANH_TOAN;
    }
    public long getSoTienThanhToan() {
        return soTienThanhToan;
    }
    public TrangThaiThanhToan getTrangThai() {
        return trangThai;
    }
}
