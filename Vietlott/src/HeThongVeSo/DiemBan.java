package HeThongVeSo;

import TrangThai.TrangThaiDiemBan;

public class DiemBan {
    private String maDiemBan;
    private String tenDiemBan;
    private String diaChi;
    private String soDienThoai;
    private DaiLy daiLy;
    private TrangThaiDiemBan trangThai;

    public DiemBan(String maDiemBan, String tenDiemBan,String diaChi, String soDienThoai,DaiLy daiLy, TrangThaiDiemBan trangThai) {
        this.maDiemBan = maDiemBan;
        this.tenDiemBan = tenDiemBan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.daiLy = daiLy;
        this.trangThai = trangThai;
    }
    public boolean kichHoat() {
        if (trangThai == TrangThaiDiemBan.TAM_NGUNG) {
            trangThai = TrangThaiDiemBan.DANG_HOAT_DONG;
            return true;
        }
        return false;
    }
    public boolean tamNgung() {
        if (trangThai == TrangThaiDiemBan.DANG_HOAT_DONG) {
            trangThai = TrangThaiDiemBan.TAM_NGUNG;
            return true;
        }
        return false;
    }
    public boolean ngungHoatDong() {
        if (trangThai == TrangThaiDiemBan.DANG_HOAT_DONG || trangThai == TrangThaiDiemBan.TAM_NGUNG) {
            trangThai = TrangThaiDiemBan.NGUNG_HOAT_DONG;
            return true;
        }
        return false;
    }
    public boolean coTheBanVe() {
        if (trangThai != TrangThaiDiemBan.DANG_HOAT_DONG) {
            return false;
        }
        return daiLy != null
                && daiLy.getTrangThai()
                   == TrangThai.TrangThaiDaiLy.DANG_HOAT_DONG;
    }
    public TrangThaiDiemBan getTrangThai() {
        return trangThai;
    }
    public DaiLy getDaiLy() {
        return daiLy;
    }
}
