package HeThongVeSo;

import TrangThai.TrangThaiDaiLy;

public class DaiLy {
    private String maDaiLy;
    private String tenDaiLy;
    private String diaChi;
    private String soDienThoai;
    private TrangThaiDaiLy trangThai;

    public DaiLy(String maDaiLy, String tenDaiLy, String diaChi,String soDienThoai, TrangThaiDaiLy trangThai) {
        this.maDaiLy = maDaiLy;
        this.tenDaiLy = tenDaiLy;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
    }
    public boolean kichHoat() {
        if (trangThai == TrangThaiDaiLy.TAM_NGUNG) {
            trangThai = TrangThaiDaiLy.DANG_HOAT_DONG;
            return true;
        }
        return false;
    }
    public boolean tamNgung() {
        if (trangThai == TrangThaiDaiLy.DANG_HOAT_DONG) {
            trangThai = TrangThaiDaiLy.TAM_NGUNG;
            return true;
        }
        return false;
    }
    public boolean ngungHoatDong() {
        if (trangThai == TrangThaiDaiLy.DANG_HOAT_DONG || trangThai == TrangThaiDaiLy.TAM_NGUNG) {
            trangThai = TrangThaiDaiLy.NGUNG_HOAT_DONG;
            return true;
        }
        return false;
    }
    public TrangThaiDaiLy getTrangThai() {
        return trangThai;
    }
}
