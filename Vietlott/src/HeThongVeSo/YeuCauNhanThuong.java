package HeThongVeSo;

import java.time.LocalDateTime;

import TrangThai.TrangThaiNhanThuong;

public class YeuCauNhanThuong {
    private String maYeuCau;
    private KetQuaTrungThuong ketQuaTrungThuong;
    private LocalDateTime thoiGianYeuCau;
    private long soTienYeuCau;
    private TrangThaiNhanThuong trangThai;

    public YeuCauNhanThuong(String maYeuCau,KetQuaTrungThuong ketQuaTrungThuong) {
        this.maYeuCau = maYeuCau;
        this.ketQuaTrungThuong = ketQuaTrungThuong;
        this.trangThai = null;
    }
    public boolean taoYeuCau() {
        if (ketQuaTrungThuong == null) {
            return false;
        }
        if (!ketQuaTrungThuong.coTheNhanThuong()) {
            return false;
        }
        soTienYeuCau = ketQuaTrungThuong.tinhSoTienDuKien();
        if (soTienYeuCau <= 0) {
            return false;
        }
        if (trangThai != null) {
            return false;
        }
        trangThai = TrangThaiNhanThuong.CHO_XU_LY;
        thoiGianYeuCau = LocalDateTime.now();
        return true;
    }
    public boolean xacNhanHoSo() {
        if (trangThai == TrangThaiNhanThuong.CHO_XU_LY) {
            trangThai = TrangThaiNhanThuong.DA_XAC_MINH;
            return true;
        }
        return false;
    }
    public boolean duyetYeuCau() {
        if (trangThai == TrangThaiNhanThuong.DA_XAC_MINH) {
            trangThai = TrangThaiNhanThuong.DA_DUYET;
            return true;
        }
        return false;
    }
    public boolean huyYeuCau() {
        if (trangThai == TrangThaiNhanThuong.CHO_XU_LY || trangThai == TrangThaiNhanThuong.DA_XAC_MINH) {
            trangThai = TrangThaiNhanThuong.TU_CHOI;
            return true;
        }
        return false;
    }
    public boolean coTheXuLy() {
        return trangThai == TrangThaiNhanThuong.CHO_XU_LY;
    }
    public long getSoTienYeuCau() {
        return soTienYeuCau;
    }
    public TrangThaiNhanThuong getTrangThai() {
        return trangThai;
    }
    public KetQuaTrungThuong getKetQuaTrungThuong() {
        return ketQuaTrungThuong;
    }
}
